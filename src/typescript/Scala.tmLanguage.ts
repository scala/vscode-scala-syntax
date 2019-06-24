"use strict";
import { TmLanguage } from "./TMLanguageModel";

const upperLetterChars = "A-Z\\p{Lt}\\p{Lu}"
const upperLetter = `[${upperLetterChars}]`
const lowerLetterChars = "_a-z\\$\\p{Lo}\\p{Nl}\\p{Ll}"
const lowerLetter = `[${lowerLetterChars}]`
const letterChars = `${upperLetterChars}${lowerLetterChars}`
const letter = `[${letterChars}]`
const letterOrDigitChars = `${letterChars}0-9`
const letterOrDigit = `[${letterOrDigitChars}]`
const alphaId = `${letter}+`
const simpleInterpolatedVariable  = `${letter}${letterOrDigit}*` // see SIP-11 https://docs.scala-lang.org/sips/string-interpolation.html
const opchar = `[!#%&*+\\-\\/:<>=?@^|~\\p{Sm}\\p{So}]`
const idrest = `${letter}${letterOrDigit}*(?:(?<=_)${opchar}+)?`
const idUpper = `${upperLetter}${letterOrDigit}*(?:(?<=_)${opchar}+)?`
const idLower = `${lowerLetter}${letterOrDigit}*(?:(?<=_)${opchar}+)?`
const plainid = `(?:${idrest}|${opchar}+)`
const backQuotedId = "`[^`]+`"


export const scalaTmLanguage: TmLanguage = {
  fileTypes: [
    'scala'
  ],
  firstLineMatch: '^#!/.*\\b\\w*scala\\b',
  foldingStartMarker: '/\\*\\*|\\{\\s*$',
  foldingStopMarker: '\\*\\*/|^\\s*\\}',
  keyEquivalent: '^~S',
  repository: {
    'empty-parentheses': {
      match: '(\\(\\))',
      captures: {
        '1': {
          name: 'meta.bracket.scala'
        }
      },
      name: 'meta.parentheses.scala'
    },
    imports: {
      end: '(?<=[\\n;])',
      begin: '\\b(import)\\s+',
      beginCaptures: {
        '1': {
          name: 'keyword.other.import.scala'
        }
      },
      patterns: [
        {
          include: '#comments'
        },
        {
          match: `(${backQuotedId}|${plainid})`,
          name: 'entity.name.import.scala'
        },
        {
          match: '\\.',
          name: 'punctuation.definition.import'
        },
        {
          end: '}',
          begin: '{',
          beginCaptures: {
            '0': {
              name: 'meta.bracket.scala'
            }
          },
          patterns: [
            {
              match: `(?x)\\s*(${backQuotedId}|${plainid})\\s*(=>)\\s*(${backQuotedId}|${plainid})\\s*`,
              captures: {
                '1': {
                  name: 'entity.name.import.renamed-from.scala'
                },
                '2': {
                  name: 'keyword.other.arrow.scala'
                },
                '3': {
                  name: 'entity.name.import.renamed-to.scala'
                }
              }
            },
            {
              match: '([^\\s.,}]+)',
              name: 'entity.name.import.scala'
            }
          ],
          endCaptures: {
            '0': {
              name: 'meta.bracket.scala'
            }
          },
          name: 'meta.import.selector.scala'
        }
      ],
      name: 'meta.import.scala'
    },
    constants: {
      patterns: [
        {
          match: '\\b(false|null|true|Nil|None)\\b',
          name: 'constant.language.scala'
        },
        {
          match: '\\b((0(x|X)[0-9a-fA-F]*)|(([0-9]+\\.[0-9]+)|(\\.[0-9]+))((e|E)(\\+|-)?[0-9]+)?|[0-9]+)([LlFfDd]|UL|ul)?\\b',
          name: 'constant.numeric.scala'
        },
        {
          match: '\\b(this|super|self)\\b',
          name: 'variable.language.scala'
        },
        {
          match: '\\b(Unit|Boolean|Byte|Char|Short|Int|Float|Long|Double)\\b',
          name: 'storage.type.primitive.scala'
        },
        {
          match: '\\b(String|Symbol)\\b',
          name: 'storage.type.scala'
        }
      ]
    },
    'script-header': {
      match: '^#!(.*)$',
      captures: {
        '1': {
          name: 'string.unquoted.shebang.scala'
        }
      },
      name: 'comment.block.shebang.scala'
    },
    code: {
      patterns: [
        {
          include: '#script-header'
        },
        {
          include: '#storage-modifiers'
        },
        {
          include: '#declarations'
        },
        {
          include: '#inheritance'
        },
        {
          include: '#imports'
        },
        {
          include: '#comments'
        },
        {
          include: '#strings'
        },
        {
          include: '#initialization'
        },
        {
          include: '#xml-literal'
        },
        {
          include: '#keywords'
        },
        {
          include: '#constants'
        },
        {
          include: '#scala-symbol'
        },
        {
          include: '#scala-quoted'
        },
        {
          include: '#char-literal'
        },
        {
          include: '#empty-parentheses'
        },
        {
          include: '#parameter-list'
        },
        {
          include: '#qualifiedClassName'
        },
        {
          include: '#meta-brackets'
        },
        {
          include: '#meta-bounds'
        },
        {
          include: '#meta-colons'
        }
      ]
    },
    strings: {
      patterns: [
        {
          end: '"""(?!")',
          begin: '"""',
          beginCaptures: {
            '0': {
              name: 'punctuation.definition.string.begin.scala'
            }
          },
          patterns: [
            {
              match: '\\\\\\\\|\\\\u[0-9A-Fa-f]{4}',
              name: 'constant.character.escape.scala'
            }
          ],
          endCaptures: {
            '0': {
              name: 'punctuation.definition.string.end.scala'
            }
          },
          name: 'string.quoted.triple.scala'
        },
        {
          begin: `\\b(${alphaId})(""")`,
          end: '"""(?!")',
          beginCaptures: {
            '1': {
              name: 'keyword.interpolation.scala'
            },
            '2': {
              name: 'string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala'
            }
          },
          patterns: [
            {
              "include": "#string-interpolation"
            },
            {
              match: '\\\\\\\\|\\\\u[0-9A-Fa-f]{4}',
              name: 'constant.character.escape.scala'
            },
            {
              match: '.',
              name: 'string.quoted.triple.interpolated.scala'
            }
          ],
          endCaptures: {
            '0': {
              name: 'string.quoted.triple.interpolated.scala punctuation.definition.string.end.scala'
            }
          }
        },
        {
          end: '"',
          begin: '"',
          beginCaptures: {
            '0': {
              name: 'punctuation.definition.string.begin.scala'
            }
          },
          patterns: [
            {
              match: `\\\\(?:[btnfr\\\\"']|[0-7]{1,3}|u[0-9A-Fa-f]{4})`,
              name: 'constant.character.escape.scala'
            },
            {
              match: '\\\\.',
              name: 'invalid.illegal.unrecognized-string-escape.scala'
            }
          ],
          endCaptures: {
            '0': {
              name: 'punctuation.definition.string.end.scala'
            }
          },
          name: 'string.quoted.double.scala'
        },
        {
          begin: `\\b(${alphaId})(")`,
          end: '"',
          beginCaptures: {
            '1': {
              name: 'keyword.interpolation.scala'
            },
            '2': {
              name: 'string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala'
            }
          },
          patterns: [
            {
              include: "#string-interpolation"
            },
            {
              match: `\\\\(?:[btnfr\\\\"']|[0-7]{1,3}|u[0-9A-Fa-f]{4})`,
              name: 'constant.character.escape.scala'
            },
            {
              match: '\\\\.',
              name: 'invalid.illegal.unrecognized-string-escape.scala'
            },
            {
              match: '.',
              name: 'string.quoted.double.interpolated.scala'
            }
          ],
          endCaptures: {
            '0': {
              name: 'string.quoted.double.interpolated.scala punctuation.definition.string.end.scala'
            }
          }
        }
      ]
    },
    'string-interpolation': {
      patterns: [
        {
          name: "constant.character.escape.interpolation.scala",
          match: "\\$\\$"
        },
        {
          match: `(\\$)(${simpleInterpolatedVariable})`,
          captures: {
            "1": {
              name: "punctuation.definition.template-expression.begin.scala"
            }
          }
        },
        {
            name: "punctuation.definition.template-expression.scala",
            begin: "\\$\\{",
            beginCaptures: { "0": { name: "punctuation.definition.template-expression.begin.scala" } },
            end: "\\}",
            endCaptures: { "0": { name: "punctuation.definition.template-expression.end.scala" } },
            patterns: [
                {
                    include: "#code"
                }
            ]
        }
      ]
    },
    'xml-entity': {
      match: '(&)([:a-zA-Z_][:a-zA-Z0-9_.-]*|#[0-9]+|#x[0-9a-fA-F]+)(;)',
      captures: {
        '1': {
          name: 'punctuation.definition.constant.xml'
        },
        '3': {
          name: 'punctuation.definition.constant.xml'
        }
      },
      name: 'constant.character.entity.xml'
    },
    'xml-singlequotedString': {
      end: "'",
      begin: "'",
      beginCaptures: {
        '0': {
          name: 'punctuation.definition.string.begin.xml'
        }
      },
      patterns: [
        {
          include: '#xml-entity'
        }
      ],
      endCaptures: {
        '0': {
          name: 'punctuation.definition.string.end.xml'
        }
      },
      name: 'string.quoted.single.xml'
    },
    'meta-colons': {
      patterns: [
        {
          match: '(?<!:):(?!:)',
          name: 'meta.colon.scala'
        }
      ],
      comment: 'For themes: Matching type colons'
    },
    keywords: {
      patterns: [
        {
          match: '\\b(return|throw)\\b',
          name: 'keyword.control.flow.jump.scala'
        },
        {
          match: '\\b(classOf|isInstanceOf|asInstanceOf)\\b',
          name: 'support.function.type-of.scala'
        },
        {
          match: '\\b(else|if|do|while|for|yield|match|case)\\b',
          name: 'keyword.control.flow.scala'
        },
        {
          match: '\\b(catch|finally|try)\\b',
          name: 'keyword.control.exception.scala'
        },
        {
          match: '(==?|!=|<=|>=|<>|<|>)',
          name: 'keyword.operator.comparison.scala'
        },
        {
          match: '(\\-|\\+|\\*|/(?![/*])|%|~)',
          name: 'keyword.operator.arithmetic.scala'
        },
        {
          match: '(!|&&|\\|\\|)',
          name: 'keyword.operator.logical.scala'
        },
        {
          match: '(<-|←|->|→|=>|⇒|\\?|\\:+|@|\\|)+',
          name: 'keyword.operator.scala'
        }
      ]
    },
    'scala-quoted': {
      match: "'\\{'|'\\('|'\\['|'\\{|'\\(|'\\[",
      name: 'constant.other.quoted.scala'
    },
    'xml-doublequotedString': {
      end: '"',
      begin: '"',
      beginCaptures: {
        '0': {
          name: 'punctuation.definition.string.begin.xml'
        }
      },
      patterns: [
        {
          include: '#xml-entity'
        }
      ],
      endCaptures: {
        '0': {
          name: 'punctuation.definition.string.end.xml'
        }
      },
      name: 'string.quoted.double.xml'
    },
    declarations: {
      patterns: [
        {
          match: `(?x)\\b(def)\\s+(${backQuotedId}|${plainid})`,
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'entity.name.function.declaration'
            }
          }
        },
        {
          match: '\\b(trait)\\s+([^\\s\\{\\(\\[]+)',
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'entity.name.class.declaration'
            }
          }
        },
        {
          match: '\\b(?:(case)\\s+)?(class|object)\\s+([^\\s\\{\\(\\[]+)',
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'keyword.declaration.scala'
            },
            '3': {
              name: 'entity.name.class.declaration'
            }
          }
        },
        {
          match: `\\b(type)\\s+(${backQuotedId}|${plainid})`,
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'entity.name.type.declaration'
            }
          }
        },
        {
          match: `\\b(val)\\s+(${idUpper})\\b`,
          captures: {
            '1': {
              name: 'keyword.declaration.stable.scala'
            }
            ,
            '2': {
              name: 'constant.other.declaration.scala'
            }
          }
        },
        {
          match: `\\b(?:(val)|(var))\\s+(?:(${backQuotedId}|${plainid})|(?=\\())`,
          captures: {
            '1': {
              name: 'keyword.declaration.stable.scala'
            },
            '2': {
              name: 'keyword.declaration.volatile.scala'
            },
            '3': {
              name: 'variable.other.declaration.scala'
            }
          }
        },
        {
          match: '\\b(package)\\s+(object)\\s+([^\\s\\{\\(\\[]+)',
          captures: {
            '1': {
              name: 'keyword.other.scoping.scala'
            },
            '2': {
              name: 'keyword.declaration.scala'
            },
            '3': {
              name: 'entity.name.class.declaration'
            }
          }
        },
        {
          end: '(?<=[\\n;])',
          begin: '\\b(package)\\s+',
          beginCaptures: {
            '1': {
              name: 'keyword.other.import.scala'
            }
          },
          patterns: [
            {
              include: '#comments'
            },
            {
              match: `(${backQuotedId}|${plainid})`,
              name: 'entity.name.package.scala'
            },
            {
              match: '\\.',
              name: 'punctuation.definition.package'
            }
          ],
          name: 'meta.package.scala'
        }
      ]
    },
    'char-literal': {
      end: "'",
      begin: "'",
      beginCaptures: {
        '0': {
          name: 'punctuation.definition.character.begin.scala'
        }
      },
      patterns: [
        {
          match: `\\\\(?:[btnfr\\\\"']|[0-7]{1,3}|u[0-9A-Fa-f]{4})`,
          name: 'constant.character.escape.scala'
        },
        {
          match: '\\\\.',
          name: 'invalid.illegal.unrecognized-character-escape.scala'
        },
        {
          match: "[^']{2,}",
          name: 'invalid.illegal.character-literal-too-long'
        },
        {
          match: "(?<!')[^']",
          name: 'invalid.illegal.character-literal-too-long'
        }
      ],
      endCaptures: {
        '0': {
          name: 'punctuation.definition.character.end.scala'
        }
      },
      name: 'constant.character.literal.scala'
    },
    initialization: {
      match: '\\b(new)\\s+([^\\s,\\{\\}\\(\\)\\[\\]]+)',
      captures: {
        '1': {
          name: 'keyword.declaration.scala'
        },
        '2': {
          name: 'entity.name.class'
        }
      }
    },
    'scala-symbol': {
      match: `(?>'${plainid})(?!')`,
      name: 'constant.other.symbol.scala'
    },
    'meta-brackets': {
      patterns: [
        {
          match: '\\{',
          comment: 'The punctuation.section.*.begin is needed for return snippet in source bundle',
          name: 'punctuation.section.block.begin.scala'
        },
        {
          match: '\\}',
          comment: 'The punctuation.section.*.end is needed for return snippet in source bundle',
          name: 'punctuation.section.block.end.scala'
        },
        {
          match: '{|}|\\(|\\)|\\[|\\]',
          name: 'meta.bracket.scala'
        }
      ],
      comment: 'For themes: Brackets look nice when colored.'
    },
    qualifiedClassName: {
      match: '(\\b([A-Z][\\w]*))',
      captures: {
        '1': {
          name: 'entity.name.class'
        }
      }
    },
    'storage-modifiers': {
      patterns: [
        {
          match: '\\b(private\\[\\S+\\]|protected\\[\\S+\\]|private|protected)\\b',
          name: 'storage.modifier.access'
        },
        {
          match: '\\b(synchronized|@volatile|abstract|final|lazy|sealed|implicit|override|@transient|@native)\\b',
          name: 'storage.modifier.other'
        }
      ]
    },
    'meta-bounds': {
      match: '<%|=:=|<:<|<%<|>:|<:',
      comment: 'For themes: Matching view bounds',
      name: 'meta.bounds.scala'
    },
    comments: {
      patterns: [
        {
          match: '/\\*\\*/',
          captures: {
            '0': {
              name: 'punctuation.definition.comment.scala'
            }
          },
          name: 'comment.block.empty.scala'
        },
        {
          end: '\\*/',
          begin: '^\\s*(/\\*\\*)(?!/)',
          beginCaptures: {
            '1': {
              name: 'punctuation.definition.comment.scala'
            }
          },
          patterns: [
            {
              match: '(@param)\\s+(\\S+)',
              captures: {
                '1': {
                  name: 'keyword.other.documentation.scaladoc.scala'
                },
                '2': {
                  name: 'variable.parameter.scala'
                }
              }
            },
            {
              match: '(@(?:tparam|throws))\\s+(\\S+)',
              captures: {
                '1': {
                  name: 'keyword.other.documentation.scaladoc.scala'
                },
                '2': {
                  name: 'entity.name.class'
                }
              }
            },
            {
              match: '@(return|see|note|example|constructor|usecase|author|version|since|todo|deprecated|migration|define|inheritdoc)\\b',
              name: 'keyword.other.documentation.scaladoc.scala'
            },
            {
              match: '(\\[\\[)([^\\]]+)(\\]\\])',
              captures: {
                '1': {
                  name: 'punctuation.definition.documentation.link.scala'
                },
                '2': {
                  name: 'string.other.link.title.markdown'
                },
                '3': {
                  name: 'punctuation.definition.documentation.link.scala'
                }
              }
            },
            {
              "include": "#comments"
            }
          ],
          endCaptures: {
            '0': {
              name: 'punctuation.definition.comment.scala'
            }
          },
          name: 'comment.block.documentation.scala'
        },
        {
          end: '\\*/',
          begin: '/\\*',
          captures: {
            '0': {
              name: 'punctuation.definition.comment.scala'
            }
          },
          patterns: [
            {
              "include": "#comments"
            }
          ],
          name: 'comment.block.scala'
        },
        {
          end: '(?!\\G)',
          begin: '(^[ \\t]+)?(?=//)',
          beginCaptures: {
            '1': {
              name: 'punctuation.whitespace.comment.leading.scala'
            }
          },
          patterns: [
            {
              end: '\\n',
              begin: '//',
              beginCaptures: {
                '0': {
                  name: 'punctuation.definition.comment.scala'
                }
              },
              name: 'comment.line.double-slash.scala'
            }
          ]
        }
      ]
    },
    'xml-embedded-content': {
      patterns: [
        {
          end: '}',
          begin: '{',
          patterns: [
            {
              include: '#code'
            }
          ],
          captures: {
            '0': {
              name: 'meta.bracket.scala'
            }
          },
          name: 'meta.source.embedded.scala'
        },
        {
          match: ' (?:([-_a-zA-Z0-9]+)((:)))?([_a-zA-Z-]+)=',
          captures: {
            '1': {
              name: 'entity.other.attribute-name.namespace.xml'
            },
            '2': {
              name: 'entity.other.attribute-name.xml'
            },
            '3': {
              name: 'punctuation.separator.namespace.xml'
            },
            '4': {
              name: 'entity.other.attribute-name.localname.xml'
            }
          }
        },
        {
          include: '#xml-doublequotedString'
        },
        {
          include: '#xml-singlequotedString'
        }
      ]
    },
    inheritance: {
      patterns: [
        {
          match: '(extends|with)\\s+([^\\s\\{\\(\\[\\]]+)',
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'entity.other.inherited-class.scala'
            }
          }
        }
      ]
    },
    'parameter-list': {
      patterns: [
        {
          match: `(?<=[^\\._$a-zA-Z0-9])(${backQuotedId}|${idLower})\\s*(:)\\s+`,
          captures: {
            '1': {
              name: 'variable.parameter.scala'
            },
            '2': {
              name: 'meta.colon.scala'
            }
          }
        }
      ]
    },
    'xml-literal': {
      patterns: [
        {
          end: '(>(<))/(?:([-_a-zA-Z0-9]+)((:)))?([-_a-zA-Z0-9:]*[_a-zA-Z0-9])(>)',
          begin: '(<)((?:([_a-zA-Z0-9][_a-zA-Z0-9]*)((:)))?([_a-zA-Z0-9][-_a-zA-Z0-9:]*))(?=(\\s[^>]*)?></\\2>)',
          beginCaptures: {
            '1': {
              name: 'punctuation.definition.tag.xml'
            },
            '3': {
              name: 'entity.name.tag.namespace.xml'
            },
            '4': {
              name: 'entity.name.tag.xml'
            },
            '5': {
              name: 'punctuation.separator.namespace.xml'
            },
            '6': {
              name: 'entity.name.tag.localname.xml'
            }
          },
          patterns: [
            {
              include: '#xml-embedded-content'
            }
          ],
          comment: 'We do not allow a tag name to start with a - since this would likely conflict with the <- operator. This is not very common for tag names anyway.  Also code such as -- if (val <val2 || val> val3) will falsly be recognized as an xml tag.  The solution is to put a space on either side of the comparison operator',
          endCaptures: {
            '1': {
              name: 'punctuation.definition.tag.xml'
            },
            '2': {
              name: 'meta.scope.between-tag-pair.xml'
            },
            '3': {
              name: 'entity.name.tag.namespace.xml'
            },
            '4': {
              name: 'entity.name.tag.xml'
            },
            '5': {
              name: 'punctuation.separator.namespace.xml'
            },
            '6': {
              name: 'entity.name.tag.localname.xml'
            },
            '7': {
              name: 'punctuation.definition.tag.xml'
            }
          },
          name: 'meta.tag.no-content.xml'
        },
        {
          end: '(/?>)',
          begin: '(</?)(?:([_a-zA-Z0-9][-_a-zA-Z0-9]*)((:)))?([_a-zA-Z0-9][-_a-zA-Z0-9:]*)(?=[^>]*?>)',
          patterns: [
            {
              include: '#xml-embedded-content'
            }
          ],
          captures: {
            '1': {
              name: 'punctuation.definition.tag.xml'
            },
            '2': {
              name: 'entity.name.tag.namespace.xml'
            },
            '3': {
              name: 'entity.name.tag.xml'
            },
            '4': {
              name: 'punctuation.separator.namespace.xml'
            },
            '5': {
              name: 'entity.name.tag.localname.xml'
            }
          },
          name: 'meta.tag.xml'
        },
        {
          include: '#xml-entity'
        }
      ]
    }
  },
  uuid: '158C0929-299A-40C8-8D89-316BE0C446E8',
  patterns: [
    {
      include: '#code'
    }
  ],
  name: 'Scala',
  scopeName: 'source.scala'
}

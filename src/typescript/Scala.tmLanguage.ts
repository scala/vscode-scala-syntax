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
const letterOrDigitNoDollarSign = letterOrDigit.replace("\\$", "")
const simpleInterpolatedVariable  = `${letter}${letterOrDigitNoDollarSign}*` // see SIP-11 https://docs.scala-lang.org/sips/string-interpolation.html
const opchar = `[!#%&*+\\-\\/:<>=?@^|~\\p{Sm}\\p{So}]`
const idrest = `${letter}${letterOrDigit}*(?:(?<=_)${opchar}+)?`
const idUpper = `${upperLetter}${letterOrDigit}*(?:(?<=_)${opchar}+)?`
const idLower = `${lowerLetter}${letterOrDigit}*(?:(?<=_)${opchar}+)?`
const plainid = `(?:${idrest}|${opchar}+)`
const interpolatorid = `(?:${letter}${letterOrDigit}*(?:(?<=_)${opchar}+)?)`
const backQuotedId = "`[^`]+`"
const anyId = `(?:${plainid}|${backQuotedId})`
const endOfLineMaybeWithComment = "(?=\\s*(//.*|/\\*(?!.*\\*/\\s*\\S.*).*)?$)"
const notStartOfComment = "(?!//|/\\*)"

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
          match: '\\b(given)\\b',
          name: 'keyword.other.import.given.scala'
        },
        {
          match: '\\s(as)\\s',
          name: 'keyword.other.import.as.scala'
        },
        {
          match: idUpper,
          name: 'entity.name.class.import.scala'
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
              match: `(?x)(given\\s)?\\s*(?:(${idUpper})|(${backQuotedId}|${plainid}))\\s*(=>)\\s*(?:(${idUpper})|(${backQuotedId}|${plainid}))\\s*`,
              captures: {
                '1': {
                  name: 'keyword.other.import.given.scala'
                },
                '2': {
                  name: 'entity.name.class.import.renamed-from.scala'
                },
                '3': {
                  name: 'entity.name.import.renamed-from.scala'
                },
                '4': {
                  name: 'keyword.other.arrow.scala'
                },
                '5': {
                  name: 'entity.name.class.import.renamed-to.scala'
                },
                '6': {
                  name: 'entity.name.import.renamed-to.scala'
                }
              }
            },
            {
              match: '\\b(given)\\b',
              name: 'keyword.other.import.given.scala'
            },
            {
              match: `(given\\s+)?(?:(${idUpper})|(${backQuotedId}|${plainid}))`,
              captures: {
                '1': {
                  name: 'keyword.other.import.given.scala'
                },
                '2': {
                  name: 'entity.name.class.import.scala'
                },
                '3': {
                  name: 'entity.name.import.scala'
                }
              }
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
    exports: {
      end: '(?<=[\\n;])',
      begin: '\\b(export)\\s+',
      beginCaptures: {
        '1': {
          name: 'keyword.other.export.scala'
        }
      },
      patterns: [
        {
          include: '#comments'
        },
        {
          match: '\\b(given)\\b',
          name: 'keyword.other.export.given.scala'
        },
        {
          match: idUpper,
          name: 'entity.name.class.export.scala'
        },
        {
          match: `(${backQuotedId}|${plainid})`,
          name: 'entity.name.export.scala'
        },
        {
          match: '\\.',
          name: 'punctuation.definition.export'
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
              match: `(?x)(given\\s)?\\s*(?:(${idUpper})|(${backQuotedId}|${plainid}))\\s*(=>)\\s*(?:(${idUpper})|(${backQuotedId}|${plainid}))\\s*`,
              captures: {
                '1': {
                  name: 'keyword.other.export.given.scala'
                },
                '2': {
                  name: 'entity.name.class.export.renamed-from.scala'
                },
                '3': {
                  name: 'entity.name.export.renamed-from.scala'
                },
                '4': {
                  name: 'keyword.other.arrow.scala'
                },
                '5': {
                  name: 'entity.name.class.export.renamed-to.scala'
                },
                '6': {
                  name: 'entity.name.export.renamed-to.scala'
                }
              }
            },
            {
              match: '\\b(given)\\b',
              name: 'keyword.other.export.given.scala'
            },
            {
              match: `(given\\s+)?(?:(${idUpper})|(${backQuotedId}|${plainid}))`,
              captures: {
                '1': {
                  name: 'keyword.other.export.given.scala'
                },
                '2': {
                  name: 'entity.name.class.export.scala'
                },
                '3': {
                  name: 'entity.name.export.scala'
                }
              }
            }
          ],
          endCaptures: {
            '0': {
              name: 'meta.bracket.scala'
            }
          },
          name: 'meta.export.selector.scala'
        }
      ],
      name: 'meta.export.scala'
    },
    constants: {
      patterns: [
        {
          match: '\\b(false|null|true)\\b',
          name: 'constant.language.scala'
        },
        {
          match: '\\b(0[xX][0-9a-fA-F_]*)\\b',
          name: 'constant.numeric.scala'
        },
        {
          match: '\\b(([0-9][0-9_]*(\\.[0-9][0-9_]*)?)([eE](\\+|-)?[0-9][0-9_]*)?|[0-9][0-9_]*)[LlFfDd]?\\b',
          name: 'constant.numeric.scala'
        },
        {
          match: '(\\.[0-9][0-9_]*)([eE](\\+|-)?[0-9][0-9_]*)?[LlFfDd]?\\b',
          name: 'constant.numeric.scala'
        },
        {
          match: '\\b0[bB][01]([01_]*[01])?[Ll]?\\b',
          name: 'constant.numeric.scala'
        },
        {
          match: '\\b(this|super)\\b',
          name: 'variable.language.scala'
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
          include: '#using-directive'
        },
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
          include: '#extension'
        },
        {
          include: '#imports'
        },
        {
          include: '#exports'
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
          include: '#using'
        },
        {
          include: '#constants'
        },
        {
          include: '#singleton-type'
        },
        {
          include: '#inline'
        },
        {
          include: '#scala-quoted-or-symbol'
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
          include: '#backQuotedVariable'
        },
        {
          include: '#curly-braces'
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
          begin: `\\b(raw)(""")`,
          end: `(""")(?!")|\\$\n|(\\$[^\\$"_{${letterChars}])`,
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
              match: "\\$[\\$\"]",
              name: 'constant.character.escape.scala'
            },
            {
              "include": "#string-interpolation"
            },
            {
              match: '.',
              name: 'string.quoted.triple.interpolated.scala'
            }
          ],
          endCaptures: {
            '1': {
              name: 'string.quoted.triple.interpolated.scala punctuation.definition.string.end.scala'
            },
            '2': {
              name: 'invalid.illegal.unrecognized-string-escape.scala'
            }
          }
        },
        {
          begin: `\\b(${interpolatorid})(""")`,
          end: `(""")(?!")|\\$\n|(\\$[^\\$"_{${letterChars}])`,
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
            '1': {
              name: 'string.quoted.triple.interpolated.scala punctuation.definition.string.end.scala'
            },
            '2': {
              name: 'invalid.illegal.unrecognized-string-escape.scala'
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
          begin: `\\b(raw)(")`,
          end: `(")|\\$\n|(\\$[^\\$"_{${letterChars}])`,
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
              match: "\\$[\\$\"]",
              name: 'constant.character.escape.scala'
            },
            {
              include: "#string-interpolation"
            },
            {
              match: '.',
              name: 'string.quoted.double.interpolated.scala'
            }
          ],
          endCaptures: {
            '1': {
              name: 'string.quoted.double.interpolated.scala punctuation.definition.string.end.scala'
            },
            '2': {
              name: 'invalid.illegal.unrecognized-string-escape.scala'
            }
          }
        },
        {
          begin: `\\b(${interpolatorid})(")`,
          end: `(")|\\$\n|(\\$[^\\$"_{${letterChars}])`,
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
              match: "\\$[\\$\"]",
              name: 'constant.character.escape.scala'
            },
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
            '1': {
              name: 'string.quoted.double.interpolated.scala punctuation.definition.string.end.scala'
            },
            '2': {
              name: 'invalid.illegal.unrecognized-string-escape.scala'
            }
          }
        }
      ]
    },
    'using': {
      patterns: [
        {
          match: `(?<=\\()\\s*(using)\\s`,
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
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
          name: "meta.template.expression.scala",
          match: `(\\$)(${simpleInterpolatedVariable})`,
          captures: {
            "1": {
              name: "punctuation.definition.template-expression.begin.scala"
            }
          }
        },
        {
            name: "meta.template.expression.scala",
            begin: "\\$\\{",
            beginCaptures: { "0": { name: "punctuation.definition.template-expression.begin.scala" } },
            end: "\\}",
            endCaptures: { "0": { name: "punctuation.definition.template-expression.end.scala" } },
            patterns: [
                {
                    include: "#code"
                }
            ],
            contentName: "meta.embedded.line.scala"
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
          match: '\\b(else|if|then|do|while|for|yield|match|case)\\b',
          name: 'keyword.control.flow.scala'
        },
        {
          match: `^\\s*(end)\\s+(if|while|for|match)${endOfLineMaybeWithComment}`,
          name: 'keyword.control.flow.end.scala'
        },
        {
          match: `^\\s*(end)\\s+(val)${endOfLineMaybeWithComment}`,
          name: 'keyword.declaration.stable.end.scala'
        },
        {
          match: `^\\s*(end)\\s+(var)${endOfLineMaybeWithComment}`,
          name: 'keyword.declaration.volatile.end.scala'
        },
        {
          match: `^\\s*(end)\\s+(?:(new|extension)|(${idUpper}))${endOfLineMaybeWithComment}`,
          captures: {
            '1': {
              name: 'keyword.declaration.end.scala'
            },
            '2': {
              name: 'keyword.declaration.end.scala'
            },
            '3': {
              name: 'entity.name.type.declaration'
            }
          }
        },
        {
          match: '\\b(catch|finally|try)\\b',
          name: 'keyword.control.exception.scala'
        },
        {
          match: `^\\s*(end)\\s+(try)${endOfLineMaybeWithComment}`,
          name: 'keyword.control.exception.end.scala'
        },
        {
          match: `^\\s*(end)\\s+(${backQuotedId}|${plainid})?${endOfLineMaybeWithComment}`,
          captures: {
            '1': {
              name: 'keyword.declaration.end.scala'
            },
            '2': {
              name: 'entity.name.declaration'
            }
          }
        },
        { // Higher precedence than other kinds of operators to prevent
          // decomposition of operators like ->
          match: `(<-|←|->|→|=>|⇒|\\?|\\:|@|\\^)+${opchar}*`,
          name: 'keyword.operator.scala'
        },
        { // The 'special' below operators directly follower by another symbol
          // are just operators for example +:, /:, ++ and ==>
          match: `(\\-|\\+|\\*|/(?![/*])|%|~|==|!=|<=|>=|<>)${opchar}+`,
          name: 'keyword.operator.scala'
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
          match: `(?<!${opchar}|_)(!|&&|\\|\\|)(?!${opchar})`,
          name: 'keyword.operator.logical.scala'
        },
        { // Lower precedence than logical || operator
          match: `(\\|)${opchar}*`,
          name: 'keyword.operator.scala'
        }
      ]
    },
    'singleton-type': {
      match: `\\.(type)(?!${idrest}|[0-9])`,
      captures: {
        '1': {
          name: 'keyword.type.scala'
        }
      }
    },
    inline: {
      patterns: [
        { // inline parameters
          match: `\\b(inline)(?=\\s+(${plainid}|${backQuotedId})\\s*:)`,
          name: 'storage.modifier.other'
        },
        {
          match: `\\b(inline)\\b(?=(?:.(?!\\b(?:val|def|given)\\b))*\\b(if|match)\\b)`,
          name: 'keyword.control.flow.scala'
        }
      ]
    },
    'scala-quoted-or-symbol': {
      patterns: [
        { // `'xyz`
          match: `(')((?>${plainid}))(?!')`,
          captures: {
            '1': {
              name: 'keyword.control.flow.staging.scala constant.other.symbol.scala'
            },
            '2': {
              name: 'constant.other.symbol.scala'
            }
          }
        },
        { // Start of `'{ .. }`
          match: `'(?=\\s*\\{(?!'))`,
          name: 'keyword.control.flow.staging.scala'
        },
        { // Start of `'[ .. ]`
          match: "'(?=\\s*\\[(?!'))",
          name: 'keyword.control.flow.staging.scala'
        },
        { // Start of `${ .. }`
          match: "\\$(?=\\s*\\{)",
          name: 'keyword.control.flow.staging.scala'
        },
      ]
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
          match: `\\b(def)\\b\\s*${notStartOfComment}(${anyId})?`,
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
          match: `\\b(trait)\\b\\s*${notStartOfComment}(${anyId})?`,
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
          match: `\\b(?:(case)\\s+)?(class|object|enum)\\b\\s*${notStartOfComment}(${anyId})?`,
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
          match: `(?<!\\.)\\b(type)\\b\\s*${notStartOfComment}(${anyId})?`,
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'entity.name.type.declaration'
            }
          }
        },
        { // val (x1, x2) = tup // val Some(x) = opt
          match: `\\b(?:(val)|(var))\\b\\s*${notStartOfComment}(?=${anyId}?\\()`,
          captures: {
            '1': {
              name: 'keyword.declaration.stable.scala'
            },
            '2': {
              name: 'keyword.declaration.volatile.scala'
            }
          }
        },
        { // val x1[, x2, x3, ...] = y
          match: `\\b(val)\\b\\s*${notStartOfComment}(${anyId}(?:\\s*,\\s*${anyId})*)?(?!\")`,
          captures: {
            '1': {
              name: 'keyword.declaration.stable.scala'
            },
            '2': {
              name: 'variable.stable.declaration.scala'
            }
          }
        },
        { // var x1[, x2, x3, ...] = y
          match: `\\b(var)\\b\\s*${notStartOfComment}(${anyId}(?:\\s*,\\s*${anyId})*)?(?!\")`,
          captures: {
            '1': {
              name: 'keyword.declaration.volatile.scala'
            },
            '2': {
              name: 'variable.volatile.declaration.scala'
            }
          }
        },
        {
          match: `\\b(package)\\s+(object)\\b\\s*${notStartOfComment}(${anyId})?`,
          captures: {
            '1': {
              name: 'keyword.other.package.scala'
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
              name: 'keyword.other.package.scala'
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
        },
        {
          match: `\\b(given)\\b\\s*(${idLower}|${backQuotedId})?`,
          captures: {
            '1': { name: 'keyword.declaration.scala' },
            '2': { name: 'entity.name.given.declaration' }
          }
        }
      ]
    },
    'char-literal': {
      patterns: [
        {
          match: "(')'(')",
          name: 'string.quoted.other constant.character.literal.scala',
          captures: {
            '1': {
              name: 'punctuation.definition.character.begin.scala'
            },
            '2': {
              name: 'punctuation.definition.character.end.scala'
            }
          }
        },
        {
          end: "'|$",
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
            },
          ],
          endCaptures: {
            '0': {
              name: 'punctuation.definition.character.end.scala'
            }
          },
          name: 'string.quoted.other constant.character.literal.scala'
        }
      ]
    },
    initialization: {
      match: '\\b(new)\\b',
      captures: {
        '1': {
          name: 'keyword.declaration.scala'
        }
      }
    },
    'curly-braces': {
      begin: '\\{',
      end: '\\}',
      beginCaptures: {
        '0': {
          name: 'punctuation.section.block.begin.scala'
        }
      },
      endCaptures: {
        '0': {
          name: 'punctuation.section.block.end.scala'
        }
      },
      patterns: [
        {
          include: '#code'
        }
      ]
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
      match: `(\\b([A-Z][\\w]*)(?:(?<=_)${opchar}+)?)`,
      captures: {
        '1': {
          name: 'entity.name.class'
        }
      }
    },
    backQuotedVariable: {
      // capture back quoted variables in code so special symbols inside them do not
      // interfere with the rest of the rules. But don't assign any extra scope, to make them
      // consistent with the rest of variables
      match: `${backQuotedId}`
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
        },
        {
          match: '(?<=^|\\s)\\b(transparent|opaque|infix|open|inline)\\b(?=[a-z\\s]*\\b(def|val|var|given|type|class|trait|object|enum)\\b)',
          name: 'storage.modifier.other'
        }
      ]
    },
    'meta-bounds': {
      match: '<%|=:=|<:<|<%<|>:|<:',
      comment: 'For themes: Matching view bounds',
      name: 'meta.bounds.scala'
    },
    'using-directive': {
      end: '\\n',
      begin: '^\\s*(//>)\\s*(using)[^\\S\\n]+(?:(\\S+))?',
      beginCaptures: {
        '1': {
          name: 'punctuation.definition.comment.scala'
        },
        '2': {
          name: 'keyword.other.import.scala'
        },
        '3': {
          patterns: [
            {
              match: `${idUpper}|${backQuotedId}|${plainid}`,
              name: 'entity.name.import.scala'
            },
            {
              match: '\\.',
              name: 'punctuation.definition.import'
            }
          ]
        }
      },
      patterns: [
        {
          include: '#constants'
        },
        {
          include: '#strings'
        },
        {
          match: `[^\\s,]+`,
          name: 'string.quoted.double.scala'
        },
      ],
      name: 'comment.line.shebang.scala'
    },
    comments: {
      patterns: [
        {
          "include": "#block-comments"
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
    'block-comments': {
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
              match: '@(return|see|note|example|constructor|usecase|author|version|since|todo|deprecated|migration|define|inheritdoc|groupname|groupprio|groupdesc|group|contentDiagram|documentable|syntax)\\b',
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
              "include": "#block-comments"
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
              "include": "#block-comments"
            }
          ],
          name: 'comment.block.scala'
        },
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
          match: `\\b(extends|with|derives)\\b\\s*(${idUpper}|${backQuotedId}|(?=\\([^\\)]+=>)|(?=${plainid})|(?="))?`,
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
            '2': {
              name: 'entity.name.class'
            }
          }
        }
      ]
    },
    extension: {
      patterns: [
        {
          match: `^\\s*(extension)\\s+(?=[\\[\\(])`,
          captures: {
            '1': {
              name: 'keyword.declaration.scala'
            },
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

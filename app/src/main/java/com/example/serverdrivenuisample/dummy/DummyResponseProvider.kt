package com.example.serverdrivenuisample.dummy

object DummyResponseProvider {

    fun mockFeaturedProductDetail(): String {
        return """
            {
              "title": "Home",
              "parentLayout": "COLUMN",
              "sections": [
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TOP_NAVBAR",
                    "title": "Featured Product with SDUI",
                    "showBack": true
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Beli Oppo A17 pakai Indodana, cicilnya mulai dari Rp 286.500 saja per bulan!",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Belinya di Blibli, berikut simulasi cicilan-nya: ",
                    "style": "BODY_MEDIUM"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TABLE",
                    "headers": [
                      "Header 1",
                      "Header 2"
                    ],
                    "data": [
                      [
                        "24 Bulan",
                        "Rp 146.500"
                      ],
                      [
                        "18 Bulan",
                        "Rp 230.000"
                      ],
                      [
                        "12 Bulan",
                        "Rp 286.500"
                      ],
                      [
                        "6 Bulan",
                        "Rp 322.500"
                      ],
                      [
                        "3 bulan",
                        "Rp 595.500"
                      ],
                      [
                        "30 Hari",
                        "Rp 1.670.500"
                      ]
                    ]
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Beli Di Blibli",
                    "buttonType": "PRIMARY",
                    "action": {
                      "action": "DEEPLINK",
                      "deeplink": "A Deeplink"
                    }
                  }
                }
              ]
            }
        """.trimIndent()
    }

    fun mockFeaturedProductWithoutTopNavbar(): String {
        return """
            {
              "title": "Home",
              "parentLayout": "COLUMN",
              "sections": [
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "This is Featured Product Without Top Navigation Bar",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "This component built inside a single Column Layout",
                    "style": "BODY_MEDIUM"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TABLE",
                    "headers": [
                      "Header 1",
                      "Header 2"
                    ],
                    "data": [
                      [
                        "24 Bulan",
                        "Rp 146.500"
                      ],
                      [
                        "18 Bulan",
                        "Rp 230.000"
                      ],
                      [
                        "12 Bulan",
                        "Rp 286.500"
                      ],
                      [
                        "6 Bulan",
                        "Rp 322.500"
                      ],
                      [
                        "3 bulan",
                        "Rp 595.500"
                      ]
                    ]
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Indodana Primary Button",
                    "buttonType": "PRIMARY",
                    "action": {
                      "action": "DEEPLINK",
                      "deeplink": "A Deeplink"
                    }
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Indodana Secondary Button",
                    "buttonType": "SECONDARY",
                    "action": {
                      "action": "TOAST",
                      "title": "Toast Show!"
                    }
                  }
                }
              ]
            }
    """.trimIndent()
    }

    fun mockFeaturedProductWithNestedLayout(): String {
        return """
            {
              "title": "Home",
              "parentLayout": "COLUMN",
              "sections": [
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TOP_NAVBAR",
                    "title": "Featured Product with Nested Layout",
                    "showBack": true
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "SDUI with Nested Layout",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Below is 2 Row Layout with 2 Button Each",
                    "style": "BODY_MEDIUM"
                  }
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "BUTTON",
                      "title": "Default Primary",
                      "buttonType": "PRIMARY",
                      "buttonModifier": {
                        "fillMaxWidth": false
                      },
                      "action": {
                        "action": "DEEPLINK",
                        "deeplink": "A Deeplink"
                      }
                    },
                    {
                      "component": "BUTTON",
                      "title": "Default Secondary",
                      "buttonType": "SECONDARY",
                      "buttonModifier": {
                        "fillMaxWidth": false
                      },
                      "action": {
                        "action": "TOAST",
                        "title": "Toast Show!"
                      }
                    }
                  ]
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "BUTTON",
                      "title": "Primary Button Customized",
                      "buttonType": "PRIMARY",
                      "buttonModifier": {
                        "fillMaxWidth": false
                      },
                      "action": {
                        "action": "DEEPLINK",
                        "deeplink": "A Deeplink"
                      }
                    },
                    {
                      "component": "BUTTON",
                      "title": "Secondary Button with Customize Padding",
                      "buttonType": "SECONDARY",
                      "buttonModifier": {
                        "topPadding": 4,
                        "bottomPadding": 4,
                        "startPadding": 4,
                        "endPadding": 4,
                        "fillMaxWidth": false
                      },
                      "action": {
                        "action": "TOAST",
                        "title": "Toast Show!"
                      }
                    }
                  ]
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "End of Row Layout",
                    "style": "HEADLINE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TABLE",
                    "headers": [
                      "Header 1",
                      "Header 2"
                    ],
                    "data": [
                      [
                        "24 Bulan",
                        "Rp 146.500"
                      ],
                      [
                        "18 Bulan",
                        "Rp 230.000"
                      ],
                      [
                        "12 Bulan",
                        "Rp 286.500"
                      ],
                      [
                        "6 Bulan",
                        "Rp 322.500"
                      ],
                      [
                        "3 bulan",
                        "Rp 595.500"
                      ]
                    ]
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Beli Di Blibli",
                    "buttonType": "PRIMARY",
                    "action": {
                      "action": "DEEPLINK",
                      "deeplink": "A Deeplink"
                    }
                  }
                }
              ]
            }
    """.trimIndent()
    }

    fun mockComponentList(): String {
        return """
            {
              "title": "Home",
              "parentLayout": "COLUMN",
              "sections": [
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TOP_NAVBAR",
                    "title": "Top Navbar Component",
                    "showBack": true
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Image Banner Component",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "SPACER",
                    "height": 8
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Button Wrapped Component",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "BUTTON",
                      "title": "Primary",
                      "buttonType": "PRIMARY",
                      "buttonModifier": {
                        "fillMaxWidth": false
                      },
                      "action": {
                        "action": "DEEPLINK",
                        "deeplink": "A Deeplink"
                      }
                    },
                    {
                      "component": "BUTTON",
                      "title": "Secondary",
                      "buttonType": "SECONDARY",
                      "buttonModifier": {
                        "fillMaxWidth": false
                      },
                      "action": {
                        "action": "TOAST",
                        "title": "Toast Show!"
                      }
                    }
                  ]
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "SPACER",
                    "height": 16
                  }
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "TEXT",
                      "text": "Headline Large",
                      "style": "HEADLINE_LARGE"
                    },
                    {
                      "component": "TEXT",
                      "text": "Headline Medium",
                      "style": "HEADLINE_MEDIUM"
                    }
                  ]
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "TEXT",
                      "text": "Headline Small",
                      "style": "HEADLINE_SMALL"
                    },
                    {
                      "component": "TEXT",
                      "text": "Title Large",
                      "style": "TITLE_LARGE"
                    }
                  ]
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "TEXT",
                      "text": "Title Medium",
                      "style": "TITLE_MEDIUM"
                    },
                    {
                      "component": "TEXT",
                      "text": "Title Small",
                      "style": "TITLE_SMALL"
                    }
                  ]
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "TEXT",
                      "text": "Body Large",
                      "style": "BODY_LARGE"
                    },
                    {
                      "component": "TEXT",
                      "text": "Body Medium",
                      "style": "BODY_MEDIUM"
                    }
                  ]
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "TEXT",
                      "text": "Body Small",
                      "style": "BODY_SMALL"
                    },
                    {
                      "component": "TEXT",
                      "text": "Label Large",
                      "style": "LABEL_LARGE"
                    }
                  ]
                },
                {
                  "type": "LAYOUT",
                  "layout": "ROW",
                  "components": [
                    {
                      "component": "TEXT",
                      "text": "Label Medium",
                      "style": "LABEL_MEDIUM"
                    },
                    {
                      "component": "TEXT",
                      "text": "Label Small",
                      "style": "LABEL_SMALL"
                    }
                  ]
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "SPACER",
                    "height": 8
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Table Component",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TABLE",
                    "headers": [
                      "Header 1",
                      "Header 2"
                    ],
                    "data": [
                      [
                        "24 Bulan",
                        "Rp 146.500"
                      ],
                      [
                        "18 Bulan",
                        "Rp 230.000"
                      ],
                      [
                        "12 Bulan",
                        "Rp 286.500"
                      ],
                      [
                        "6 Bulan",
                        "Rp 322.500"
                      ],
                      [
                        "3 bulan",
                        "Rp 595.500"
                      ]
                    ]
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "SPACER",
                    "height": 8
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Button Default Component",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Primary Default Button",
                    "buttonType": "PRIMARY",
                    "action": {
                      "action": "DEEPLINK",
                      "deeplink": "A Deeplink"
                    }
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Secondary Button Default",
                    "buttonType": "SECONDARY",
                    "action": {
                      "action": "TOAST",
                      "title": "Action Toast!"
                    }
                  }
                }
              ]
            }
    """.trimIndent()
    }

    fun mockFeaturedProductWithTwoBanner(): String {
        return """
            {
              "title": "Home",
              "parentLayout": "COLUMN",
              "sections": [
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TOP_NAVBAR",
                    "title": "Featured Product with SDUI",
                    "showBack": true
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Beli Oppo A17 pakai Indodana, cicilnya mulai dari Rp 286.500 saja per bulan!",
                    "style": "TITLE_LARGE"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TEXT",
                    "text": "Belinya di Blibli, berikut simulasi cicilan-nya: ",
                    "style": "BODY_MEDIUM"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BANNER",
                    "title": "Featured Product Banner",
                    "image": "Image Banner"
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "TABLE",
                    "headers": [
                      "Header 1",
                      "Header 2"
                    ],
                    "data": [
                      [
                        "24 Bulan",
                        "Rp 146.500"
                      ],
                      [
                        "18 Bulan",
                        "Rp 230.000"
                      ],
                      [
                        "12 Bulan",
                        "Rp 286.500"
                      ],
                      [
                        "6 Bulan",
                        "Rp 322.500"
                      ],
                      [
                        "3 bulan",
                        "Rp 595.500"
                      ],
                      [
                        "30 Hari",
                        "Rp 1.670.500"
                      ],
                      [
                        "Row 7 Col 1",
                        "Row 7 Col 2"
                      ],
                      [
                        "Row 8 Col 1",
                        "Row 8 Col 2"
                      ],
                      [
                        "Row 9 Col 1",
                        "Row 9 Col 2"
                      ],
                      [
                        "Row 10 Col 1",
                        "Row 10 Col 2"
                      ],
                      [
                        "Row 11 Col 1",
                        "Row 11 Col 2"
                      ],
                      [
                        "Row 12 Col 1",
                        "Row 12 Col 2"
                      ],
                      [
                        "Row 13 Col 1",
                        "Row 13 Col 2"
                      ],
                      [
                        "Row 14 Col 1",
                        "Row 14 Col 2"
                      ],
                      [
                        "Row 15 Col 1",
                        "Row 15 Col 2"
                      ]
                    ]
                  }
                },
                {
                  "type": "COMPONENT",
                  "component": {
                    "component": "BUTTON",
                    "title": "Beli Di Blibli",
                    "buttonType": "PRIMARY",
                    "action": {
                      "action": "DEEPLINK",
                      "deeplink": "A Deeplink"
                    }
                  }
                }
              ]
            }
        """.trimIndent()
    }
}
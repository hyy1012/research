package com.ruoyi.research.domain.pca;

public class Area {
    private String text;

    private String value;

    private String postcode;

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String toString() {
        return "\n\t\t{\n\t\t\ttext: '" + this.text + "',\n\t\t\tvalue: '" + this.value + "',\n\t\t\tpostcode: '" + this.postcode + "',\n\t\t}";
    }
}

package com.ruoyi.research.domain.pca;

import java.util.ArrayList;
import java.util.List;

public class Province {
    private String text;

    private String value;

    private String postcode;

    private List<City> children = new ArrayList<>();

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

    public List<City> getChildren() {
        return this.children;
    }

    public void setChildren(List<City> children) {
        this.children = children;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String toString() {
        return "\n{\n\ttext: '" + this.text + "',\n\tvalue: '" + this.value + "',\n\tpostcode: '" + this.postcode + "',\n\tchildren: " + this.children + "\n}";
    }
}

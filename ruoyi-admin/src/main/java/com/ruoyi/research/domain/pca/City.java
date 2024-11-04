package com.ruoyi.research.domain.pca;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String text;

    private String value;

    private String postcode;

    private List<Area> children = new ArrayList<>();

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

    public List<Area> getChildren() {
        return this.children;
    }

    public void setChildren(List<Area> children) {
        this.children = children;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String toString() {
        return "\n\t{\n\t\ttext: '" + this.text + "',\n\t\tvalue: '" + this.value + "',\n\t\tpostcode: '" + this.postcode + "',\n\t\tchildren: " + this.children + "\n\t}";
    }
}

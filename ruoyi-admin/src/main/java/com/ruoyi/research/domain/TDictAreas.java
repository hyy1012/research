package com.ruoyi.research.domain;

import com.ruoyi.common.annotation.Excel;

public class TDictAreas {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "城市编码")
    private String cityCode;
    @Excel(name = "区域编码")
    private String areaCode;
    @Excel(name = "区域名称")
    private String areaName;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaName() {
        return this.areaName;
    }

    @Override
    public String toString() {
        return "TDictAreas{" +
                "id=" + id +
                ", cityCode='" + cityCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}

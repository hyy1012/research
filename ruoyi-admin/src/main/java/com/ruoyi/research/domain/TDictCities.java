package com.ruoyi.research.domain;

import com.ruoyi.common.annotation.Excel;

import java.util.List;

public class TDictCities {
    private static final long serialVersionUID = 1L;

    private Long id;

    @Excel(name = "省编码")
    private String provinceCode;

    @Excel(name = "城市编码")
    private String cityCode;

    @Excel(name = "城市名称")
    private String cityName;

    private List<TDictAreas> tDictAreasList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public List<TDictAreas> getTDictAreasList() {
        return this.tDictAreasList;
    }

    public void setTDictAreasList(List<TDictAreas> tDictAreasList) {
        this.tDictAreasList = tDictAreasList;
    }

    @Override
    public String toString() {
        return "TDictCities{" +
                "id=" + id +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                ", tDictAreasList=" + tDictAreasList +
                '}';
    }
}

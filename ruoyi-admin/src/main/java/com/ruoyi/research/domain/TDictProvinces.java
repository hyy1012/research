package com.ruoyi.research.domain;

import com.ruoyi.common.annotation.Excel;

import java.util.List;

public class TDictProvinces {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "省编码")
    private String provinceCode;
    @Excel(name = "省名称")
    private String provinceName;
    private List<TDictCities> tDictCitiesList;

    public TDictProvinces() {
    }

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

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public List<TDictCities> getTDictCitiesList() {
        return this.tDictCitiesList;
    }

    public void setTDictCitiesList(List<TDictCities> tDictCitiesList) {
        this.tDictCitiesList = tDictCitiesList;
    }

    @Override
    public String toString() {
        return "TDictProvinces{" +
                "id=" + id +
                ", provinceCode='" + provinceCode + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", tDictCitiesList=" + tDictCitiesList +
                '}';
    }
}

package com.ruoyi.research.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

public class ReAddress extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Integer id;

    @Excel(name = "主表主键")
    private Integer reId;

    @Excel(name = "省编码")
    private String provinceCode;

    @Excel(name = "市编码")
    private String cityCode;

    @Excel(name = "区编码")
    private String areaCode;

    @Excel(name = "详细地址")
    private String district;

    @Excel(name = "通讯地址")
    private String addr;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public Integer getReId() {
        return this.reId;
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

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return this.addr;
    }

    @Override
    public String toString() {
        return "ReAddress{" +
                "id=" + id +
                ", reId=" + reId +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", district='" + district + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
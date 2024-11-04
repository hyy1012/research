package com.ruoyi.research.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

public class ReCertificate extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Integer id;
    @Excel(name = "主表id")
    private Integer mainId;
    @Excel(name = "证书名称")
    private Integer certificateName;
    @Excel(name = "证书等级")
    private Integer certificateLevel;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "有效期开始时间", width = 30.0, dateFormat = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "有效期结束时间", width = 30.0, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public Integer getMainId() {
        return this.mainId;
    }

    public void setCertificateName(Integer certificateName) {
        this.certificateName = certificateName;
    }

    public Integer getCertificateName() {
        return this.certificateName;
    }

    public void setCertificateLevel(Integer certificateLevel) {
        this.certificateLevel = certificateLevel;
    }

    public Integer getCertificateLevel() {
        return this.certificateLevel;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    @Override
    public String toString() {
        return "ReCertificate{" +
                "id=" + id +
                ", mainId=" + mainId +
                ", certificateName=" + certificateName +
                ", certificateLevel=" + certificateLevel +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

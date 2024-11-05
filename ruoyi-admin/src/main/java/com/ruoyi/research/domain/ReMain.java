package com.ruoyi.research.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 主表对象 re_main
 * 
 * @author ruoyi
 * @date 2024-07-26
 */
public class ReMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 企业名称 */
    @Excel(name = "企业名称")
    private String firmName;

    /** 通讯地址 */
    @Excel(name = "通讯地址")
    private String reAddr;

    /** 省编码 */
    @Excel(name = "省编码")
    private String provinceCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /** 城市编码 */
    @Excel(name = "城市编码")
    private String cityCode;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /** 省编码 */
    @Excel(name = "区编码")
    private String areaCode;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /** 邮编 */
    @Excel(name = "邮编")
    private Integer postcode;

    /** 负责人 */
    @Excel(name = "负责人")
    private String header;

    /** 负责人电话 */
    @Excel(name = "负责人电话")
    private String headerPhone;

    /** 联络人 */
    @Excel(name = "联络人")
    private String liaison;

    /** 联络人电话 */
    @Excel(name = "联络人电话")
    private String liaisonPhone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 微信 */
    @Excel(name = "微信")
    private String wx;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 经营范围 */
    @Excel(name = "经营范围")
    private String businessScope;

    /** 员工人数 */
    @Excel(name = "员工人数")
    private Integer empCount;

    /** 企业类型：1、舞美工程 2、舞台工程 3、制造生产 4、其他 */
    @Excel(name = "企业类型")
    private Integer firmType;

    /** 是否是第八届（2022年-2027年）中国演出行业协会会员单位 */
    //@Excel(name = "是否是第八届", readConverterExp = "2=022年-2027年")
    private Boolean isHyxhhy;

    /** 是否是其他学、协会会员 */
    //@Excel(name = "是否是其他学、协会会员")
    private Boolean isHyxhhyOther;

    /** 协会名称：1、2、3、 */
    //@Excel(name = "协会名称：1、2、3、")
    private String hyxhhyOtherName;

    /** 是否持有中国演出行业协会、演出行业舞美舞台企业专业技术能力等级评价证书 */
    @Excel(name = "是否持有中国演出行业协会、演出行业舞美舞台企业专业技术能力等级评价证书")
    private Boolean hasCertificate;

    /** 证书名称 */
    //@Excel(name = "证书名称")
    private String certificateName;

    /** 证书等级 */
    //@Excel(name = "证书等级")
    private String certificateLevel;

    /** 有效期（证书） */
    //@Excel(name = "有效期", readConverterExp = "证=书")
    private Date certificateIndate;

    private List<Integer> memberNeeds;

    /** 会员需求：提供协会政策及政策解读，参与协会研讨、论坛及交流活动，参与产品推荐会，参加竞赛评比、表彰推广，参加企业联谊会，参加技能培训，企业管理咨询，银行金融服务，法律咨询服务，参与标准编写 */
    @Excel(name = "会员需求：提供协会政策及政策解读，参与协会研讨、论坛及交流活动，参与产品推荐会，参加竞赛评比、表彰推广，参加企业联谊会，参加技能培训，企业管理咨询，银行金融服务，法律咨询服务，参与标准编写")
    private String memberNeed;

    /** 企业公章 */
    //@Excel(name = "企业公章")
    private String firm;

    /** 填表人 */
    @Excel(name = "填表人")
    private String people;

    /** 填表日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date subTime;

    /** 证书列表 */
    @Excel(name = "证书列表")
    private List<ReCertificate> certificateList;

    /** 地址信息 */
    private ReAddress reAddress;

    public ReAddress getReAddress() {
        return reAddress;
    }

    public void setReAddress(ReAddress reAddress) {
        this.reAddress = reAddress;
    }

    public List<ReCertificate> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<ReCertificate> certificateList) {
        this.certificateList = certificateList;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setFirmName(String firmName) 
    {
        this.firmName = firmName;
    }

    public String getFirmName() 
    {
        return firmName;
    }
    public void setReAddr(String reAddr) 
    {
        this.reAddr = reAddr;
    }

    public String getReAddr() 
    {
        return reAddr;
    }
    public void setPostcode(Integer postcode) 
    {
        this.postcode = postcode;
    }

    public Integer getPostcode() 
    {
        return postcode;
    }
    public void setHeader(String header) 
    {
        this.header = header;
    }

    public String getHeader() 
    {
        return header;
    }
    public void setHeaderPhone(String headerPhone) 
    {
        this.headerPhone = headerPhone;
    }

    public String getHeaderPhone() 
    {
        return headerPhone;
    }
    public void setLiaison(String liaison) 
    {
        this.liaison = liaison;
    }

    public String getLiaison() 
    {
        return liaison;
    }
    public void setLiaisonPhone(String liaisonPhone) 
    {
        this.liaisonPhone = liaisonPhone;
    }

    public String getLiaisonPhone() 
    {
        return liaisonPhone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setWx(String wx) 
    {
        this.wx = wx;
    }

    public String getWx() 
    {
        return wx;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setBusinessScope(String businessScope) 
    {
        this.businessScope = businessScope;
    }

    public String getBusinessScope() 
    {
        return businessScope;
    }
    public void setEmpCount(Integer empCount) 
    {
        this.empCount = empCount;
    }

    public Integer getEmpCount() 
    {
        return empCount;
    }
    public void setFirmType(Integer firmType) 
    {
        this.firmType = firmType;
    }

    public Integer getFirmType() 
    {
        return firmType;
    }
    public void setIsHyxhhy(Boolean isHyxhhy) 
    {
        this.isHyxhhy = isHyxhhy;
    }

    public Boolean getIsHyxhhy()
    {
        return isHyxhhy;
    }
    public void setIsHyxhhyOther(Boolean isHyxhhyOther) 
    {
        this.isHyxhhyOther = isHyxhhyOther;
    }

    public Boolean getIsHyxhhyOther()
    {
        return isHyxhhyOther;
    }
    public void setHyxhhyOtherName(String hyxhhyOtherName) 
    {
        this.hyxhhyOtherName = hyxhhyOtherName;
    }

    public String getHyxhhyOtherName() 
    {
        return hyxhhyOtherName;
    }
    public void setHasCertificate(Boolean hasCertificate) 
    {
        this.hasCertificate = hasCertificate;
    }

    public Boolean getHasCertificate()
    {
        return hasCertificate;
    }
    public void setCertificateName(String certificateName) 
    {
        this.certificateName = certificateName;
    }

    public String getCertificateName() 
    {
        return certificateName;
    }
    public void setCertificateLevel(String certificateLevel) 
    {
        this.certificateLevel = certificateLevel;
    }

    public String getCertificateLevel() 
    {
        return certificateLevel;
    }
    public void setCertificateIndate(Date certificateIndate) 
    {
        this.certificateIndate = certificateIndate;
    }

    public Date getCertificateIndate() 
    {
        return certificateIndate;
    }
    public void setMemberNeeds(List<Integer> memberNeeds)
    {
        this.memberNeeds = memberNeeds;
    }

    public List<Integer> getMemberNeeds()
    {
        return memberNeeds;
    }
    public void setFirm(String firm) 
    {
        this.firm = firm;
    }

    public String getFirm() 
    {
        return firm;
    }
    public void setPeople(String people) 
    {
        this.people = people;
    }

    public String getPeople() 
    {
        return people;
    }
    public void setSubTime(Date subTime) 
    {
        this.subTime = subTime;
    }

    public Date getSubTime() 
    {
        return subTime;
    }

    public String getMemberNeed() {
        return memberNeed;
    }

    public void setMemberNeed(String memberNeed) {
        this.memberNeed = memberNeed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("firmName", getFirmName())
            .append("reAddr", getReAddr())
            .append("postcode", getPostcode())
            .append("header", getHeader())
            .append("headerPhone", getHeaderPhone())
            .append("liaison", getLiaison())
            .append("liaisonPhone", getLiaisonPhone())
            .append("email", getEmail())
            .append("wx", getWx())
            .append("phone", getPhone())
            .append("businessScope", getBusinessScope())
            .append("empCount", getEmpCount())
            .append("firmType", getFirmType())
            .append("isHyxhhy", getIsHyxhhy())
            .append("isHyxhhyOther", getIsHyxhhyOther())
            .append("hyxhhyOtherName", getHyxhhyOtherName())
            .append("hasCertificate", getHasCertificate())
            .append("certificateName", getCertificateName())
            .append("certificateLevel", getCertificateLevel())
            .append("certificateIndate", getCertificateIndate())
            .append("memberNeeds", getMemberNeeds())
            .append("memberNeed", getMemberNeed())
            .append("firm", getFirm())
            .append("people", getPeople())
            .append("subTime", getSubTime())
            .toString();
    }
}

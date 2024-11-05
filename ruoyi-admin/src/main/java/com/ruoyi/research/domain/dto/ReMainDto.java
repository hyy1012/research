package com.ruoyi.research.domain.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.research.domain.ReAddress;
import com.ruoyi.research.domain.ReCertificate;
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
public class ReMainDto extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 企业名称 */
    @Excel(name = "Q1_企业名称")
    private String firmName;

    /** 通讯地址 */
    @Excel(name = "Q2_通讯地址")
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
    @Excel(name = "Q3_邮编")
    private Integer postcode;

    /** 负责人 */
    @Excel(name = "Q4_负责人")
    private String header;

    /** 负责人电话 */
    @Excel(name = "Q5_手机")
    private String headerPhone;

    /** 联络人 */
    @Excel(name = "Q6_联络人")
    private String liaison;

    /** 联络人电话 */
    @Excel(name = "Q7_手机")
    private String liaisonPhone;

    /** 邮箱 */
    @Excel(name = "Q8_电子邮件")
    private String email;

    /** 微信 */
    @Excel(name = "Q9_微信号")
    private String wx;

    /** 电话 */
    @Excel(name = "Q10_电话")
    private String phone;

    /** 经营范围 */
    @Excel(name = "Q11_经营范围")
    private String businessScope;

    /** 员工人数 */
    @Excel(name = "Q12_企业员工人数")
    private Integer empCount;

    /** 企业类型：1、舞美工程 2、舞台工程 3、制造生产 4、其他 */
    @Excel(name = "Q13_舞美工程类型")
    private String firmType;

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
    @Excel(name = "是否持有中国演出行业舞美舞台企业专业技术能力等级评价证书")
    private String hasCertificate;

    @Excel(name = "Q18_证书数量")
    private Integer hasCertificates;

    /** 证书名称 */
    @Excel(name = "Q19_证书名称")
    private String certificateName1;

    /** 证书等级 */
    @Excel(name = "Q20_等级")
    private String certificateLevel1;

    /** 发证日期（证书） */
    @Excel(name = "Q21_发证日期")
    private Date certificateIndate1;

    /** 有效期（证书） */
    @Excel(name = "Q22_证书有效期")
    private Date certificateOutdate1;

    /** 证书名称 */
    @Excel(name = "Q23_证书名称")
    private String certificateName2;

    /** 证书等级 */
    @Excel(name = "Q24_等级")
    private String certificateLevel2;

    /** 发证日期（证书） */
    @Excel(name = "Q25_发证日期")
    private Date certificateIndate2;

    /** 有效期（证书） */
    @Excel(name = "Q26_证书有效期")
    private Date certificateOutdate2;

    /** 证书名称 */
    @Excel(name = "Q27_证书名称")
    private String certificateName3;

    /** 证书等级 */
    @Excel(name = "Q28_等级")
    private String certificateLevel3;

    /** 发证日期（证书） */
    @Excel(name = "Q29_发证日期")
    private Date certificateIndate3;

    /** 有效期（证书） */
    @Excel(name = "Q30_证书有效期")
    private Date certificateOutdate3;

    /** 证书名称 */
    @Excel(name = "Q31_证书名称")
    private String certificateName4;

    /** 证书等级 */
    @Excel(name = "Q32_等级")
    private String certificateLevel4;

    /** 发证日期（证书） */
    @Excel(name = "Q33_发证日期")
    private Date certificateIndate4;

    /** 有效期（证书） */
    @Excel(name = "Q34_证书有效期")
    private Date certificateOutdate4;

    /** 证书名称 */
    @Excel(name = "Q35_证书名称")
    private String certificateName5;

    /** 证书等级 */
    @Excel(name = "Q36_等级")
    private String certificateLevel5;

    /** 发证日期（证书） */
    @Excel(name = "Q37_发证日期")
    private Date certificateIndate5;

    /** 有效期（证书） */
    @Excel(name = "Q38_证书有效期")
    private Date certificateOutdate5;

    /** 证书名称 */
    @Excel(name = "Q39_证书名称")
    private String certificateName6;

    /** 证书等级 */
    @Excel(name = "Q40_等级")
    private String certificateLevel6;

    /** 发证日期（证书） */
    @Excel(name = "Q41_发证日期")
    private Date certificateIndate6;

    /** 有效期（证书） */
    @Excel(name = "Q42_证书有效期")
    private Date certificateOutdate6;

    /** 证书名称 */
    @Excel(name = "Q43_证书名称")
    private String certificateName7;

    /** 证书等级 */
    @Excel(name = "Q44_等级")
    private String certificateLevel7;

    /** 发证日期（证书） */
    @Excel(name = "Q45_发证日期")
    private Date certificateIndate7;

    /** 有效期（证书） */
    @Excel(name = "Q46_证书有效期")
    private Date certificateOutdate7;

    /** 证书名称 */
    @Excel(name = "Q47_证书名称")
    private String certificateName8;

    /** 证书等级 */
    @Excel(name = "Q48_等级")
    private String certificateLevel8;

    /** 发证日期（证书） */
    @Excel(name = "Q49_发证日期")
    private Date certificateIndate8;

    /** 有效期（证书） */
    @Excel(name = "Q50_证书有效期")
    private Date certificateOutdate8;

    private List<Integer> memberNeeds;

    /** 会员需求：提供协会政策及政策解读，参与协会研讨、论坛及交流活动，参与产品推荐会，参加竞赛评比、表彰推广，参加企业联谊会，参加技能培训，企业管理咨询，银行金融服务，法律咨询服务，参与标准编写 */
    @Excel(name = "Q51_会员需求")
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
    public void setFirmType(String firmType)
    {
        this.firmType = firmType;
    }

    public String getFirmType()
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

    public String getHasCertificate()
    {
        return hasCertificate;
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

    public Boolean getHyxhhy() {
        return isHyxhhy;
    }

    public void setHyxhhy(Boolean hyxhhy) {
        isHyxhhy = hyxhhy;
    }

    public Boolean getHyxhhyOther() {
        return isHyxhhyOther;
    }

    public void setHyxhhyOther(Boolean hyxhhyOther) {
        isHyxhhyOther = hyxhhyOther;
    }

    public void setHasCertificate(String hasCertificate) {
        this.hasCertificate = hasCertificate;
    }

    public Integer getHasCertificates() {
        return hasCertificates;
    }

    public void setHasCertificates(Integer hasCertificates) {
        this.hasCertificates = hasCertificates;
    }

    public String getCertificateName1() {
        return certificateName1;
    }

    public void setCertificateName1(String certificateName1) {
        this.certificateName1 = certificateName1;
    }

    public String getCertificateLevel1() {
        return certificateLevel1;
    }

    public void setCertificateLevel1(String certificateLevel1) {
        this.certificateLevel1 = certificateLevel1;
    }

    public Date getCertificateIndate1() {
        return certificateIndate1;
    }

    public void setCertificateIndate1(Date certificateIndate1) {
        this.certificateIndate1 = certificateIndate1;
    }

    public Date getCertificateOutdate1() {
        return certificateOutdate1;
    }

    public void setCertificateOutdate1(Date certificateOutdate1) {
        this.certificateOutdate1 = certificateOutdate1;
    }

    public String getCertificateName2() {
        return certificateName2;
    }

    public void setCertificateName2(String certificateName2) {
        this.certificateName2 = certificateName2;
    }

    public String getCertificateLevel2() {
        return certificateLevel2;
    }

    public void setCertificateLevel2(String certificateLevel2) {
        this.certificateLevel2 = certificateLevel2;
    }

    public Date getCertificateIndate2() {
        return certificateIndate2;
    }

    public void setCertificateIndate2(Date certificateIndate2) {
        this.certificateIndate2 = certificateIndate2;
    }

    public Date getCertificateOutdate2() {
        return certificateOutdate2;
    }

    public void setCertificateOutdate2(Date certificateOutdate2) {
        this.certificateOutdate2 = certificateOutdate2;
    }

    public String getCertificateName3() {
        return certificateName3;
    }

    public void setCertificateName3(String certificateName3) {
        this.certificateName3 = certificateName3;
    }

    public String getCertificateLevel3() {
        return certificateLevel3;
    }

    public void setCertificateLevel3(String certificateLevel3) {
        this.certificateLevel3 = certificateLevel3;
    }

    public Date getCertificateIndate3() {
        return certificateIndate3;
    }

    public void setCertificateIndate3(Date certificateIndate3) {
        this.certificateIndate3 = certificateIndate3;
    }

    public Date getCertificateOutdate3() {
        return certificateOutdate3;
    }

    public void setCertificateOutdate3(Date certificateOutdate3) {
        this.certificateOutdate3 = certificateOutdate3;
    }

    public String getCertificateName4() {
        return certificateName4;
    }

    public void setCertificateName4(String certificateName4) {
        this.certificateName4 = certificateName4;
    }

    public String getCertificateLevel4() {
        return certificateLevel4;
    }

    public void setCertificateLevel4(String certificateLevel4) {
        this.certificateLevel4 = certificateLevel4;
    }

    public Date getCertificateIndate4() {
        return certificateIndate4;
    }

    public void setCertificateIndate4(Date certificateIndate4) {
        this.certificateIndate4 = certificateIndate4;
    }

    public Date getCertificateOutdate4() {
        return certificateOutdate4;
    }

    public void setCertificateOutdate4(Date certificateOutdate4) {
        this.certificateOutdate4 = certificateOutdate4;
    }

    public String getCertificateName5() {
        return certificateName5;
    }

    public void setCertificateName5(String certificateName5) {
        this.certificateName5 = certificateName5;
    }

    public String getCertificateLevel5() {
        return certificateLevel5;
    }

    public void setCertificateLevel5(String certificateLevel5) {
        this.certificateLevel5 = certificateLevel5;
    }

    public Date getCertificateIndate5() {
        return certificateIndate5;
    }

    public void setCertificateIndate5(Date certificateIndate5) {
        this.certificateIndate5 = certificateIndate5;
    }

    public Date getCertificateOutdate5() {
        return certificateOutdate5;
    }

    public void setCertificateOutdate5(Date certificateOutdate5) {
        this.certificateOutdate5 = certificateOutdate5;
    }

    public String getCertificateName6() {
        return certificateName6;
    }

    public void setCertificateName6(String certificateName6) {
        this.certificateName6 = certificateName6;
    }

    public String getCertificateLevel6() {
        return certificateLevel6;
    }

    public void setCertificateLevel6(String certificateLevel6) {
        this.certificateLevel6 = certificateLevel6;
    }

    public Date getCertificateIndate6() {
        return certificateIndate6;
    }

    public void setCertificateIndate6(Date certificateIndate6) {
        this.certificateIndate6 = certificateIndate6;
    }

    public Date getCertificateOutdate6() {
        return certificateOutdate6;
    }

    public void setCertificateOutdate6(Date certificateOutdate6) {
        this.certificateOutdate6 = certificateOutdate6;
    }

    public String getCertificateName7() {
        return certificateName7;
    }

    public void setCertificateName7(String certificateName7) {
        this.certificateName7 = certificateName7;
    }

    public String getCertificateLevel7() {
        return certificateLevel7;
    }

    public void setCertificateLevel7(String certificateLevel7) {
        this.certificateLevel7 = certificateLevel7;
    }

    public Date getCertificateIndate7() {
        return certificateIndate7;
    }

    public void setCertificateIndate7(Date certificateIndate7) {
        this.certificateIndate7 = certificateIndate7;
    }

    public Date getCertificateOutdate7() {
        return certificateOutdate7;
    }

    public void setCertificateOutdate7(Date certificateOutdate7) {
        this.certificateOutdate7 = certificateOutdate7;
    }

    public String getCertificateName8() {
        return certificateName8;
    }

    public void setCertificateName8(String certificateName8) {
        this.certificateName8 = certificateName8;
    }

    public String getCertificateLevel8() {
        return certificateLevel8;
    }

    public void setCertificateLevel8(String certificateLevel8) {
        this.certificateLevel8 = certificateLevel8;
    }

    public Date getCertificateIndate8() {
        return certificateIndate8;
    }

    public void setCertificateIndate8(Date certificateIndate8) {
        this.certificateIndate8 = certificateIndate8;
    }

    public Date getCertificateOutdate8() {
        return certificateOutdate8;
    }

    public void setCertificateOutdate8(Date certificateOutdate8) {
        this.certificateOutdate8 = certificateOutdate8;
    }

    @Override
    public String toString() {
        return "ReMainDto{" +
                "id=" + id +
                ", firmName='" + firmName + '\'' +
                ", reAddr='" + reAddr + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", postcode=" + postcode +
                ", header='" + header + '\'' +
                ", headerPhone='" + headerPhone + '\'' +
                ", liaison='" + liaison + '\'' +
                ", liaisonPhone='" + liaisonPhone + '\'' +
                ", email='" + email + '\'' +
                ", wx='" + wx + '\'' +
                ", phone='" + phone + '\'' +
                ", businessScope='" + businessScope + '\'' +
                ", empCount=" + empCount +
                ", firmType='" + firmType + '\'' +
                ", isHyxhhy=" + isHyxhhy +
                ", isHyxhhyOther=" + isHyxhhyOther +
                ", hyxhhyOtherName='" + hyxhhyOtherName + '\'' +
                ", hasCertificate='" + hasCertificate + '\'' +
                ", hasCertificates=" + hasCertificates +
                ", certificateName1='" + certificateName1 + '\'' +
                ", certificateLevel1='" + certificateLevel1 + '\'' +
                ", certificateIndate1=" + certificateIndate1 +
                ", certificateOutdate1=" + certificateOutdate1 +
                ", certificateName2='" + certificateName2 + '\'' +
                ", certificateLevel2='" + certificateLevel2 + '\'' +
                ", certificateIndate2=" + certificateIndate2 +
                ", certificateOutdate2=" + certificateOutdate2 +
                ", certificateName3='" + certificateName3 + '\'' +
                ", certificateLevel3='" + certificateLevel3 + '\'' +
                ", certificateIndate3=" + certificateIndate3 +
                ", certificateOutdate3=" + certificateOutdate3 +
                ", certificateName4='" + certificateName4 + '\'' +
                ", certificateLevel4='" + certificateLevel4 + '\'' +
                ", certificateIndate4=" + certificateIndate4 +
                ", certificateOutdate4=" + certificateOutdate4 +
                ", certificateName5='" + certificateName5 + '\'' +
                ", certificateLevel5='" + certificateLevel5 + '\'' +
                ", certificateIndate5=" + certificateIndate5 +
                ", certificateOutdate5=" + certificateOutdate5 +
                ", certificateName6='" + certificateName6 + '\'' +
                ", certificateLevel6='" + certificateLevel6 + '\'' +
                ", certificateIndate6=" + certificateIndate6 +
                ", certificateOutdate6=" + certificateOutdate6 +
                ", certificateName7='" + certificateName7 + '\'' +
                ", certificateLevel7='" + certificateLevel7 + '\'' +
                ", certificateIndate7=" + certificateIndate7 +
                ", certificateOutdate7=" + certificateOutdate7 +
                ", certificateName8='" + certificateName8 + '\'' +
                ", certificateLevel8='" + certificateLevel8 + '\'' +
                ", certificateIndate8=" + certificateIndate8 +
                ", certificateOutdate8=" + certificateOutdate8 +
                ", memberNeeds=" + memberNeeds +
                ", memberNeed='" + memberNeed + '\'' +
                ", firm='" + firm + '\'' +
                ", people='" + people + '\'' +
                ", subTime=" + subTime +
                ", certificateList=" + certificateList +
                ", reAddress=" + reAddress +
                '}';
    }
}

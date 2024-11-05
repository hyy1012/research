package com.ruoyi.research.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.research.domain.*;
import com.ruoyi.research.domain.dto.ReMainDto;
import com.ruoyi.research.mapper.*;
import com.ruoyi.research.service.ex.CertificateNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.research.service.IReMainService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 主表Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-26
 */
@Service
public class ReMainServiceImpl implements IReMainService 
{
    @Autowired
    private ReMainMapper reMainMapper;

    @Autowired
    private ReCertificateMapper reCertificateMapper;

    @Autowired
    private ReAddressMapper reAddressMapper;

    @Autowired
    private TDictProvincesMapper provincesMapper;

    @Autowired
    private TDictCitiesMapper citiesMapper;

    @Autowired
    private TDictAreasMapper areasMapper;

    /**
     * 查询主表
     * 
     * @param id 主表主键
     * @return 主表
     */
    @Override
    public ReMain selectReMainById(Integer id)
    {
        return reMainMapper.selectReMainById(id);
    }

    /**
     * 查询主表列表
     * 
     * @param reMain 主表
     * @return 主表
     */
    @Override
    public List<ReMain> selectReMainList(ReMain reMain)
    {
        List<ReMain> reMains = reMainMapper.selectReMainList(reMain);
        for (ReMain main : reMains) {
            if (main.getMemberNeed() != null && !"".equals(main.getMemberNeed().trim())){
                String[] needs = main.getMemberNeed().split(",");
                List<Integer> list = new ArrayList<>();
                for (String need : needs) {
                    list.add(Integer.valueOf(need));
                }
                main.setMemberNeeds(list);
            }
            if (main.getHasCertificate() == true){
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setMainId(main.getId());
                List<ReCertificate> reCertificates = reCertificateMapper.selectReCertificateList(reCertificate);
                main.setCertificateList(reCertificates);
            }
            ReAddress reAddress = reAddressMapper.selectReAddressByReId(main.getId());
            if (reAddress != null) {
                main.setProvinceCode(reAddress.getProvinceCode());
                main.setCityCode(reAddress.getCityCode());
                main.setAreaCode(reAddress.getAreaCode());
            }
        }
        return reMains;
    }

    /**
     * 新增主表
     * 
     * @param reMain 主表
     * @return 结果
     */
    @Override
    @Transactional
    public int insertReMain(ReMain reMain)
    {
        // 企业名称去空格
        reMain.setFirmName(reMain.getFirmName().trim());
        // 设置会员需求
        if (reMain.getMemberNeeds() != null && !reMain.getMemberNeeds().isEmpty()) {
            String memberNeed = String.valueOf(reMain.getMemberNeeds().get(0));
            for (int i = 1; i < reMain.getMemberNeeds().size(); i++) {
                memberNeed = memberNeed + "," + reMain.getMemberNeeds().get(i);
            }
            reMain.setMemberNeed(memberNeed);
        }
        int i = reMainMapper.insertReMain(reMain);
        // 插入证书关联表
        List<ReCertificate> certificateList = reMain.getCertificateList();
        for (ReCertificate reCertificate : certificateList) {
            if (reCertificate.getCertificateName() != null) {
                // 证书选项校验
                if (reCertificate.getCertificateLevel() == null)
                    throw new CertificateNullException("提交失败！请选择证书等级！");
                if (reCertificate.getStartDate() == null)
                    throw new CertificateNullException("提交失败！请选择证书开始时间！");
                if (reCertificate.getEndDate() == null)
                    throw new CertificateNullException("提交失败！请选择证书结束时间！");
                if (reCertificate.getStartDate().compareTo(reCertificate.getEndDate()) > 0)
                    throw new CertificateNullException("提交失败！开始时间大于结束时间！");
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
        }
        // 插入地址
        reMain.getReAddress().setReId(reMain.getId());
        reAddressMapper.insertReAddress(reMain.getReAddress());
        return i;
    }

    /**
     * 修改主表
     * 
     * @param reMain 主表
     * @return 结果
     */
    @Override
    public int updateReMain(ReMain reMain)
    {
        return reMainMapper.updateReMain(reMain);
    }

    /**
     * 批量删除主表
     * 
     * @param ids 需要删除的主表主键
     * @return 结果
     */
    @Override
    public int deleteReMainByIds(Integer[] ids)
    {
        return reMainMapper.deleteReMainByIds(ids);
    }

    /**
     * 删除主表信息
     * 
     * @param id 主表主键
     * @return 结果
     */
    @Override
    public int deleteReMainById(Integer id)
    {
        return reMainMapper.deleteReMainById(id);
    }

    @Override
    public String importReMain(List<ReMainDto> reMainList, Boolean isUpdateSupport, String operName) {
        if (StringUtils.isNull(reMainList) || reMainList.size() == 0) {
            throw new ServiceException("导入数据不能为空！");
        }
//        StringBuilder successMsg = new StringBuilder();
//        StringBuilder failureMsg = new StringBuilder();
        for (ReMainDto reMainDto : reMainList) {
            ReMain reMain = new ReMain();
            reMain.setBusinessScope(reMainDto.getBusinessScope());

            // 获取编码
            String[] split = reMainDto.getReAddr().split("\\|");
            TDictProvinces provinces = new TDictProvinces();
            provinces.setProvinceName(split[0]);
            List<TDictProvinces> tDictProvinces = provincesMapper.selectTDictProvincesList(provinces);
            TDictCities cities = new TDictCities();
            cities.setCityName(split[1]);
            List<TDictCities> tDictCities = citiesMapper.selectTDictCitiesList(cities);
            TDictAreas areas = new TDictAreas();
            areas.setAreaName(split[2]);
            List<TDictAreas> tDictAreas = areasMapper.selectTDictAreasList(areas);
            // 赋值
            String addr = split[0] + split[1] + split[2] + split[3];
            ReAddress rd = new ReAddress();
            rd.setProvinceCode(tDictProvinces.get(0).getProvinceCode());
            rd.setCityCode(tDictCities.get(0).getCityCode());
            rd.setAreaCode(tDictAreas.get(0).getAreaCode());
            rd.setDistrict(split[3]);
            rd.setAddr(addr);

            reMain.setReAddr(addr);
            reMain.setPostcode(reMainDto.getPostcode());
            reMain.setHeader(reMainDto.getHeader());
            reMain.setHeaderPhone(reMainDto.getHeaderPhone());
            reMain.setLiaison(reMainDto.getLiaison());
            reMain.setLiaisonPhone(reMainDto.getLiaisonPhone());
            reMain.setEmail(reMainDto.getEmail());
            reMain.setWx(reMainDto.getWx());
            reMain.setPhone(reMainDto.getPhone());
            reMain.setBusinessScope(reMainDto.getBusinessScope());
            reMain.setEmpCount(reMainDto.getEmpCount());

            //todo 需要确定是企业类型是单选还是多选
            String[] frimNames = reMainDto.getFirmType().split("\\|");
            if ("舞美工程".equals(frimNames[0])) {
                reMain.setFirmType(1);
            } else if ("舞台工程".equals(frimNames[0])) {
                reMain.setFirmType(2);
            } else if ("制造生产".equals(frimNames[0])) {
                reMain.setFirmType(3);
            } else {
                reMain.setFirmType(4);
            }

            String[] needs = reMainDto.getMemberNeed().split("\\|");
            List<Integer> n = new ArrayList<>();
            for (String need : needs) {
                switch (need){
                    case "提供协会政策及政策解读":
                        n.add(1);
                        break;
                    case "参与协会研讨、论坛及交流活动":
                        n.add(1);
                        break;
                    case "参与产品推荐会":
                        n.add(2);
                        break;
                    case "参加竞赛评比、表彰推广":
                        n.add(3);
                        break;
                    case "参加企业联谊会":
                        n.add(4);
                        break;
                    case "参加技能培训":
                        n.add(5);
                        break;
                    case "企业管理咨询":
                        n.add(6);
                        break;
                    case "银行金融服务":
                        n.add(7);
                        break;
                    case "法律咨询服务":
                        n.add(8);
                        break;
                    case "参与标准编写":
                        n.add(9);
                        break;
                }
            }
            String memberNeed = String.valueOf(n.get(0));
            for (int i = 1; i < n.size(); i++) {
                memberNeed = memberNeed + "," + n.get(i);
            }
            reMain.setMemberNeed(memberNeed);
            if ("否".equals(reMainDto.getHasCertificate())) {
                reMain.setHasCertificate(false);
            } else {
                reMain.setHasCertificate(true);
            }

            // 插入
            int i = reMainMapper.insertReMain(reMain);
            rd.setReId(reMain.getId());
            reAddressMapper.insertReAddress(rd);

            if (reMainDto.getCertificateName1() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName1()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel1()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate1());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate1());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName2() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName2()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel2()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate2());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate2());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName3() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName3()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel3()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate3());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate3());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName4() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName4()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel4()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate4());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate4());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName5() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName5()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel5()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate5());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate5());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName6() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName6()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel6()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate6());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate6());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName7() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName7()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel7()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate7());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate7());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
            if (reMainDto.getCertificateName8() != null) {
                ReCertificate reCertificate = new ReCertificate();
                reCertificate.setCertificateName(getCertificateNum(reMainDto.getCertificateName8()));
                reCertificate.setCertificateLevel(getCertificateLevel(reMainDto.getCertificateLevel8()));
                reCertificate.setStartDate(reMainDto.getCertificateIndate8());
                reCertificate.setEndDate(reMainDto.getCertificateOutdate8());
                reCertificate.setMainId(reMain.getId());
                reCertificateMapper.insertReCertificate(reCertificate);
            }
        }
        return null;
    }

    private int getCertificateNum(String name){
        switch (name) {
            case "演出行业舞美工程企业专业技术能力等级舞美工程灯光专业":
                return 0;
            case "演出行业舞美工程企业专业技术能力等级舞美工程音响专业":
                return 1;
            case "演出行业舞美工程企业专业技术能力等级舞美工程视频专业":
                return 2;
            case "演出行业舞美工程企业专业技术能力等级舞美工程装置专业":
                return 3;
            case "演出行业舞美工程企业专业技术能力等级舞美工程综合技术":
                return 4;
            case "演出行业舞台工程企业专业技术能力等级舞台工程灯光专业":
                return 5;
            case "演出行业舞台工程企业专业技术能力等级舞台工程音响专业":
                return 6;
            case "演出行业舞台工程企业专业技术能力等级舞台工程机械专业":
                return 7;
        }
        return 10;
    }

    private int getCertificateLevel(String level){
        switch (level){
            case "壹级":
                return 1;
            case "贰级":
                return 2;
            case "叁级":
                return 3;
        }
        return 10;
    }

}

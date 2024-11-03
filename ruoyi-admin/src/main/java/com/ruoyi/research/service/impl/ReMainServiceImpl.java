package com.ruoyi.research.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ruoyi.research.domain.ReAddress;
import com.ruoyi.research.domain.ReCertificate;
import com.ruoyi.research.mapper.ReAddressMapper;
import com.ruoyi.research.mapper.ReCertificateMapper;
import com.ruoyi.research.service.ex.CertificateNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.research.mapper.ReMainMapper;
import com.ruoyi.research.domain.ReMain;
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
}

package com.ruoyi.research.service.impl;

import com.ruoyi.research.domain.ReCertificate;
import com.ruoyi.research.mapper.ReCertificateMapper;
import com.ruoyi.research.service.IReCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReCertificateServiceImpl implements IReCertificateService {
    @Autowired
    private ReCertificateMapper reCertificateMapper;

    public ReCertificate selectReCertificateById(Long id) {
        return this.reCertificateMapper.selectReCertificateById(id);
    }

    public List<ReCertificate> selectReCertificateList(ReCertificate reCertificate) {
        return this.reCertificateMapper.selectReCertificateList(reCertificate);
    }

    public int insertReCertificate(ReCertificate reCertificate) {
        return this.reCertificateMapper.insertReCertificate(reCertificate);
    }

    public int updateReCertificate(ReCertificate reCertificate) {
        return this.reCertificateMapper.updateReCertificate(reCertificate);
    }

    public int deleteReCertificateByIds(Long[] ids) {
        return this.reCertificateMapper.deleteReCertificateByIds(ids);
    }

    public int deleteReCertificateById(Long id) {
        return this.reCertificateMapper.deleteReCertificateById(id);
    }
}

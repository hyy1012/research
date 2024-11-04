package com.ruoyi.research.service;

import com.ruoyi.research.domain.ReCertificate;

import java.util.List;

public interface IReCertificateService {
    ReCertificate selectReCertificateById(Long paramLong);

    List<ReCertificate> selectReCertificateList(ReCertificate paramReCertificate);

    int insertReCertificate(ReCertificate paramReCertificate);

    int updateReCertificate(ReCertificate paramReCertificate);

    int deleteReCertificateByIds(Long[] paramArrayOfLong);

    int deleteReCertificateById(Long paramLong);
}

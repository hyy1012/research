package com.ruoyi.research.mapper;

import com.ruoyi.research.domain.ReCertificate;

import java.util.List;

public interface ReCertificateMapper {
    ReCertificate selectReCertificateById(Long paramLong);

    List<ReCertificate> selectReCertificateList(ReCertificate paramReCertificate);

    int insertReCertificate(ReCertificate paramReCertificate);

    int updateReCertificate(ReCertificate paramReCertificate);

    int deleteReCertificateById(Long paramLong);

    int deleteReCertificateByIds(Long[] paramArrayOfLong);
}

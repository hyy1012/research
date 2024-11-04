package com.ruoyi.research.mapper;

import com.ruoyi.research.domain.TDictCities;
import com.ruoyi.research.domain.TDictProvinces;

import java.util.List;

public interface TDictProvincesMapper {
    TDictProvinces selectTDictProvincesById(Long paramLong);

    List<TDictProvinces> selectTDictProvincesList(TDictProvinces paramTDictProvinces);

    int insertTDictProvinces(TDictProvinces paramTDictProvinces);

    int updateTDictProvinces(TDictProvinces paramTDictProvinces);

    int deleteTDictProvincesById(Long paramLong);

    int deleteTDictProvincesByIds(Long[] paramArrayOfLong);

    int deleteTDictCitiesByProvinceCodes(Long[] paramArrayOfLong);

    int batchTDictCities(List<TDictCities> paramList);

    int deleteTDictCitiesByProvinceCode(Long paramLong);
}

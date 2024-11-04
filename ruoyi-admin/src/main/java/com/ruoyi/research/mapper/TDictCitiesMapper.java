package com.ruoyi.research.mapper;

import com.ruoyi.research.domain.TDictAreas;
import com.ruoyi.research.domain.TDictCities;

import java.util.List;

public interface TDictCitiesMapper {
    TDictCities selectTDictCitiesById(Long paramLong);

    List<TDictCities> selectTDictCitiesList(TDictCities paramTDictCities);

    int insertTDictCities(TDictCities paramTDictCities);

    int updateTDictCities(TDictCities paramTDictCities);

    int deleteTDictCitiesById(Long paramLong);

    int deleteTDictCitiesByIds(Long[] paramArrayOfLong);

    int deleteTDictAreasByCityCodes(Long[] paramArrayOfLong);

    int batchTDictAreas(List<TDictAreas> paramList);

    int deleteTDictAreasByCityCode(Long paramLong);
}

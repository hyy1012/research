package com.ruoyi.research.mapper;

import com.ruoyi.research.domain.TDictAreas;

import java.util.List;

public interface TDictAreasMapper {
    TDictAreas selectTDictAreasById(Long paramLong);

    List<TDictAreas> selectTDictAreasList(TDictAreas paramTDictAreas);

    int insertTDictAreas(TDictAreas paramTDictAreas);

    int updateTDictAreas(TDictAreas paramTDictAreas);

    int deleteTDictAreasById(Long paramLong);

    int deleteTDictAreasByIds(Long[] paramArrayOfLong);
}

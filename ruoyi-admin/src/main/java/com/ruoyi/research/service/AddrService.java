package com.ruoyi.research.service;

import com.ruoyi.research.domain.TDictAreas;
import com.ruoyi.research.domain.TDictCities;
import com.ruoyi.research.domain.TDictProvinces;

import java.util.List;

public interface AddrService {
    List<TDictProvinces> getList();

    List<TDictProvinces> getProvinces();

    List<TDictCities> getCity(String paramString);

    List<TDictAreas> getArea(String paramString);
}

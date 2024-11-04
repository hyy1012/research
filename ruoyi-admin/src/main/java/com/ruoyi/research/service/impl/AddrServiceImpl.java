package com.ruoyi.research.service.impl;

import com.ruoyi.research.domain.TDictAreas;
import com.ruoyi.research.domain.TDictCities;
import com.ruoyi.research.domain.TDictProvinces;
import com.ruoyi.research.mapper.TDictAreasMapper;
import com.ruoyi.research.mapper.TDictCitiesMapper;
import com.ruoyi.research.mapper.TDictProvincesMapper;
import com.ruoyi.research.service.AddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddrServiceImpl  implements AddrService {
    @Autowired
    private TDictProvincesMapper provincesMapper;

    @Autowired
    private TDictCitiesMapper citiesMapper;

    @Autowired
    private TDictAreasMapper areasMapper;

    public List<TDictProvinces> getList() {
        List<TDictProvinces> tDictProvinces = this.provincesMapper.selectTDictProvincesList(null);
        TDictCities city = new TDictCities();
        TDictAreas area = new TDictAreas();
        for (TDictProvinces tDictProvince : tDictProvinces) {
            city.setProvinceCode(tDictProvince.getProvinceCode());
            tDictProvince.setTDictCitiesList(this.citiesMapper.selectTDictCitiesList(city));
            for (TDictCities tDictCities : tDictProvince.getTDictCitiesList()) {
                area.setCityCode(tDictCities.getCityCode());
                tDictCities.setTDictAreasList(this.areasMapper.selectTDictAreasList(area));
            }
        }
        return tDictProvinces;
    }

    public List<TDictProvinces> getProvinces() {
        List<TDictProvinces> tDictProvinces = this.provincesMapper.selectTDictProvincesList(null);
        return tDictProvinces;
    }

    public List<TDictCities> getCity(String provinceCode) {
        TDictCities city = new TDictCities();
        city.setProvinceCode(provinceCode);
        return this.citiesMapper.selectTDictCitiesList(city);
    }

    public List<TDictAreas> getArea(String cityCode) {
        TDictAreas area = new TDictAreas();
        area.setCityCode(cityCode);
        return this.areasMapper.selectTDictAreasList(area);
    }
}

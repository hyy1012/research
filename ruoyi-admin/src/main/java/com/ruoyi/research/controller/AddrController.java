package com.ruoyi.research.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.research.domain.TDictAreas;
import com.ruoyi.research.domain.TDictCities;
import com.ruoyi.research.domain.TDictProvinces;
import com.ruoyi.research.service.AddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/addr"})
public class AddrController extends BaseController {
    @Autowired
    private AddrService addrService;

    @PreAuthorize("@ss.hasPermi('research:research:list')")
    @GetMapping({"/list"})
    public TableDataInfo list() {
        List<TDictProvinces> list = this.addrService.getList();
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('research:research:list')")
    @GetMapping({"/getProvinces"})
    public TableDataInfo getProvinces() {
        List<TDictProvinces> list = this.addrService.getProvinces();
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('research:research:list')")
    @GetMapping({"/getCity"})
    public TableDataInfo getCity(String provinceCode) {
        List<TDictCities> list = this.addrService.getCity(provinceCode);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('research:research:list')")
    @GetMapping({"/getArea"})
    public TableDataInfo getArea(String cityCode) {
        List<TDictAreas> list = this.addrService.getArea(cityCode);
        return getDataTable(list);
    }
}
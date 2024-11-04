package com.ruoyi.research.service.impl;

import com.ruoyi.research.domain.ReAddress;
import com.ruoyi.research.mapper.ReAddressMapper;
import com.ruoyi.research.service.IReAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReAddressServiceImpl implements IReAddressService {
    @Autowired
    private ReAddressMapper reAddressMapper;

    public ReAddress selectReAddressById(Integer id) {
        return this.reAddressMapper.selectReAddressById(id);
    }

    public List<ReAddress> selectReAddressList(ReAddress reAddress) {
        return this.reAddressMapper.selectReAddressList(reAddress);
    }

    public int insertReAddress(ReAddress reAddress) {
        return this.reAddressMapper.insertReAddress(reAddress);
    }

    public int updateReAddress(ReAddress reAddress) {
        return this.reAddressMapper.updateReAddress(reAddress);
    }

    public int deleteReAddressByIds(Integer[] ids) {
        return this.reAddressMapper.deleteReAddressByIds(ids);
    }

    public int deleteReAddressById(Integer id) {
        return this.reAddressMapper.deleteReAddressById(id);
    }
}

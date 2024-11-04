package com.ruoyi.research.service;

import com.ruoyi.research.domain.ReAddress;

import java.util.List;

public interface IReAddressService {
    ReAddress selectReAddressById(Integer paramInteger);

    List<ReAddress> selectReAddressList(ReAddress paramReAddress);

    int insertReAddress(ReAddress paramReAddress);

    int updateReAddress(ReAddress paramReAddress);

    int deleteReAddressByIds(Integer[] paramArrayOfInteger);

    int deleteReAddressById(Integer paramInteger);
}

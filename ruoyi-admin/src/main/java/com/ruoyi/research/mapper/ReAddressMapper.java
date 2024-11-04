package com.ruoyi.research.mapper;

import com.ruoyi.research.domain.ReAddress;

import java.util.List;

public interface ReAddressMapper {
    ReAddress selectReAddressById(Integer paramInteger);

    ReAddress selectReAddressByReId(Integer paramInteger);

    List<ReAddress> selectReAddressList(ReAddress paramReAddress);

    int insertReAddress(ReAddress paramReAddress);

    int updateReAddress(ReAddress paramReAddress);

    int deleteReAddressById(Integer paramInteger);

    int deleteReAddressByIds(Integer[] paramArrayOfInteger);
}

package com.ruoyi.research.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.research.domain.ReMain;
import com.ruoyi.research.domain.dto.ReMainDto;

/**
 * 主表Service接口
 * 
 * @author ruoyi
 * @date 2024-07-26
 */
public interface IReMainService 
{
    /**
     * 查询主表
     * 
     * @param id 主表主键
     * @return 主表
     */
    public ReMain selectReMainById(Integer id);

    /**
     * 查询主表列表
     * 
     * @param reMain 主表
     * @return 主表集合
     */
    public List<ReMain> selectReMainList(ReMain reMain);

    /**
     * 新增主表
     * 
     * @param reMain 主表
     * @return 结果
     */
    public int insertReMain(ReMain reMain);

    /**
     * 修改主表
     * 
     * @param reMain 主表
     * @return 结果
     */
    public int updateReMain(ReMain reMain);

    /**
     * 批量删除主表
     * 
     * @param ids 需要删除的主表主键集合
     * @return 结果
     */
    public int deleteReMainByIds(Integer[] ids);

    /**
     * 删除主表信息
     * 
     * @param id 主表主键
     * @return 结果
     */
    public int deleteReMainById(Integer id);

    /**
     *
     * @param reMainList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    String importReMain(List<ReMainDto> reMainList, Boolean isUpdateSupport, String operName);
}

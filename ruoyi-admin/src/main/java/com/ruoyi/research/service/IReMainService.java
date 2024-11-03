package com.ruoyi.research.service;

import java.util.List;
import com.ruoyi.research.domain.ReMain;

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
}

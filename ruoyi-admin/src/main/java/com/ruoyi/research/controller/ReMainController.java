package com.ruoyi.research.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.research.domain.dto.ReMainDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.research.domain.ReMain;
import com.ruoyi.research.service.IReMainService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 主表Controller
 * 
 * @author ruoyi
 * @date 2024-07-26
 */
@RestController
@RequestMapping("/research/research")
public class ReMainController extends BaseController
{
    @Autowired
    private IReMainService reMainService;

    /**
     * 查询主表列表
     */
    @PreAuthorize("@ss.hasPermi('research:research:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReMain reMain)
    {
        startPage();
        List<ReMain> list = reMainService.selectReMainList(reMain);
        return getDataTable(list);
    }

    /**
     * 导出主表列表
     */
    @PreAuthorize("@ss.hasPermi('research:research:export')")
    @Log(title = "主表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReMain reMain)
    {
        List<ReMain> list = reMainService.selectReMainList(reMain);
        ExcelUtil<ReMain> util = new ExcelUtil<ReMain>(ReMain.class);
        util.exportExcel(response, list, "主表数据");
    }

    /**
     * 获取主表详细信息
     */
    @PreAuthorize("@ss.hasPermi('research:research:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(reMainService.selectReMainById(id));
    }

    /**
     * 新增主表
     */
    @PreAuthorize("@ss.hasPermi('research:research:add')")
    @Log(title = "主表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReMain reMain)
    {
        try {
            reMain.setPeople(SecurityUtils.getUsername());
            reMain.setSubTime(new Date());
            return toAjax(reMainService.insertReMain(reMain));
        }catch (RuntimeException e){
            return error(e.getMessage());
        }
    }

    /**
     * 修改主表
     */
    @PreAuthorize("@ss.hasPermi('research:research:edit')")
    @Log(title = "主表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReMain reMain)
    {
        return toAjax(reMainService.updateReMain(reMain));
    }

    /**
     * 删除主表
     */
    @PreAuthorize("@ss.hasPermi('research:research:remove')")
    @Log(title = "主表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(reMainService.deleteReMainByIds(ids));
    }

    @Log(title = "用户管理", businessType = BusinessType.IMPORT)
    @PreAuthorize("@ss.hasPermi('system:research:export')")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<ReMainDto> util = new ExcelUtil<ReMainDto>(ReMainDto.class);
        List<ReMainDto> reMainList = util.importExcel(file.getInputStream());
        String message = reMainService.importReMain(reMainList, updateSupport, null);
        return success(message);
    }
}

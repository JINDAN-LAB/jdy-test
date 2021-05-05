package com.jindan.jdy.controller.consumable;

import com.github.pagehelper.PageInfo;
import com.jindan.jdy.common.dto.StarchClassifyPutConsumableDto;
import com.jindan.jdy.common.dto.StarchOrganizationAccessDto;
import com.jindan.jdy.common.pojo.StarchClassifyPutConsumable;
import com.jindan.jdy.controller.utils.RedisUtil;
import com.jindan.jdy.service.consumable.StarchClassifyPutConsumableService;
import com.jindan.jdy.common.utils.api.ResultVo;
import com.jindan.jdy.service.stock.StarchOrganizationAccessService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

import java.util.List;

/**
*
* <p>说明： 耗材资产分类API接口层</P>
* @version: V1.0
* @author: kong
* @time    2020年9月14日
*
*/
@Api(tags = "耗材资产分类")
@RestController
@RequestMapping("/starchClassifyPutConsumable")
public class StarchClassifyPutConsumableController{

    @Reference(version = "${service.version}", check = false)
    private  StarchClassifyPutConsumableService starchClassifyPutConsumableService;


    @ApiOperation("耗材资产分类信息")
    @PostMapping("/seletStarchClassifyPut")
    public ResultVo seletRelevanceStarchManageCheck(@ApiParam(value = "jdyFlatalog", required = true)
                                                    @RequestBody StarchClassifyPutConsumable jdyFlatalog){
        List<StarchClassifyPutConsumableDto> list  = starchClassifyPutConsumableService.queryRelevanceCatList(jdyFlatalog);
        return  ResultVo.success(list);
    }


    @ApiOperation("更新耗材资产分类")
    @PostMapping("/updateStarchClassifyPut")
    public ResultVo updateStarchMaintainRegister(@ApiParam(value = "warehouseDepository", required = true)
                                                 @RequestBody StarchClassifyPutConsumable warehouseDepository){
        boolean index = starchClassifyPutConsumableService.updateStarchMaintainRegister(warehouseDepository);
        if(index){
            return  ResultVo.success();
        }
        return  ResultVo.failed();
    }


    @ApiOperation(value = "增加耗材资产分类", notes = "参数:增加耗材资产分类")
    @PostMapping("/addStarchClassifyPut")
    public ResultVo seleteCatalog(@ApiParam(name = "departmggestDto", required = false)
                                  @RequestBody StarchClassifyPutConsumable departmggestDto){
        boolean list  = starchClassifyPutConsumableService.addJdyFlowCatalog(departmggestDto);
        return  ResultVo.success(list);
    }


    @ApiOperation("删除耗材资产分类")
    @DeleteMapping("deleteStarchClassifyPutService/{id}")
    public ResultVo deletekeyPointPracticableService(@ApiParam(name = "id", value = "ID", required = true) @PathVariable String  id){
        boolean b = starchClassifyPutConsumableService.removeDetailsById(id);
        if(b){
            return ResultVo.success();
        }
        return ResultVo.failed();
    }







}
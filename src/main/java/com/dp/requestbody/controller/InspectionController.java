package com.dp.requestbody.controller;

import com.dp.requestbody.model.Inspection;
import com.dp.requestbody.model.PageModel;
import com.dp.requestbody.result.Result;
import com.dp.requestbody.service.InspectionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/inspection")
public class InspectionController {

    private InspectionService inspectionService;

    @GetMapping("/findInspectionListAll")
    public Result<Inspection> findInspectionListAll(){
        try {
            return Result.success(inspectionService.findListAll(),"查询成功");
        } catch (Exception e){
            log.error("查询异常,{}",e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    @PostMapping("/findInspection")
    public Result<Inspection> findInspection(@RequestBody PageModel pageModel){
        try {
            List<Inspection> list = inspectionService.findList(pageModel);
            return Result.success(list,"查询成功");
        } catch (Exception e) {
            log.error("查询异常,{}",e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    @GetMapping("/statisticForPastMonth")
    public Result<Map<Object, List<HashMap<String, Object>>>> statisticForPastMonth(){
        return Result.success(inspectionService.statisticForPastMonth(),"查询成功");
    }

    @GetMapping("/statisticForPastSevenDay")
    public Result<HashMap<String,Object>> statisticForPastSevenDay(){
        try {
            return Result.success(inspectionService.statisticForPastSevenDay(),"查询成功");
        } catch (Exception e) {
            log.error("查询异常,{}",e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    @GetMapping("/statisticStatusForPastMonth")
    public Result<HashMap<String,Object>> statisticStatusForPastMonth(){
        try {
            return Result.success(inspectionService.statisticStatusForPastMonth(),"查询成功");
        } catch (JsonProcessingException e) {
            log.error("查询异常,{}",e.getMessage());
            return Result.error(e.getMessage());
        }
    }

    @PostMapping("/insertData")
    public Result<Inspection> insertData(@RequestBody Inspection inspection){
        try {
            if (ObjectUtils.isEmpty(inspection)){
                throw new Exception("空数据，插入异常！");
            }
            inspectionService.insertData(inspection);
            ArrayList<Inspection> inspections = new ArrayList<>();
            inspections.add(inspection);
            return Result.success(inspections,"插入成功！");
        } catch (Exception e){
            log.error("插入异常,{}",e.getMessage());
            return Result.error("插入异常"+e.getMessage());
        }
    }

}

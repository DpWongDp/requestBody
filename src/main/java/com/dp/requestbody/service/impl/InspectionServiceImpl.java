package com.dp.requestbody.service.impl;

import com.dp.requestbody.mapper.InspectionMapper;
import com.dp.requestbody.model.Inspection;
import com.dp.requestbody.model.PageModel;
import com.dp.requestbody.service.InspectionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class InspectionServiceImpl implements InspectionService {

    private InspectionMapper inspectionMapper;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<Inspection> findListAll() {
        return inspectionMapper.findListAll();
    }


    @Override
    public List<Inspection> findList(PageModel pageModel) {
        pageModel.setOffset((pageModel.getPageNum() - 1) * pageModel.getPageSize());

        return inspectionMapper.findList(pageModel);
    }

    @Override
    public Map<Object, List<HashMap<String, Object>>> statisticForPastMonth() {
        List<HashMap<String, Object>> mapList = inspectionMapper.statisticForPastMonth();
        Map<Object, List<HashMap<String, Object>>> line = mapList.stream().collect(Collectors.groupingBy(map -> map.get("line").toString()));
        return line;
    }

    @Override
    public List<HashMap<String,Object>> statisticForPastSevenDay() {
        return inspectionMapper.statisticForPastSevenDay();
    }

    @Override
    public HashMap<String,Object> statisticStatusForPastMonth() throws JsonProcessingException {
        return inspectionMapper.statisticStatusForPastMonth();
    }

    @Override
    public void insertData(Inspection inspection) {
        inspectionMapper.insertInspection(inspection);
    }
}

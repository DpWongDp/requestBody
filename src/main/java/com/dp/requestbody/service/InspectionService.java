package com.dp.requestbody.service;

import com.dp.requestbody.model.Inspection;
import com.dp.requestbody.model.PageModel;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InspectionService {
    List<Inspection> findListAll();

    List<Inspection> findList(PageModel pageModel);

    Map<Object, List<HashMap<String, Object>>> statisticForPastMonth();

    List<HashMap<String,Object>> statisticForPastSevenDay();

    HashMap<String,Object> statisticStatusForPastMonth() throws JsonProcessingException;

    void insertData(Inspection inspection);
}

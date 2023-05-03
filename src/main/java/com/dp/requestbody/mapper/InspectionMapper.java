package com.dp.requestbody.mapper;


import com.dp.requestbody.model.Inspection;
import com.dp.requestbody.model.PageModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface InspectionMapper {
    List<Inspection> findListAll();

    List<Inspection> findList(PageModel pageModel);

    List<HashMap<String,Object>> statisticForPastMonth();

    List<HashMap<String,Object>> statisticForPastSevenDay();

    HashMap<String,Object> statisticStatusForPastMonth();

    void insertInspection(Inspection inspection);
}

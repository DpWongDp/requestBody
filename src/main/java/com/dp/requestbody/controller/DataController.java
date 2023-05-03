package com.dp.requestbody.controller;

import com.dp.requestbody.mapper.CubeOrganizerConfigMapper;
import com.dp.requestbody.model.CubeOrganizerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("Data")
public class DataController {

    @Autowired
    private CubeOrganizerConfigMapper cubeOrganizerConfigMapper;

    @GetMapping("getDataFrom")
    public String getWsData() throws ParseException {
        CubeOrganizerConfig organizerConfigByFieldKey = cubeOrganizerConfigMapper.getOrganizerConfigByFieldKey();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime = sdf.parse(organizerConfigByFieldKey.getFIELDVALUE());
        Date date = new Date();
        if (date.getTime() - startTime.getTime() < 3000){
            return "3S內反復調用接口，不予操作";
        }
        return organizerConfigByFieldKey.getFIELDVALUE();
    }
}

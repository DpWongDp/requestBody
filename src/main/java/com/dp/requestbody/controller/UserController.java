package com.dp.requestbody.controller;

import com.alibaba.fastjson.JSONObject;
import com.dp.requestbody.mapper.CubeOrganizerConfigMapper;
import com.dp.requestbody.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {
    @PostMapping("getUserData")
    public String getUserData(@RequestBody User user){
        log.info(user.toString());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("message",user.toString());
        return jsonObject.toString();
    }

    @GetMapping("getUserData")
    public String getUserData(){
        return "五花猪！";
    }
}

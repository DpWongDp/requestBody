/*
package com.dp.requestbody.controller;


import com.dp.requestbody.model.User;
import com.dp.requestbody.util.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/report")
public class ExportController{

    */
/**
     * 导出报表
     * @return
     *//*

    @RequestMapping(value = "/export")
    @ResponseBody
    public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取数据
        List<User> list = new ArrayList<User>();
        String content[][] = new String[10][];
        User user = new User("dp",24,"宇宙无敌");
        User user2 = new User("adan",22,"地球无敌");
        User user3= new User("rn",25,"beautifulGirl");

        list.add(user);
        list.add(user2);
        list.add(user3);

        //excel标题
        String[] title = {"名称","年龄","外号"};

        //excel文件名
        String fileName = "学生信息表"+System.currentTimeMillis()+".xls";

        //sheet名
        String sheetName = "学生信息表";

        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            User obj = list.get(i);
            content[i][0] = obj.getName();
            content[i][1] = String.valueOf(obj.getAge());
            content[i][2] = obj.getRemark();
        }

        HSSFWorkbook wb = ExcelUtil.initTitleEX(sheetName, title, content, null);

            //响应到客户端
            try {
                this.setResponseHeader(response, fileName);
                OutputStream os = response.getOutputStream();
                wb.write(os);
                os.flush();
                 os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }}*/

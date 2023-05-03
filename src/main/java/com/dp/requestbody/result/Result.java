package com.dp.requestbody.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private int code;
    private List<T> data;
    private int nums;
    private String message;

    public static <T> Result<T> success(T data,String message){
        ArrayList<T> list = new ArrayList<>();
        list.add(data);
        return success(list,message);
    }

    public static <T> Result<T> success(List<T> data,String message){
        return new Result<>(200,data, data.size(), message);
    }

    public static <T> Result<T> error(String message){
        return new Result<>(500,null,0,message);
    }
}

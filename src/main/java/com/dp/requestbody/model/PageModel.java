package com.dp.requestbody.model;

import lombok.Data;

@Data
public class PageModel {
    private int pageSize;
    private int pageNum;
    private int offset;
    private Inspection inspection;
}

package com.dp.requestbody.model;

import lombok.Data;

@Data
public class CubeOrganizerConfig {
    private Double AUTOID;
    private Double TENANTSID;
    private Double ORGANIZERID;
    private String FIELDKEY;
    private String FIELDVALUE;
    private String FIELDTEXT;
    private String DESCRIPTION;
    private Double PARENTID;
    private Integer NODEFLAG;
    private Integer DELETEFLAG;
}
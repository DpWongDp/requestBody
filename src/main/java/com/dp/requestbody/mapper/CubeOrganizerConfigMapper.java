package com.dp.requestbody.mapper;

import com.dp.requestbody.model.CubeOrganizerConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CubeOrganizerConfigMapper {
    CubeOrganizerConfig getOrganizerConfigByFieldKey();
}

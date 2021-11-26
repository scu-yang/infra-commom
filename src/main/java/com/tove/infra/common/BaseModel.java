package com.tove.infra.common;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    private Long id;

    private Date dbCreateTime;
    private Date dbModifyTime;
}

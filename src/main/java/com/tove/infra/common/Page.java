package com.tove.infra.common;

import lombok.Data;

@Data
public class Page {

    private int currPage = 1;
    private int pageSize = 20;

}

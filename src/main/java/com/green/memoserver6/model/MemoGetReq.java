package com.green.memoserver6.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder

public class MemoGetReq {
    private String searchText;
    private String page;
}

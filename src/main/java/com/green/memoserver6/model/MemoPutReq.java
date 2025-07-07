package com.green.memoserver6.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class MemoPutReq {
    private int id;
    private String title;
    private String content;
}

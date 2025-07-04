package com.green.memoserver6.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class MemoPostReq {
    private String title;
    private String content;
}

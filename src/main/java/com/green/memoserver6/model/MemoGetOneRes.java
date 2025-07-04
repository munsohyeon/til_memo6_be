package com.green.memoserver6.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MemoGetOneRes {
    private String title;
    private String content;
    private String createdAt;
}

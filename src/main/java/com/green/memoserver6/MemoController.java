package com.green.memoserver6;

import com.green.memoserver6.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Service
@RestController
@RequiredArgsConstructor
@RequestMapping("practice/memo")
public class MemoController {
    private final MemoService memoService;// 반드시 final 붙여야 @RequiredArgsConstructor가 주입함

    @PostMapping
    public ResultResponse<Integer> post(@RequestBody MemoPostReq req) {
        log.info("req{}=", req);
        int result = memoService.postMemo(req);
        return new ResultResponse<>("insert success", result);
    }
}

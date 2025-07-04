package com.green.memoserver6;

import com.green.memoserver6.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor

public class MemoService {
    private final MemoMapper memoService;
    public int postMemo(MemoPostReq p) {
        return memoService.postMemo(p);
    }

}

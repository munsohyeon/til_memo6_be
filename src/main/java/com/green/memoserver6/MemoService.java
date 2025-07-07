package com.green.memoserver6;

import com.green.memoserver6.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor

public class MemoService {
    private final MemoMapper memoService;
    public int postMemo(MemoPostReq p) {
        return memoService.postMemo(p);
    }

    public List<MemoGetRes> getListMemo(MemoGetReq p) {
        return memoService.getListMemo(p);
    }

    public MemoGetOneRes getMemo(int id) {
        return memoService.getMemo(id);
    }

    public int put(MemoPutReq req) {
        return memoService.putMemo(req);
    }

    public int delete(int id) {
        return memoService.deleteMemo(id);
    }
}

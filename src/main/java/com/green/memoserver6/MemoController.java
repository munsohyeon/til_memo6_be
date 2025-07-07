package com.green.memoserver6;

import com.green.config.model.ResultResponse;
import com.green.memoserver6.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Service
@RestController
@RequiredArgsConstructor
@RequestMapping("practice/memo")
@CrossOrigin(origins = "http://localhost:5173")
public class MemoController {
    private final MemoService memoService;// 반드시 final 붙여야 @RequiredArgsConstructor가 주입함

    @PostMapping
    public ResultResponse<Integer> post(@RequestBody MemoPostReq req) {
        log.info("req{}=", req);
        int result = memoService.postMemo(req);
        return new ResultResponse<>("insert success", result);
    }

    @GetMapping
    public ResultResponse<List<MemoGetRes>> getList(@ModelAttribute MemoGetReq req) {
        log.info("req{}=", req);
        List<MemoGetRes> result = memoService.getListMemo(req);
        String message = String.format("row: %d", result.size());
        return new ResultResponse<>(message, result);
    }

    @GetMapping("/{id}")
        public ResultResponse<MemoGetOneRes> get(@PathVariable int id) {
        log.info("id{}=", id);
        MemoGetOneRes result = memoService.getMemo(id);
        return new ResultResponse<>("select success", result);
        }

    @PutMapping
        public ResultResponse<Integer> put(@RequestBody MemoPutReq req) {
        log.info("req{}=", req);
        int result = memoService.put(req);
        return new ResultResponse<>("update success", result);
        }

    @DeleteMapping
        public ResultResponse<Integer> delete(@RequestParam int id) {
        log.info("id{}=", id);
        int result = memoService.delete(id);
        return new ResultResponse<>("delete success", result);
        }

}

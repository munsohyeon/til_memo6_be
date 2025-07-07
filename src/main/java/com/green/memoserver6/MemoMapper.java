package com.green.memoserver6;

import com.green.memoserver6.model.MemoGetOneRes;
import com.green.memoserver6.model.MemoGetReq;
import com.green.memoserver6.model.MemoGetRes;
import com.green.memoserver6.model.MemoPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    int postMemo(MemoPostReq p);
    List<MemoGetRes> getListMemo(MemoGetReq p);
    MemoGetOneRes getMemo(int id);
    int putMemo(MemoPutReq req);
    int deleteMemo(int id);
}

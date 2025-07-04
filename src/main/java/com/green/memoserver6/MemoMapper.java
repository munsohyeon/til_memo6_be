package com.green.memoserver6;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    int postMemo(MemoPostReq p);
}

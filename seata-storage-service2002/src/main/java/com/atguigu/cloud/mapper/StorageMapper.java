package com.atguigu.cloud.mapper;

import org.apache.ibatis.annotations.Param;

import com.atguigu.cloud.entities.Storage;

import tk.mybatis.mapper.common.Mapper;

public interface StorageMapper extends Mapper<Storage> {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
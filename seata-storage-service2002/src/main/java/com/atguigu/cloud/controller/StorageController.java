package com.atguigu.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.service.StorageService;

import cn.cnowse.resp.ResultData;
import jakarta.annotation.Resource;

/**
 * @auther zzyy
 * @create 2024-01-06 16:09
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public ResultData decrease(Long productId, Integer count) {

        storageService.decrease(productId, count);
        return ResultData.success("扣减库存成功!");
    }

}

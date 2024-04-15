package com.atguigu.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.serivce.OrderService;

import cn.cnowse.resp.ResultData;
import jakarta.annotation.Resource;

/**
 * @auther zzyy
 * @create 2024-01-06 15:56
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order) {
        orderService.create(order);
        return ResultData.success(order);
    }

}

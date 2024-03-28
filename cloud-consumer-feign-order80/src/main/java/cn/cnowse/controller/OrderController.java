package cn.cnowse.controller;

import cn.cnowse.entity.PayDTO;
import cn.cnowse.feign.PayFeignApi;
import cn.cnowse.resp.ResultData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

/**
 * @author Jeong Geol 2024-3-26
 */
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final PayFeignApi payFeignApi;

    @GetMapping("/feign/pay/{id}")
    public ResultData getById(@PathVariable("id") Integer id) {
        return payFeignApi.getPayInfo(id);
    }

}

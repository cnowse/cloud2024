package cn.cnowse.controller;

import cn.cnowse.entity.PayDTO;
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

    public static final String PAYMENT_SRV_URL = "http://cloud-payment-service";

    private final RestTemplate restTemplate;

    @GetMapping("/consumer/pay/add")
    public ResultData addOrder(PayDTO payDTO) {
        return restTemplate.postForObject(PAYMENT_SRV_URL + "/pay/add", payDTO, ResultData.class);
    }

    @GetMapping("/consumer/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PAYMENT_SRV_URL + "/pay/" + id, ResultData.class, id);
    }

}

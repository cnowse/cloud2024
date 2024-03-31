package cn.cnowse.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.cnowse.entity.PayDTO;
import cn.cnowse.resp.ResultData;

/**
 * @author Jeong Geol 2024-3-28
 */
@FeignClient("cloud-payment-service")
public interface PayFeignApi {

    @GetMapping("/pay/add")
    ResultData<?> addOrder(PayDTO payDTO);

    @GetMapping("/pay/{id}")
    ResultData<?> getPayInfo(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/circuit/{id}")
    String myCircuit(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/bulkhead/{id}")
    String myBulkhead(@PathVariable("id") Integer id);

    @GetMapping(value = "/pay/ratelimit/{id}")
    String myRatelimit(@PathVariable("id") Integer id);

}

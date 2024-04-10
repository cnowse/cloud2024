package cn.cnowse.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.cnowse.entity.PayDTO;
import cn.cnowse.resp.ResultData;

/**
 * @author Jeong Geol 2024-3-28
 */
// @FeignClient("cloud-payment-service")
@FeignClient("cloud-gateway")
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

    @GetMapping(value = "/pay/micrometer/{id}")
    String myMicrometer(@PathVariable("id") Integer id);

    /**
     * GateWay进行网关测试案例01
     */
    @GetMapping(value = "/pay/gateway/get/{id}")
    ResultData getById(@PathVariable("id") Integer id);

    /**
     * GateWay进行网关测试案例02
     */
    @GetMapping(value = "/pay/gateway/info")
    ResultData<String> getGatewayInfo();

}

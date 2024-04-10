package cn.cnowse.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.cnowse.cloud.entities.Pay;
import cn.cnowse.cloud.resp.ResultData;
import cn.cnowse.cloud.service.PayService;
import cn.hutool.core.util.IdUtil;
import jakarta.annotation.Resource;

@RestController
public class PayGateWayController {

    @Resource
    PayService payService;

    @GetMapping(value = "/pay/gateway/get/{id}")
    public ResultData<Pay> getById(@PathVariable("id") Integer id) {
        Pay pay = payService.getById(id);
        return ResultData.success(pay);
    }

    @GetMapping(value = "/pay/gateway/info")
    public ResultData<String> getGatewayInfo() {
        return ResultData.success("gateway info test：" + IdUtil.simpleUUID());
    }

}
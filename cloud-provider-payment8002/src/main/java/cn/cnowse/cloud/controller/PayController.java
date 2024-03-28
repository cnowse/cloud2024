package cn.cnowse.cloud.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.cnowse.cloud.entities.Pay;
import cn.cnowse.cloud.entities.PayDTO;
import cn.cnowse.cloud.resp.ResultData;
import cn.cnowse.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 123
 *
 * @author Jeong Geol 2024-3-3
 */
@Slf4j
@RestController
@RequestMapping("/pay")
@RequiredArgsConstructor
@Tag(name = "支付微服务模块", description = "支付CRUD")
public class PayController {

    private final PayService payService;

    @PostMapping("/add")
    @Operation(summary = "新增", description = "新增支付流水方法,json串做参数")
    public ResultData<String> addPay(@RequestBody Pay pay) {
        log.info(pay.toString());
        int result = payService.add(pay);
        return ResultData.success("成功插入数据：" + result);
    }

    @DeleteMapping("/del/{id}")
    @Operation(summary = "删除", description = "删除支付流水方法")
    public ResultData<Integer> delPay(@PathVariable("id") Integer id) {
        return ResultData.success(payService.delete(id));
    }

    @PutMapping("/update")
    @Operation(summary = "修改", description = "修改支付流水方法")
    public ResultData<String> updatePay(@RequestBody PayDTO dto) {
        Pay pay = new Pay();
        BeanUtils.copyProperties(dto, pay);
        int update = payService.update(pay);
        return ResultData.success("修改成功：" + update);
    }

    @GetMapping("/{id}")
    @Operation(summary = "按照ID查流水", description = "查询支付流水方法")
    public ResultData<Pay> getById(@PathVariable("id") Integer id) {
        log.info("8002被调用");
        return ResultData.success(payService.getById(id));
    }

    @GetMapping("/list")
    public ResultData<List<PayDTO>> list() {
        return ResultData.success(payService.list().stream().map(pay -> {
            PayDTO payDTO = new PayDTO();
            BeanUtils.copyProperties(pay, payDTO);
            return payDTO;
        }).toList());
    }

    @GetMapping("/getInfoByConsul")
    public String getInfo(@Value("${cnowse.info}") String info) {
        return info;
    }

}

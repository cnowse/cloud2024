package cn.cnowse.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Jeong Geol 2024-3-3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayDTO {

    private Integer id;

    /** 支付流水号 */
    private String payNo;

    /** 订单流水号 */
    private String orderNo;

    /** 用户账号 ID */
    private Integer userId;

    /** 交易金额 */
    private BigDecimal amount;

}

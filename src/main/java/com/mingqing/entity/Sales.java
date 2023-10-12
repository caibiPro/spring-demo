package com.mingqing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @TableName Sales
 */
@TableName(value = "Sales")
@Data
public class Sales implements Serializable {

  private static final long serialVersionUID = 1L;
  private Integer saleid;
  private Integer productid;
  private LocalDateTime saledatetime;
  private Integer quantity;
  private BigDecimal price;
  private Integer customerid;
  private Integer storeid;
  private String paymentmethod;
  private String shippingaddress;
}
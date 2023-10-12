package com.mingqing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mingqing.entity.Sales;
import com.mingqing.entity.YearSales;
import com.mingqing.mapper.SalesMapper;
import com.mingqing.service.SalesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mingqing
 * @description 针对表【Sales】的数据库操作Service实现
 * @createDate 2023-10-08 10:11:21
 */
@Service
public class SalesServiceImpl extends ServiceImpl<SalesMapper, Sales> implements SalesService {

  @Autowired
  private SalesMapper salesMapper;

  @Override
  public List<YearSales> getHolidaySales(int startYear, int endYear) {
    return salesMapper.selectHolidaySales(startYear, endYear);
  }
}





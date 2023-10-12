package com.mingqing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mingqing.entity.Sales;
import com.mingqing.entity.YearSales;

import java.util.List;

/**
 * @author mingqing
 * @description 针对表【Sales】的数据库操作Service
 * @createDate 2023-10-08 10:11:21
 */
public interface SalesService extends IService<Sales> {

    List<YearSales> getHolidaySales(int startYear, int endYear);
}

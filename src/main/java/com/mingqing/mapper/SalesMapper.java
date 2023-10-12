package com.mingqing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mingqing.entity.Sales;
import com.mingqing.entity.YearSales;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author mingqing
 * @description 针对表【Sales】的数据库操作Mapper
 * @createDate 2023-10-08 10:11:21
 * @Entity com.mingqing.entity.Sales
 */

@Mapper
public interface SalesMapper extends BaseMapper<Sales> {

  List<YearSales> selectHolidaySales(int startYear, int endYear);
}





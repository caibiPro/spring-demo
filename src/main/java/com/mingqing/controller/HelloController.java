package com.mingqing.controller;

import com.mingqing.entity.YearSales;
import com.mingqing.service.SalesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @Autowired
  private SalesService salesService;

  @GetMapping("/world")
  public String hello() {
    System.out.println("hello world!");
    return "Hello";
  }

  @GetMapping("/sales")
  public List<YearSales> getHolidaySales(int startYear, int endYear) {
    List<YearSales> holidaySales = salesService.getHolidaySales(startYear, endYear);
    System.out.println("holidaySales = " + holidaySales);
    return holidaySales;
  }
}

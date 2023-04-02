package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j  // log.info  相当于python的logging
@SpringBootApplication
@ServletComponentScan  // 扫描@WebServlet @WebFilter @WebListener 注解的类

// 为何不用@MapperScan扫描@Mapper呢
// 因为在EmployeeServiceImpl实际上行已经完成了这一步
// ServiceImpl<EmployeeMapper,Employee>  完成了两者的映射

public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功...");
    }
}

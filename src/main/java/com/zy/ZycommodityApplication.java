package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * spring-boot启动入口
 * 所有类必须在同级目录或下级目录
 */
@SpringBootApplication
@MapperScan("com.zy.*.mapper")//使用tk提供的注解扫描，不然会报错
public class ZycommodityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZycommodityApplication.class, args);
    }
}

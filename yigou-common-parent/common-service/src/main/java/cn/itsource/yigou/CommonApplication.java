package cn.itsource.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 公共服务模块
 */
@SpringBootApplication
@EnableEurekaClient
public class CommonApplication {


    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class,args );
    }

}

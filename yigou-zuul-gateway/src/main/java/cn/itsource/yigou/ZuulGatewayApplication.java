package cn.itsource.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关启动类
 */
@SpringBootApplication
@EnableZuulProxy //标识是网关
@EnableEurekaClient //标识是eureka客户端
public class ZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class,args );
    }
}

package cn.itsource.yigou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("cn.itsource.yigou.mapper")
@EnableFeignClients(basePackages = "cn.itsource.yigou.client")//调用feign的服务接口一定要扫描不扫描productTypeServiceImpl中不能注入xxxfeign的接口
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args );
    }
}

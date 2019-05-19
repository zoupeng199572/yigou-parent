package cn.itsource.yigou.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "YIGOU-COMMON")
public interface RedisClient {

    @PostMapping("/redis")
    void set(@RequestParam("key") String key, @RequestParam("value") String value);

    @GetMapping("/redis")
    String get(@RequestParam("key") String key);
}

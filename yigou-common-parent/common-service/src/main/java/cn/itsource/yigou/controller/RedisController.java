package cn.itsource.yigou.controller;

import cn.itsource.yigou.util.RedisUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    //使用fengin调用需要写接口外部直接调接口就ok

    /**
     * 往redis中设置值
     */
    @PostMapping("/redis")
    public void set(String key,String value){
        RedisUtils.INSTANCE.set(key,value);
    }

    /**
     * 从redis中获取值
     * @param key
     * @return
     */
    @GetMapping("/redis")
    public String get(String key){
        return RedisUtils.INSTANCE.get(key);
    }
}

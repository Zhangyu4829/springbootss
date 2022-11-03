package cn.bdqn;

import cn.bdqn.mapper.springboottmapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: springboott
 * @Description:
 * @Date: 2022-10-31 11:53:16
 * @Author: zhangyu
 */
@SpringBootApplication
public class springboott {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(springboott.class, args);
        springboottmapper spring = run.getBean("spring", springboottmapper.class);
        System.out.println(spring.getquall());
    }
}

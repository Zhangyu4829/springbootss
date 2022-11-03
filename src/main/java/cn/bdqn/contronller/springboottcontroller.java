package cn.bdqn.contronller;

import cn.bdqn.entity.Airqualityindex;
import cn.bdqn.servlet.springboottservlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: springboottcontroller
 * @Description:
 * @Date: 2022-10-31 14:01:35
 * @Author: zhangyu
 */
@Controller
public class springboottcontroller {

    @Autowired
    springboottservlet springsm;

    @GetMapping("/index")
    private String showw(){
        System.out.println("已进入");
        return "index2";
    }

    @GetMapping("queryAll")
    @ResponseBody
    private List<Airqualityindex> show(){
        System.out.println("已进入查询");
        List<Airqualityindex> list=springsm.getquall();
        return list;
    }

}

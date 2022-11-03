package cn.bdqn.servlet;

import cn.bdqn.entity.Airqualityindex;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: springboottservlet
 * @Description:
 * @Date: 2022-10-31 12:03:31
 * @Author: zhangyu
 */

public interface springboottservlet {

    List<Airqualityindex> getquall();
}

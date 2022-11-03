package cn.bdqn.servlet.impl;

import cn.bdqn.entity.Airqualityindex;
import cn.bdqn.mapper.springboottmapper;
import cn.bdqn.servlet.springboottservlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: springboottservletimpl
 * @Description:
 * @Date: 2022-10-31 12:03:43
 * @Author: zhangyu
 */
@Service
public class springboottservletimpl implements springboottservlet {

    @Autowired
    springboottmapper springsm;

    @Override
    public List<Airqualityindex> getquall() {
        return springsm.getquall();
    }
}

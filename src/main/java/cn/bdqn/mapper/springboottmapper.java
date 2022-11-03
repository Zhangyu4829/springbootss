package cn.bdqn.mapper;

import cn.bdqn.entity.Airqualityindex;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: springboottmapper
 * @Description:
 * @Date: 2022-10-31 11:56:15
 * @Author: zhangyu
 */
@Mapper
@Repository
public interface springboottmapper {

    List<Airqualityindex> getquall();

}

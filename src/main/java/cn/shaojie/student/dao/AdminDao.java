package cn.shaojie.student.dao;

import cn.shaojie.student.model.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 少杰
 * @create 2019/6/26  18:08
 */
@Mapper
public interface AdminDao {

    Integer adminLogin(Admin admin);

}

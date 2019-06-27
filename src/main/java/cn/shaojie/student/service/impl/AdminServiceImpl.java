package cn.shaojie.student.service.impl;

import cn.shaojie.student.dao.AdminDao;
import cn.shaojie.student.model.Admin;
import cn.shaojie.student.service.AdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 少杰
 * @create 2019/6/26  20:41
 */
@Service
public class AdminServiceImpl implements AdminServer {

    @Autowired
    AdminDao adminDao;

    @Override
    public Integer adminLogin(Admin admin) {
        Integer count = adminDao.adminLogin(admin);
        return count;
    }


}

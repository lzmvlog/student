package cn.shaojie.student.controller;

import cn.shaojie.student.model.Admin;
import cn.shaojie.student.service.AdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author 少杰
 * @create 2019/6/26  17:20
 */
@Controller
public class AdminController {

    @Autowired
    AdminServer adminServer;

    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/show")
    public String adminLogin(Admin admin, HttpSession session){
        if (adminServer.adminLogin(admin) == 1){
            session.setAttribute("admin",admin.getAdminName());
            return "show";
        }else {
            return "error";
        }
    }

    @RequestMapping("/showPage")
    public String showPage(){
        return "show";
    }

}

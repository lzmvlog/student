package cn.shaojie.student.controller;

import cn.shaojie.student.model.Student;
import cn.shaojie.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author 少杰
 * @create 2019/6/27  12:08
 */
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    public String selectAllStudentInfo(Model model){
        model.addAttribute("stu",studentService.selectAllStudentInfo());
        return "list";
    }

    @RequestMapping("/addStu")
    public String addStuPage(Model model){
        model.addAttribute("grade",studentService.selectGradeInfo());
        return "addstu";
    }

    @PostMapping("/addStuInfo")
    public String addStu(Student student,Model model){
        Integer count = studentService.addStu(student);
        if (count == 1){
            return selectAllStudentInfo(model);
        }
        return "error";
    }

    @GetMapping("/seleteStuByOne/{id}")
    public String seleteStuByOne(@PathVariable("id") Integer id,Model model){
        model.addAttribute("stuOne",studentService.seleteStuByOne(id));
        addStuPage(model);
        // model.addAttribute("grade",studentService.selectGradeInfo());
        return "addstu";
    }

    @DeleteMapping("/deleteStu/{id}")
    public String deleteStu(@PathVariable("id") Integer id,Model model){
        // @PathVariable("id") 取出路径中的数据当做参数
        Integer count = studentService.deleteStu(id);
        if (count == 1 ){
            return selectAllStudentInfo(model);
        }
        return "error";
    }

}

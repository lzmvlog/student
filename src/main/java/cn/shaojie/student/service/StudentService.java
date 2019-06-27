package cn.shaojie.student.service;

import cn.shaojie.student.model.Grade;
import cn.shaojie.student.model.Student;

import java.util.List;

/**
 * @author 少杰
 * @create 2019/6/27  12:09
 */
public interface StudentService {

    List<Student> selectAllStudentInfo();

    List<Grade> selectGradeInfo();

    Integer deleteStu(Integer id);

    Integer addStu(Student student);

    Student seleteStuByOne(Integer id);
}

package cn.shaojie.student.service.impl;

import cn.shaojie.student.dao.StudentDao;
import cn.shaojie.student.model.Grade;
import cn.shaojie.student.model.Student;
import cn.shaojie.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 少杰
 * @create 2019/6/27  12:10
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> selectAllStudentInfo() {
        List<Student> students = studentDao.selectAllStudentInfo();
        return students;
    }

    @Override
    public List<Grade> selectGradeInfo() {
        List<Grade> grades = studentDao.selectGradeInfo();
        return grades;
    }

    @Override
    public Integer deleteStu(Integer id) {
        Integer count = studentDao.deleteStu(id);
        return count;
    }

    @Override
    public Integer addStu(Student student) {
        Integer count = studentDao.addStu(student);
        return count;
    }

    @Override
    public Student seleteStuByOne(Integer id) {
        Student student = studentDao.seleteStuByOne(id);
        return student;
    }
}

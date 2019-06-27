package cn.shaojie.student.dao;

import cn.shaojie.student.model.Grade;
import cn.shaojie.student.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 少杰
 * @create 2019/6/27  12:08
 */
@Mapper
public interface StudentDao {

    List<Student> selectAllStudentInfo();

    List<Grade> selectGradeInfo();

    Integer deleteStu(Integer id);

    Integer addStu(Student student);

    Student seleteStuByOne(Integer id);
}

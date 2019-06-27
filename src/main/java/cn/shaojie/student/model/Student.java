package cn.shaojie.student.model;

import lombok.Data;

/**
 * @author 少杰
 * @create 2019/6/26  17:00
 */
@Data
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private Integer gradeId;

    private Grade grade;
}

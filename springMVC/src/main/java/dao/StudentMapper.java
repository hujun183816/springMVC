package dao;

import model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}
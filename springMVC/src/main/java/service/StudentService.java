package service;

import model.Student;

public interface StudentService {
	int insert(Student record);
	int insertSelective(Student record);
}

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.TestVo;
import service.StudentService;

@Controller
public class Student {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/student")
	public String student(TestVo t){
		System.out.println(t.getList().get(0).getUsername());
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		return "index";
	}
}

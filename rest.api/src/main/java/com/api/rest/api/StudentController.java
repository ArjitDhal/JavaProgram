package com.api.rest.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.api.entity.Student;

@RestController
public class StudentController {
	
	
	@GetMapping("/hello1")
		public List<Student> getStudent(){
			List<Student> studentList =new ArrayList<>();
			Student s1=new Student("abc ",101," BBSR"," Odisha");
			Student s2=new Student("xyz ",102," BBSR","Odisha ");
			Student s3=new Student("def ",103," BBSR"," Odisha");
			Student s4=new Student("mno ",104," BBSR","Odisha");
			
			
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);
			
			return studentList;
			
			
			
	}
	
		
		
}

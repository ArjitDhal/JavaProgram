package com.api.rest.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.api.entity.Student;
import com.api.rest.api.entity.repository.StudentRepository;

@RestController
public class StudentController {
	
	
	@Autowired
	 StudentRepository studentRepository;
	 
	
	@GetMapping("/hello1")
		public List<Student> getStudent(){
			List<Student> studentList =studentRepository.findAll();
			
			/**Student s1=new Student("abc ",101," BBSR"," Odisha");
			Student s2=new Student("xyz ",102," BBSR","Odisha ");
			Student s3=new Student("def ",103," BBSR"," Odisha");
			Student s4=new Student("mno ",104," BBSR","Odisha");
			
			
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);**/
			
			//System.out.println(studentList);
			return studentList;
			
			
	}
	
	@PostMapping("/hello1")
	public Student createStudent(@RequestBody Student student) {
		
		Student dbStudent=studentRepository.save(student);
		return dbStudent;
	}
	
	@PutMapping("/hello1")
	public Student updateStudent(@RequestBody Student student,@PathVariable("id") Integer id) {
		Student updateStudentData=studentRepository.getById(id);
		updateStudentData.setName(student.getName());
		updateStudentData.setCity(student.getCity());
		updateStudentData.setState(student.getState());
		
		Student dbStudent=studentRepository.save(updateStudentData);
		return dbStudent;
		
	}
	
	@DeleteMapping("/hello1/{id}")
	public String deleteUser(@PathVariable("id") Integer id) {
		
		Student dbStudent=studentRepository.getById(id);
		studentRepository.delete(dbStudent);
		return "student Deleted sucessfully";

	}
	
		
		
}

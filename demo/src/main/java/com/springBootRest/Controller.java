package com.springBootRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class Controller {

 
	
	@Autowired
	private ServiceLayer service;

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(path = "/getStudents")
	public List<Student> getStudents() {

		List<String> listName = new ArrayList<>();
		// Map<String, Object> map=new HashMap<>();
		List<Student> list = service.getStudents();

		return list;
	}

	@RequestMapping("/getStudentById/{id}")
	public String getById(@PathVariable("id") int studentId) {

		return " Data recevied  :" + service.getStudentById(studentId);
	}

	@RequestMapping("/getStudentByName/{name}")
	public String getByName(@PathVariable("name") String name) {

		return " Data recevied  :" + service.getStudentByName(name);
	}

	@PostMapping(path = "/save")
	public Student save(@RequestBody Student student) {
		service.saveStudent(student);
		return student;
	}

	@PostMapping(path = "/saveAll")
	public List<Student> saveAll(@RequestBody List<Student> student) {
		List<Student> list = service.saveStudents(student);
		return list;
	}

	@PutMapping(path = "/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);

	}

	@DeleteMapping(path = "/delete/{id}")
	public String deleteStudent(@PathVariable int id) {

		return " Data deleted  :" + service.deleteStudent(id);

	}

	@GetMapping("/get/{city}")
	public Student getStuddentByCity(@PathVariable("city") String city) {
		return studentRepository.getByCity(city);
	}

	@GetMapping("/getAllStudent")
	public List<Student> getStuddentList() {

		List<Student> student = studentRepository.getAllStudents();

		return student;
	}

	@GetMapping("/get/{city}/{email}")
	public Student getStuddentByCityNEmail(@PathVariable("city") String city, @PathVariable("email") String email) {
		return studentRepository.getStudentByCityNEmail(city, email);
	}

	@Lookup
	public ServiceLayer get() {
		return null;
	}

}

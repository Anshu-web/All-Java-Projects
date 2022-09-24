package com.springBootRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> saveStudents(List<Student> student) {
		return repository.saveAll(student);
	}

	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Student getStudentByName(String name) {
		return repository.findByName(name).orElse(null);
	}

	public List<Student> getStudents() {
		return repository.findAll();
	}

	public Student updateStudent(Student student) {
		Student existingProduct = repository.findById(student.getId()).orElse(null);
		existingProduct.setName(student.getName());
		existingProduct.setCity(student.getCity());
		existingProduct.setEmail(student.getEmail());
		return repository.save(existingProduct);

	}

	public String deleteStudent(int id) {
		repository.deleteById(null);

		return "Student details deleted with id  :" + id;
	}

}

package com.springBootRest;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Optional<Student> findByName(String name);
	
	// Below Query will fetch the data based on condition
	
	@Query("select s FROM Student s where s.city=:n")
	public Student getByCity(@Param("n") String city);
	
	
	// Below Query will fetch the list of all the student list

	@Query("select s FROM Student s")
	public List<Student> getAllStudents();
	
	
	@Query("select s FROM Student s where s.city=:n and s.email=:e")
	public Student getStudentByCityNEmail(@Param("n") String city,@Param("e") String email);

}

package com.onetoonemapping.repository;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.onetoonemapping.model.Gender;
import com.onetoonemapping.model.User;
import com.onetoonemapping.model.UserProfile;

@SpringBootApplication
@EnableJpaRepositories("com.onetoonemapping.repository")
public class JpaOneToOneDemoApplication implements CommandLineRunner {

	
	

	public static void main(String[] args) {

		SpringApplication.run(JpaOneToOneDemoApplication.class, args);
	}
	@Autowired
	 UserRepository ur;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Clean up database tables
		// userprofilerepository.deleteAllInBatch();
		// userrepository.deleteAllInBatch();

		// =========================================

		// Create a User instance
		User user = new User();
		
		User user1=new User(12L, "Rahul", "Sharma", "r@gmail.com","password1");

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1992, 7, 21);

		// Create a UserProfile instance
		UserProfile userProfile = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(), "747",
				"2nd Cross", "Golf View Road, Kodihalli", "Bangalore", "Karnataka", "India", "560008");

		// Set child reference(userProfile) in parent entity(user)
		user.setUserProfile(userProfile);

		// Set parent reference(user) in child entity(userProfile)
		userProfile.setUser(user);

		// Save Parent Reference (which will save the child as well)
		ur.save(user);

		// =========================================
	}
}

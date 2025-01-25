package com.oto.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oto.entity.Passport;
import com.oto.entity.Person;
import com.oto.repository.PassportRepository;
import com.oto.repository.PersonRepository;
@Component
public class MyRunner implements CommandLineRunner {

//	@Autowired
//	PersonRepository personRepo;
	@Autowired
	PassportRepository passportRepo;
	@Override
	public void run(String... args) throws Exception {
     
		Person person =new Person();
		person.setPersonId(1001);
		person.setPersonName("Bhushan");
		Passport passport=new Passport();
		passport.setPassportNo(200898);
		passport.setExpDate(LocalDate.of(2040, 8, 20));
		passport.setPerson(person);
		passportRepo.save(passport); 
	}

}

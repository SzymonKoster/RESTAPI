package com.example.restapi;

import com.example.restapi.model.Enums.Gender;
import com.example.restapi.model.Enums.StudentCondition;
//import com.example.restapi.model.FieldOfStudy;
import com.example.restapi.model.Group;
import com.example.restapi.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args)  {
		SpringApplication.run(RestapiApplication.class, args);
	}

//	@Profile("demo")
//	@Bean
//	CommandLineRunner initDatabase(StudentRepository repository) {
//		return args -> {
//			Student Adam = new Student(1, "Adam", "Kowalski", StudentCondition.Obecny, 2001, Gender.mezczyzna, 90);
//			Student Oskar = new Student(2, "Oskar", "Sandomierski", StudentCondition.Nieobecny, 2000, Gender.mezczyzna, 92);
//			Student Bartek = new Student(3, "Bartek", "Adamczyk", StudentCondition.Chory, 2001, Gender.mezczyzna, 70);
//			Student Zygmunt = new Student(4, "Zygmunt", "Lesny", StudentCondition.Obecny, 2000, Gender.mezczyzna, 99);
//			Student Czarek = new Student(5, "Czarek", "Kowalski", StudentCondition.Odrabiajacy, 2001, Gender.mezczyzna, 62);
//			Student Leszek = new Student(6, "Leszek", "Glowacki", StudentCondition.Chory, 1999, Gender.mezczyzna, 58);
//
//			Student Kasia = new Student(7, "Kasia", "Glowacka", StudentCondition.Chory, 2003, Gender.kobieta, 50);
//			Student Amelia = new Student(8, "Amelia", "Wozniak", StudentCondition.Nieobecny, 1998, Gender.kobieta, 27);
//			Student Eleonora = new Student(9, "Eleonora", "Szymborska", StudentCondition.Chory, 2003, Gender.kobieta, 50);
//			Student Marcin = new Student(10, "Marcin", "Kowalczyk", StudentCondition.Odrabiajacy, 1995, Gender.mezczyzna, 86);
//
//			Group Grupa1 = new Group("Grupa 1", 10);
//			Group Grupa2 = new Group("Grupa 2", 5);
//			Group Grupa3 = new Group("Grupa 3", 12);
//			Group Grupa4 = new Group("Grupa 4", 20);
//
//
//			Grupa1.addStudent(Adam);
//			Grupa1.addStudent(Oskar);
//			Grupa1.addStudent(Bartek);
//			Grupa1.addStudent(Zygmunt);
//			Grupa1.addStudent(Czarek);
//			Grupa1.addStudent(Leszek);
//
//			Grupa2.addStudent(Kasia);
//			Grupa2.addStudent(Amelia);
//			Grupa2.addStudent(Eleonora);
//			Grupa2.addStudent(Marcin);
//
//			Map<String,Group> tempMap = new HashMap<>();
//			tempMap.put("Grupa1",Grupa1);
//			tempMap.put("Grupa2",Grupa2);
//			tempMap.put("Grupa3",Grupa3);
//			tempMap.put("Grupa4",Grupa4);
//
//			repository.save(new FieldOfStudy(tempMap));
//
//		};
//	}

}

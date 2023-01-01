package com.example.restapi;

import com.example.restapi.model.FieldOfStudy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestapiApplication {
////	@Autowired
//	FieldOfStudy InformatykaTechniczna;

	public static void main(String[] args)  {
		SpringApplication.run(RestapiApplication.class, args);
	}

////	@Override
//	public void run(String... args) throws Exception {
//		InformatykaTechniczna.init();
//	}

}

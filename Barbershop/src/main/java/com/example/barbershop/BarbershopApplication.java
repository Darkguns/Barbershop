package com.example.barbershop;

import com.example.barbershop.Record.Record;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class BarbershopApplication
{

	public static void main(String[] args) {
		System.out.println("dev-tutorial");
		SpringApplication.run(BarbershopApplication.class, args);
	}


}

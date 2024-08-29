package com.app.Backend;

import com.app.Backend.entity.Unit;
import com.app.Backend.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class BackendApplication implements CommandLineRunner {
	private final UnitService unitService;

	public static void main(String[] args) {


		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Unit unit1 = new Unit();
		unit1.setAbbreviation("BCM");
		unit1.setName("Unit1 name");
		unit1.setCluster("GS-OS");

		unitService.save(unit1);
	}
}

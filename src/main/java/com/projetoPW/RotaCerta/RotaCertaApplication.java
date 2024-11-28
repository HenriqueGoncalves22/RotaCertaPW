package com.projetoPW.RotaCerta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;

@SpringBootApplication
public class RotaCertaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RotaCertaApplication.class, args);
	}

	Double valorDespesa = 1500;
	DecimalFormat df = new DecimalFormat("R$ #.##");


}

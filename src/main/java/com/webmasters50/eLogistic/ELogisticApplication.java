package com.webmasters50.eLogistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ELogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELogisticApplication.class, args);

		MovimientoDinero ingreso1 = new MovimientoDinero("EFVP", "Compra Televisor",100000);
		System.out.println(ingreso1.getMontoMovimiento());
		System.out.println(ingreso1.getConceptoMovimiento());

		MovimientoDinero egreso1 = new MovimientoDinero("EFVP","Devolucion Televisor", -100000);
		System.out.println(egreso1.getMontoMovimiento());
		System.out.println(egreso1.getConceptoMovimiento());

		ingreso1.setConceptoMovimiento("Compra Cafe");
		egreso1.setConceptoMovimiento("Devolucion compra cafe");
		System.out.println(ingreso1.getConceptoMovimiento());
		System.out.println(egreso1.getConceptoMovimiento());
		System.out.println(ingreso1.getUsuarioEncargado());
		System.out.println(egreso1.getUsuarioEncargado());
	}

}

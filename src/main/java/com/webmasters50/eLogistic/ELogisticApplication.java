package com.webmasters50.eLogistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ELogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELogisticApplication.class, args);

		MovimientoDinero ingreso1 = new MovimientoDinero(100000, "Compra Televisor","EFVP");
		System.out.println(ingreso1.getMonto());
		System.out.println(ingreso1.getConcepto());

		MovimientoDinero egreso1 = new MovimientoDinero(-100000,"Devolucion Televisor", "EFVP");
		System.out.println(egreso1.getMonto());
		System.out.println(egreso1.getConcepto());

		ingreso1.setConcepto("Compra Cafe");
		egreso1.setConcepto("Devolucion compra cafe");
		System.out.println(ingreso1.getConcepto());
		System.out.println(egreso1.getConcepto());
		System.out.println(ingreso1.getUsuario());
		System.out.println(egreso1.getUsuario());
	}

}

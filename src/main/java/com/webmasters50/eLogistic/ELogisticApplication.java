package com.webmasters50.eLogistic;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ELogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELogisticApplication.class, args);

		Empleado emp1 = new Empleado("Miguel","miguel@gmail.com","Elogistic","admin",null);
		Empresa ep1 = new Empresa("Elogistic","cra11",12345,6896523,emp1);

		System.out.println(ep1.toString());
		/*MovimientoDinero ingreso1 = new MovimientoDinero("evasco", "Compra Televisor",100000);
		System.out.println(ingreso1.getMontoMovimiento());
		System.out.println(ingreso1.getConceptoMovimiento());

		MovimientoDinero egreso1 = new MovimientoDinero("evasco","Devolucion Televisor", -100000);
		System.out.println(egreso1.getMontoMovimiento());
		System.out.println(egreso1.getConceptoMovimiento());

		ingreso1.setConceptoMovimiento("Compra Cafe");
		egreso1.setConceptoMovimiento("Devolucion compra de el cafe");
		System.out.println(ingreso1.getConceptoMovimiento());
		System.out.println(egreso1.getConceptoMovimiento());
		System.out.println(ingreso1.getUsuarioEncargado());
		System.out.println(egreso1.getUsuarioEncargado());

		 */
	}

}

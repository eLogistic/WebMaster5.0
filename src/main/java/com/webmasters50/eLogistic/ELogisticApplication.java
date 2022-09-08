package com.webmasters50.eLogistic;

import com.webmasters50.eLogistic.entidades.Empleado;
import com.webmasters50.eLogistic.entidades.Empresa;
import com.webmasters50.eLogistic.entidades.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ELogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELogisticApplication.class, args);

//
//		MovimientoDinero ingreso1 = new MovimientoDinero("evasco", "Compra Televisor",100000);
//		MovimientoDinero egreso1 = new MovimientoDinero("evasco","Devolucion Televisor", -100000);
//
//		Empresa empresa1 = new Empresa("cooperativa" , "calle 1 11 24", 2111924, 895006565,
//				ingreso1);
//		Empresa empresa2 = new Empresa("logistic" , "carrera 1 21 34", 2334455, 900656533,
//				egreso1);
//
//        Empleado empleado1 = new Empleado("Edwin" , "evasco%gmail.com", "coop", "cajero",empresa1);
//		Empleado empleado2 = new Empleado("Patricia" , "patricia%gmail.com", "coop", "recepcion",empresa2);
//
//		List<Empleado> listaEmpleados = new ArrayList<>();
//		listaEmpleados.add(empleado1);
//		listaEmpleados.add(empleado2);
//
//		List<Empresa> listaEmpresas = new ArrayList<>();
//		listaEmpresas.add(empresa1);
//		listaEmpresas.add(empresa2);
//
//
//		for (int i = 0; i < listaEmpleados.size(); i++) {
//			System.out.println(listaEmpleados.get(i).toString());
//		}
//
//		for (int i = 0; i < listaEmpresas.size(); i++) {
//			System.out.println(listaEmpresas.get(i).toString());
//		}
//

		//System.out.println(ingreso1.getMontoMovimiento());
		//System.out.println(ingreso1.getConceptoMovimiento());


		//System.out.println(egreso1.getMontoMovimiento());
		//System.out.println(egreso1.getConceptoMovimiento());

//		ingreso1.setConceptoMovimiento("Compra Cafe");
//		egreso1.setConceptoMovimiento("Devolucion compra de el cafe");
//		System.out.println(ingreso1.getConceptoMovimiento());
//		System.out.println(egreso1.getConceptoMovimiento());
//		System.out.println(ingreso1.getUsuarioEncargado());
//		System.out.println(egreso1.getUsuarioEncargado());

	}

}

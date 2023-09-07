package org.myProyect;

import java.util.ArrayList;




public class Historial {
	
	
	static ArrayList<Deposito> historialDeposito = new ArrayList<>();
	static ArrayList<Retiro> historialRetiro = new ArrayList<>();
	
	public static void añadirDeposito(Deposito deposito) {
		
		historialDeposito.add(deposito);	
		
		
	}
	public static void añadirRetiro(Retiro retiro) {
		
		historialRetiro.add(retiro);	
		
		
	}
	
	public static void mostrarDepositos() {
		
		for (Deposito deposito : historialDeposito) {
			System.out.println(deposito.detallesDeposito()); 
			  
		}

	}
	public static void mostrarRetiros() {
		
		for (Retiro retiro : historialRetiro) {
			System.out.println(retiro.detallesRetiro()); 
			
		}
		
	}
	
	
}

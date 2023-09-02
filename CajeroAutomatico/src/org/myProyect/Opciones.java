package org.myProyect;

import java.util.Scanner;

public class Opciones {

	static void opcion1() {

		Scanner sc = new Scanner(System.in);
		double saldo = 6_000;
		int opcion;
		boolean salir = false;
		do {
			System.out.println("1) Ver saldo actual");
			System.out.println("2) Retirar");
			System.out.println("3) Regresar al menú principal");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Saldo actual: $" + saldo);
				break;

			case 2:
				System.out.println("Ingresa el monto a retirar (solo se aceptan cantidades mútiplos de 50)");
				
				double cantidadRetiro = sc.nextInt();				
				saldo = retiro(saldo, cantidadRetiro);
				System.out.println(saldo);				
				
				
				break;
			case 3:
				salir = true;
				break;

			default:
				break;
			}

		} while (!salir);

	}
	
	static double retiro(double saldo, double retiro) {
		return saldo - retiro;
	}
	
	
	
	
	
	

	static void opcion2() {

		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean salir = false;
		do {
			System.out.println("1) Ver saldo actual");
			System.out.println("2) Retirar");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("opcion 1 en funcion");
				break;

			case 2:
				System.out.println("opcion 2 salir en funcion");
				salir = true;
				break;

			default:
				break;
			}

		} while (!salir);

	}

}

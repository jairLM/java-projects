package org.myProyect;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion;
		boolean salir = false;

		do {

			System.out.println("1) Retirar dinero");
			System.out.println("2) Hacer deposito");
			System.out.println("3) Consultar saldo");
			System.out.println("4) Quejas");
			System.out.println("5) Ver ultimos movimientos");
			System.out.println("9) Salir");

			try {

				System.out.println("Introduce un numero: ");
				opcion = sc.nextInt();
				sc.nextLine();

				switch (opcion) {
				case 1:
					System.out.println("Seleccionaste la opcion 1");
					Opciones.opcion1();

					break;
				case 2:
					System.out.println("Seleccionaste la opcion 2");
					break;
				case 3:
					System.out.println("Seleccionaste la opcion 3");
					break;
				case 4:
					System.out.println("Seleccionaste la opcion 4");
					break;
				case 5:
					System.out.println("Seleccionaste la opcion 5");
					break;
				case 9:
					System.out.println("Seleccionaste la opcion 9");
					salir = true;
					break;

				default:
					System.out.println("Debes seleccionar solo los numeros que se muestran en el menú");
					break;
				}
				

			} catch (Exception e) {
				System.out.println("Escribe datos válidos");
				sc.nextLine();
			}
			

		} while (!salir);

	}

}

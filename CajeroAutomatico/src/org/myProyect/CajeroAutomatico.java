package org.myProyect;

import java.util.Scanner;

public class CajeroAutomatico {
	static Scanner sc = new Scanner(System.in);
	static int contador;
	public static void main(String[] args) {		

		int opcion;
		boolean salir = false;
		

		do {

			System.out.println("\033[36m1) Retirar dinero");
			System.out.println("2) Hacer deposito");
			System.out.println("3) Consultar saldo");
			System.out.println("4) Quejas");
			System.out.println("5) Ver ultimos movimientos");
			System.out.println("9) Salir");

			try {

				System.out.println("\033[33mIntroduce un numero: ");
				opcion = sc.nextInt();
				sc.nextLine();

				switch (opcion) {
				case 1:				
					Opciones.opcion1();	
					break;
				case 2:					
					Opciones.opcion2();
					break;
				case 3:
					System.out.println("\033[36mSaldo disponible: $"+ Opciones.saldo);
					break;
				case 4:
					System.out.println("No disponible por el momento, intente más tarde");
					break;
				case 5:
					System.out.println("Seleccionaste la opcion 5");
					Historial.mostrarDepositos();
					Historial.mostrarRetiros();
					break;
				case 9:
					System.out.println("Vuelva pronto");
					
					salir = true;
					break;

				default:
					
					System.out.println("Opción inválida, por favor, vuelve a intertar");
					contador++;
					if( contador == 3 ) {
						System.out.println("Vuelva pronto");
						salir = true;
					}
					break;
				}
				

			} catch (Exception e) {
				System.out.println("Escribe datos válidos");
				sc.nextLine();
			}
			

		} while (!salir);

	}

}

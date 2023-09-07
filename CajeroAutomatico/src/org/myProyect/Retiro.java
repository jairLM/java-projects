package org.myProyect;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Retiro {
	
	private double cantidad;
	Date fecha;
	private String tipo;
	
	{
		tipo = "Retiro";
	}
	
	
	Retiro(double cantidad){
		this.cantidad = cantidad;
		this.fecha = new Date();
	}
	
	public double getCantidad() {
		return this.cantidad;
	}
	
	
	public static  double retiro(double saldo, double retiro, double donacion) {
		return saldo - retiro - donacion;
	}
	
	String detallesRetiro() {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd hh:mm");
		return "\033[32m" + ft.format(this.fecha) + " " +   this.tipo + " de $" + getCantidad() ;
		
	}
	
}

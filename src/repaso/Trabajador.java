package repaso;

import java.time.LocalDate;
import java.time.Period;

public class Trabajador {

	private String nombre;
	private LocalDate inicio;
	private double salario;
	
	public Trabajador(String a, LocalDate b, double c) {
		this.nombre=a;
		this.inicio=b;
		this.salario=c;
	}
	
	public double CalcularDiasVacaciones(int b) {
		int a=b*7;
		return a;
	}
	
	public double CalcularAumentoSalarial(int b) {
		int a=b*1000;
		return a;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", inicio=" + inicio + ", salario=" + salario + "]";
	}
	
	
}

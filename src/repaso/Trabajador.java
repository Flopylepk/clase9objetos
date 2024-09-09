package repaso;

import java.time.LocalDate;

public class Trabajador {

	private String nombre;
	private LocalDate inicio;
	private double salario;
	
	public Trabajador(String a, LocalDate b, double c) {
		this.nombre=a;
		this.inicio=b;
		this.salario=c;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", inicio=" + inicio + ", salario=" + salario + "]";
	}
	
	
}

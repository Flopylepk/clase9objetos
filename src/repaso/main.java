package repaso;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate inicio=LocalDate.of(2000, 2, 9);
		LocalDate hoy=LocalDate.now();
		Trabajador fran= new Trabajador("fran", inicio, 2000);
		JOptionPane.showMessageDialog(null, fran);
		Period periodo=Period.between(hoy, inicio);
		int pe=periodo.getYears();
		
		double vacaciones=CalcularDiasVacaciones(pe);
		
		JOptionPane.showMessageDialog(null, "lo que le corresponde de vacaciones es: "+vacaciones);
		
		double aumento=CalcularAumentoSalarial(pe);
		
	}

	}

	



package exerciciobase;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);	
		
		
		
	double segundos, horas, minutos	;
	
	
	System.out.println("Qual é o tempo de duração do evento da fábrica em segundos:");
	segundos= entrada.nextDouble();
		
		
	minutos= (segundos*1)/60;
	horas= (1*segundos)/3600;
	
	System.out.println("Qual é o tempo de duração do evento da fábrica em minutos:" + minutos);
	System.out.println("Qual é o tempo de duração do evento da fábrica em horas:" + horas);	
    
	entrada.close();
	}

}

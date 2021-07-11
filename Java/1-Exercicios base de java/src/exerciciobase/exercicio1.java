package exerciciobase;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		int mes , anos;
		int dias;
		
		System.out.println("Qual é a sua idade em dias:");
		dias = entrada.nextInt();
	
		mes= 573/12 ;
		anos= 573/365;
		
		
		System.out.println("A sua idade em  meses é:" + mes);
		System.out.println("A sua idade em  anos é:" + anos);
	  
		entrada.close();
	}
}


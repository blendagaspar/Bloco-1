package exerciciobase;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1,n2,n3, mediaaluno;
		
		System.out.println("Entre com a nota 1:");
		n1=entrada.nextDouble();
		System.out.println("Entre com a nota 2:");
		n2=entrada.nextDouble();
		System.out.println("Entre com a nota 3:");
		n3=entrada.nextDouble();
		
		mediaaluno=((n1*2) + (n2*3) + (n3*5))/ (2+3+5);
		
		System.out.println("Valor da média:" + mediaaluno);
		
		entrada.close();
	}

}

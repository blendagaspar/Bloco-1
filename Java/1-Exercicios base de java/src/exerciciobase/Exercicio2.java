package exerciciobase;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {


	int dias, mes, anos, idadeemdias;
		
	Scanner entrada = new Scanner(System.in);	
		
	
	System.out.println("Quantos anos voce tem:");
	anos=entrada.nextInt();
	
	System.out.println("Quantos meses se passaram desde o seu anivers�rio :");
	mes=entrada.nextInt();
	
	System.out.println("Quantos dias se passaram desde o teu dia igual ao seu anivers�rio :");
	dias=entrada.nextInt();	
		
		
	idadeemdias= anos*365 + mes*30 + dias ;
	
	System.out.println("A sua idade em dias �:" + idadeemdias);
	
	entrada.close();
	}

}

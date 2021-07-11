package laçodedecisão;

import java.util.Scanner;
public class exercicio4 {

	
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);	
		
	
	int num=0;
	int raizquadradapar , imparaoquadrado;
	
	System.out.println("entre com o número:");
	num =entrada.nextInt();
	
	
	if(num %2 == 0) {
		
		System.out.println("Este número é par:" + num );
		
		raizquadradapar= (int) Math.sqrt(num);
		System.out.println("A raiz quadrada do número par é:" + raizquadradapar );
	}
	 
	else {
		
		System.out.println("Este número é impar:" + num );
		imparaoquadrado= (int) Math.pow(num, 2);
		System.out.println("O número impar elevado ao quadrado:" + imparaoquadrado);
	}
	
	entrada.close();	
	}
	
}	
	

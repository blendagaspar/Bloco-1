package la�odedecis�o;

import java.util.Scanner;
public class exercicio4 {

	
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);	
		
	
	int num=0;
	int raizquadradapar , imparaoquadrado;
	
	System.out.println("entre com o n�mero:");
	num =entrada.nextInt();
	
	
	if(num %2 == 0) {
		
		System.out.println("Este n�mero � par:" + num );
		
		raizquadradapar= (int) Math.sqrt(num);
		System.out.println("A raiz quadrada do n�mero par �:" + raizquadradapar );
	}
	 
	else {
		
		System.out.println("Este n�mero � impar:" + num );
		imparaoquadrado= (int) Math.pow(num, 2);
		System.out.println("O n�mero impar elevado ao quadrado:" + imparaoquadrado);
	}
	
	entrada.close();	
	}
	
}	
	

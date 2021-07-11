package laçodedecisão;

import java.util.Scanner;

public class exercicio1 {

	
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);	
		
	int a, b, c, maior = 0;
	
	System.out.println("entre com o valor de a:");
	a= entrada.nextInt();
	System.out.println("entre com o valor de b:");
	b= entrada.nextInt();
	System.out.println("entre com o valor de c:");
	c=entrada.nextInt();
	
	if(a > b && a> c ) {
		
		maior=a;
	}
		
	else if (b>a && b>c ) {
		
		maior=b;
	}	
		
	else if(c>b && c>a ) {
		
		maior=c;
	}		
		
	System.out.println("O maior valor entre a,b,c:" + maior);
		
	entrada.close();
	}
	
	
}

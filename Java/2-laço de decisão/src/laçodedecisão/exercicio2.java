package laçodedecisão;

import java.util.Scanner;

public class exercicio2 {

        
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);	
			
	
	int a, b, c;
	
	System.out.println("entre com o valor de a:");
	a= entrada.nextInt();
	System.out.println("entre com o valor de b:");
	b= entrada.nextInt();
	System.out.println("entre com o valor de c:");
	c=entrada.nextInt();
	
	if(a > b && b > c) {
		
      System.out.println("Ordem decrescente:" + a + ","+ b +","+ c );
	}
	
	else if (b>a && a>c) {
		
		System.out.println("Ordem decrescente:" + b + ","+ a +","+ c);
	}
		
	
    else if (c> b && b>a) {
		
		System.out.println("Ordem decrescente:" + c + ","+ b +","+ a);
	}
	
	entrada.close();
	}
	

}


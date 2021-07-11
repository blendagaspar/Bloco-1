package exerciciobase;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		double a, b,c,d,e,f,x,y;
		
		
		System.out.println("entre com o valor de a:");
		a=entrada.nextDouble();
		System.out.println("entre com o valor de b:");
		b=entrada.nextDouble();
		System.out.println("entre com o valor de c:");
		c=entrada.nextDouble();
		System.out.println("entre com o valor de d:");
		d=entrada.nextDouble();
		System.out.println("entre com o valor de e:");
		e=entrada.nextDouble();
		System.out.println("entre com o valor de f:");
		f=entrada.nextDouble();
		
		
		x= ((c*e)-(b*f))/((a*e)-(b*d));
		y= ((a*f)-(c*d))/((a*e)-(b*d));
		
		
		System.out.println("entre com o valor de x:"+ x);
		System.out.println("entre com o valor de y:" + y);
		
		entrada.close();
	}

}

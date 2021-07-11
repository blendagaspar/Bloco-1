package exerciciobase;
import java.util.Scanner;
import java.lang.Math;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		
		
		double a, b, c, d, r, s;
		
		System.out.println("entre com o valor de A:");
        a=entrada.nextInt();
        
        System.out.println("entre com o valor de b:");
        b=entrada.nextInt();
        
        System.out.println("entre com o valor de c:");
        c=entrada.nextInt();
		
		r=Math.pow((a+b), 2);
		s=Math.pow((b+c), 2);
		d=(r+s)/2;
		
		System.out.println("O valor do raio é:" + r);
		System.out.println("O valor da área é:" + s);
		System.out.println("O valor do diametro é:" + d);
		
		entrada.close();
	}

}

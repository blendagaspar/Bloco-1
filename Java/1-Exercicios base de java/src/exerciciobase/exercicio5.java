package exerciciobase;
import java.util.Scanner;
public class exercicio5 {
	
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		double x1, y1,x2, y2 , p1, p2, d;
		
		
		System.out.println("entre com x1:");
		x1= entrada.nextDouble();
		System.out.println("entre com x2:");
		x2= entrada.nextDouble();
		System.out.println("entre com y1:");
		y1= entrada.nextDouble();
		System.out.println("entre com y2:");
		y2= entrada.nextDouble();
		
		p1= Math.pow((x2-x1), 2);
		p2= Math.pow((y2-y1), 2);
		
		System.out.println("O valor do ponto 1 é:" + p1);
		System.out.println("O valor do ponto 2 é:" + p2);
		
		
		d=Math.sqrt(p1 + p2);
		
		System.out.println("O valor da distancia dos dois pontos é:" + d);
	
		entrada.close();
	}		
}

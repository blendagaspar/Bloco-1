package exerciciobase;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		

		double custofabrica, custoconsumidor;
		
		System.out.println("entre com o valor de custo de fábrica:");
		custofabrica= entrada.nextDouble();
		
		custoconsumidor= custofabrica + (custofabrica*0.28) + (custofabrica*0.45);
	    System.out.println("O valor do custo do consumidor: "+ custoconsumidor);
		
	    entrada.close();
	}

}

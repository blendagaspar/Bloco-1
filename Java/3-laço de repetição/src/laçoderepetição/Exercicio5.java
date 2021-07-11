package laçoderepetição;
import java.util.Scanner;
public class Exercicio5 {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Programa de soma. Para quando você digitar 0.");
		
		do {
			System.out.println("Digite um número: ");
			x = in.nextInt();
			soma += x;
			
		} while(x != 0);
		
		in.close();
		
		System.out.println("Soma de todos os números: " + soma);

	}

}

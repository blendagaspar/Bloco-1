package la�oderepeti��o;
import java.util.Scanner;
public class Exercicio5 {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Programa de soma. Para quando voc� digitar 0.");
		
		do {
			System.out.println("Digite um n�mero: ");
			x = in.nextInt();
			soma += x;
			
		} while(x != 0);
		
		in.close();
		
		System.out.println("Soma de todos os n�meros: " + soma);

	}

}

package la�oderepeti��o;
import java.util.Scanner;
public class Exercicio6 {

		
	
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x, soma = 0, cont = 0;
		double media;
		System.out.println("Programa: m�dia dos m�ltiplos de 3. O programa encerra quando voc� digita 0.");
		do {
			System.out.println("Digite um n�mero: ");
			x = in.nextInt();
			
			if(x % 3 ==0) {
				soma += x;
				cont++;
			}
		} while (x != 0);
		
		in.close();
		
		media = soma / cont;
		
		System.out.println("A m�dia dos m�ltiplos de 3 � " + media);
	}

}

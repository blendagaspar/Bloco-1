package vetoresEmatrizes;

import java.util.Scanner;

public class Exercicio3 {


	public static void main(String[] args) {
		double[][] matriz = new double[3][3];
		int maior10 = 0;
		
		Scanner in = new Scanner(System.in);
		
		for(int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Digite a posi��o[%d][%d] da matriz[3][3]: ", l, c);
				matriz[l][c] = in.nextDouble();
				
				if (matriz[l][c] > 10)
					maior10++;
			}
		}
		
		in.close();
		
		System.out.println("\nA matriz tem " + maior10 + " valores maiores do que 10.\nEles s�o: ");
		
		for(int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (matriz[l][c] > 10)
					System.out.print(matriz[l][c] + " ");				
			}
		}
	}

}

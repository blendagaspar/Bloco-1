package vetoresEmatrizes;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
		
		int[] vetor = new int[6];
		int somaPar = 0, quantImpar = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 6 valores: ");
		
		for(int i=0; i < 6; i++) {
			vetor[i] = in.nextInt();
			
			if (vetor[i] % 2 == 0) {
				somaPar += vetor[i];
				
			}else 
				quantImpar++;
		}
		
		in.close();
		
		System.out.println("Pares:");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\n\n�mpares:");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\n\nQuantidade de n�meros �mpares digitados: " + quantImpar);
		System.out.println("Soma dos n�meros pares: " + somaPar);
	}

}

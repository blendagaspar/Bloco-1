package vetoresEmatrizes;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma =0;
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println("Soma das posi��es 0, 1 e 5: " + soma);
		
		A[4] = 100;
		
		System.out.println("\nConte�do do vetor: ");
		for (int i = 0; i < 6; i++) {
			System.out.println("A[" + i + "] = " + A[i]);
		}

	}

}


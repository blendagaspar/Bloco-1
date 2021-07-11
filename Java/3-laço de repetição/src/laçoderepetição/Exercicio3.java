package laçoderepetição;
import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		int idade = 0, menor21 = 0, maior50 = 0;
		
		Scanner in = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = in.nextInt();
			
			if(idade < 21 && idade > 0) {
				menor21++;
			} else if (idade > maior50) {
				maior50++;
			}
		}
		
		in.close();
		
		System.out.println("Pessoas com menos de 21 anos: " + menor21);
		System.out.println("Pessoas com mais de 50 anos: " + maior50);
	}
}	
	
	


package la�odedecis�o;

import java.util.Scanner;

public class exercicio3 {

        
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);	
			
	
	
	int idade=0;
	
	System.out.println("Qual � a idade:");
	idade= entrada.nextInt();
	
	if( idade >= 10 && idade <=14  )
	{
		
	System.out.println("A categoria que a pessoa se encontra � infantil: " + idade + " anos" );
	}
	
	else if(idade >=15 && idade <= 17 ) {
		
	System.out.println("A categoria que a pessoa se encontra � juvenil: " + idade + " anos" );	
	}
	
	else if(idade>=28 && idade <= 25 ) {
		
	System.out.println("A categoria que a pessoa se encontra � adulto: " + idade + " anos");	
	}
	
	entrada.close();
  }
	
	
}

package la�oderepeti��o;

import java.util.Scanner;

public class exercicio1 {

	
	public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);	

    
	int i;
	
	for(i= 1000;i <= 1999 ; i++) {
		
		if(i %11 == 5) {

		System.out.println("Os valores de 1000 a 1999 que o resto da divis�o com 5 s�o:"+ i);	
				
	 	}
	 }
	
	entrada.close();
	
	}	
	

	
}
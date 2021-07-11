package laçoderepetição;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

		
		
		
		int num, par=0, impar=0 ; 
		
	
	    for(num=1; num<=10; num++) {
	    	
	    	System.out.println("Entre com o número:");
			num=scan.nextInt();
	    	if(num %2 == 0) {
	    	
	    	par++;
	    
	    	}
	    	
	    	else {
	    	
	    	impar ++;
	    		
	    	}
	    }
	        System.out.println("quantidade de números pares:" + par);
	        System.out.println("quantidade de números pares:" + impar);		
	        
	       
	        
	        
}
}

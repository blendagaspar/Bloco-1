programa
{
	
	funcao inicio()
	{

      inteiro matriz[3][3], soma=0.0 , diagonal=0.0

      para(inteiro i=0; i<3; i++)
      
     {
	 para(inteiro j=0; j<3;j++)
	{
	 escreva("Entre com N1:")
      leia(matriz[i][j]) 

	}
     }

     para(inteiro i=0; i<3; i++)
      
     {
	 para(inteiro j=0; j<3;j++)
	{
	  se(i==j)
	{
	  diagonal = diagonal + matriz[i][j]  
	}
   
	}
     }
      
        escreva("A soma da matriz diagonal:", diagonal)	
      	

      para(inteiro i=0; i<3; i++)
      
     {
	 para(inteiro j=0; j<3;j++)
     {
       soma = soma + matriz[i][j]

     }
      
     }
    
      escreva("\nA soma de todos elementos da matriz:" , soma)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 14, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
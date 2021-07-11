programa
{
	
	funcao inicio()
	{

         real valores[5]
         inteiro i, maior=0

         escreva("escreva os 5 valores de pontuação:")

         para (i=0; i<=4; i++)
         {
         	leia(valores[i])

         }


         maior = valores[0]
         para (i=1; i<=4; i++)
         {
        
         	se( valores[i] > maior)
         	{
         		
         	maior = valores[i]	
         	}
         	
         }
         escreva("a maior pontuação é :", 	maior )
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{



       inteiro vetor[10] , i , media=0.0 , soma = 0.0 


       escreva("escreva os 10 valores de pontuação:")

       para (i=0; i<=9; i++)
         {
         	leia(vetor[i])

         }


        para (i=0; i<=9; i++)
        {
        	
        	soma  = soma + vetor[i]
        	media= soma/10

       
        } 
      escreva("A soma dos valores do vetor é :",  soma)
      escreva("\nA media dos valores do vetor é :",  media)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 9, 15, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
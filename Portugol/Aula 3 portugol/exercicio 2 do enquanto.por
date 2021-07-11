programa
{
	
	funcao inicio()
	{

        inteiro numero

        escreva("digite um número:")
        leia(numero)


        escreva(numero)

        enquanto( numero <=200) // 200 pk precisa ir até 135
         {
        	numero = numero * 3
        	se(numero>100)
        	{
        		
           escreva(" ", numero)
        		
          }
          senao
          {
          	escreva("," , numero)
          }
        
        
          }

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{

         real valordigitado
         real soma=0.0 , soma1


         escreva("digite um valor:")
         leia(valordigitado)

         enquanto(valordigitado != 0.0)
         {
                 soma = soma + valordigitado
                 escreva("total:"  , soma )

                 escreva("\ndigite um valor:")
                 leia(valordigitado)
                
         
         }

         escreva("resuldado:", soma )





	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
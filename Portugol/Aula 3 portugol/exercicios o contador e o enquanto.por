programa
{
	
	funcao inicio()
	{

          inteiro contador =1 
          real numero, media , soma=0.0

          enquanto ( contador <=10) // repetir 10 vezes
          {
          	limpa()
          	escreva("digite o " , contador , "*numero:")
          	leia(numero)

          	soma +=numero
          	contador= contador++
          	
          }


               media=soma/10

               limpa()
               escreva("A média dos números:", media)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
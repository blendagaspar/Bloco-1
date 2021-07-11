programa
{
	
	funcao inicio()
	{


    inteiro soma=0 , total, valor, media, contador=0
    escreva("insira um valor:")
    leia(valor)


    
    enquanto(valor > 1)
    {
    	 soma= soma + valor
    	 contador = contador +1
    	 media= soma/contador
    	 total= contador
    	
    	
    	 limpa()

    	   escreva ("\n Total acumulativo: ", soma)
        escreva ("\n Insira um valor: ")
        leia (valor)

        escreva ("\n A soma dos valores inseridos é: ", soma)
        escreva ("\n A média da soma é: ", media)
        escreva ("\n A quantidade de valores acumulados é: ", total)
    	
    	
    	
    	}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
//Blenda Gaspar
//25/05/2021
//turma25
//exercicio 1- laço de repetição para	
	funcao inicio()
	{
	
        real sal, soma_sal=0.0,  soma_numfilhos=0.0, med_sal, med_filhos ,maiorsal=0.0, perc_100
        real cont100=0.0
        inteiro nf, hab=3 , x

     
        
        para ( x=1; x<=hab ; x++)
        {
           escreva("digite o salário do cidadão:")
           leia(sal)
           
           escreva("digite o número de filhos:")
           leia(nf)

        	 soma_sal = soma_sal + sal
        	 soma_numfilhos = soma_numfilhos + nf

           se(maiorsal < sal)
        {
           maiorsal= sal

        }     
           se (sal <=100)
        {   
           cont100++
        } 
            
       }

          med_sal= soma_sal/hab
          escreva("A media de salários:", med_sal)
          med_filhos= soma_numfilhos/hab
          escreva("\nA media de filhos :", med_filhos)
          escreva("\nMaior salário:", maiorsal )
          perc_100=(cont100*100)/hab
          escreva("\nPercentagem de pessoas que ganham até R$100:", perc_100)
             

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 725; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
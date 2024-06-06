#include <stdio.h>
#include <stdlib.h>

// MAIN
int main(void)
{
	// Quantidade
	int quantidade;
	printf("Digite a quantidade de pessoas para entrevista: ");
	scanf("%d", &quantidade);
	printf("\n");
	
	// Vetor
	int vetor[quantidade], jovem, adultos, idoso, criancas;
	jovem = 0;
	adultos = 0;
	idoso = 0;
	
	// Pegar infos
	for(int i = 0; i < quantidade; i++)
	{
		// Informções
		printf("Digite a idade do entrevistado numero %d: ", i+1);
		scanf("%d", &vetor[i]);
		
		// Check
		if(vetor[i] > 65) idoso++;
		else if(vetor[i] >= 35) adultos++;
		else if(vetor[i] >= 18) jovem++;
		else criancas++;
	}
	
	// Infos
	printf("\n\nQuantidade de idosos entrevistados %d", idoso);
	printf("\n\nQuantidade de adultos entrevistados %d", adultos);
	printf("\n\nQuantidade de jovens entrevistados %d", jovem);
	printf("\n\nQuantidade de criancas entrevistadas %d", criancas);
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
}
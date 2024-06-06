#include <stdio.h>
#include <stdlib.h>

// MAIN
int main(void)
{
	// Quantidade
	int quantidade;
	printf("Digite a quantidade de elementos: ");
	scanf("%d", &quantidade);
	printf("\n");
	
	// Vetor
	int vetor[quantidade], pares, impares;
	for(int i = 0; i < quantidade; i++)
	{
		// Informções
		printf("Digite o numero do elemento %d: ", i+1);
		scanf("%d", &vetor[i]);
		
		// Check
		if(vetor[i] % 2 == 0) pares++;
		else impares++;
	}
	
	// Infos
	printf("\n\nQuantidade de numeros pares digitados %d", pares);
	printf("\nQuantidade de numeros impares digitados %d", impares);
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
}
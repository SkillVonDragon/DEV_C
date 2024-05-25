#include <stdio.h>
#include <stdlib.h>

// Funções
void GetFibonacci(int termos)
{
	// Variaveis
	int termo_1 = 0, termo_2 = 1, proximo_termo;
	
	// Printf & FOR
	printf("\nSerie de fibonacci: \n");
	for(int i = 1; i <= termos; i++)
	{
		// PRINTF
		printf("%d ", termo_1);
		proximo_termo = termo_1 + termo_2;
		termo_1 = termo_2;
		termo_2 = proximo_termo;
	}
	
}

// Main
int main(void)
{
	// Variavel
	int num;
	printf("Digite o numero de termos: ");
	scanf("%d", &num);
	
	// Check num
	if(num <= 0) printf("Por favor, insira um numero positivo.");
	else GetFibonacci(num);
	
	// Quebra de linha
	printf("\n\n");
	
	// Pausar CMD
	system("PAUSE");
}

#include <stdio.h>
#include <stdlib.h>

// Main 
int main(void)
{
	// Vars
	int linha, coluna;
	
	// Print's
	printf("Digite o numero de linhas: "), scanf("%d", &linha);
	printf("Digite o numero de colunas: "), scanf("%d", &coluna);
	
	// Matriz
	int matriz[linha][coluna];
	
	// Printf
	printf("\n\nDigite os elementos da matriz\n");
	for(int count = 0; count < linha; count++)
	{
		for(int count2 = 0; count2 < coluna; count2++)
		{
			printf("Digite o elemento [%d - %d]: ", count+1, count2+1);
			scanf("%d", &matriz[count][count2]);
		}
	}
	
	// Imprimir Matriz
	printf("\n\nMatriz\n");
	for(int count = 0; count < linha; count++)
	{
		for(int count2 = 0; count2 < coluna; count2++)
			printf("%d\t", matriz[count][count2]);
			
		// Quebra de linha
		printf("\n");
	}
	
	// Quebra de linha
	printf("\n\n");
	
	// Pause
	system("pause");
}
#include <stdio.h>
#include <stdlib.h>

// Main
int main(void)
{
	// Variaveis
	int linhas, colunas;
	
	// PRINTF
	printf("Digite o numero de linhas da matriz.\nResposta: "), scanf("%d", &linhas);
	printf("Digite o numero de colunas da matriz.\nResposta: "), scanf("%d", &colunas);
	
	// Vetor
	int matriz[linhas][colunas];
	
	// Ler Matriz
	printf("\nDigite os elementos da matriz.\n");
	for(int count_1 = 0; count_1 < linhas; count_1++) 
	{
		// Elementos
		for(int count_2 = 0; count_2 < colunas; count_2++)
		{	
			printf("Digite o elemento %d da linha %d da coluna %d: ", count_1+1, count_1+1, count_2+1);
			scanf("%d", &matriz[count_1][count_2]);		
		}
	}
		
	// Imprimir Matriz
	printf("\n\nMatriz:\n");
	for(int count_1 = 0; count_1 < linhas; count_1++) 
		for(int count_2 = 0; count_2 < colunas; count_2++) printf("%d\t", matriz[count_1][count_2]);
	
	// Imprimir Diagonal Principal
	printf("\n\nDiagonal principal: \n");
	for(int count_1 = 0; count_1 < linhas; count_1++) 
		for(int count_2 = 0; count_2 < colunas; count_2++) { if(count_1 == count_2) printf("%d\t", matriz[count_1][count_2]); } 
		
	// PAUSAR CMD & QUEBRA DE LINHA
	printf("\n\n");
	system("PAUSE");
}
#include <stdio.h>
#include <stdlib.h>

int tabuada(int numero, int contador) { return numero * contador; }

// MAIN
int main(void)
{
	// Quantidade
	int quantidade, numero;
	
	// PrintF
	printf("Digite o numero maximo da tabuada: ");
	scanf(" %d", &quantidade);
	printf("Agora digite o numero a ser calculado: ");
	scanf(" %d", &numero);
	
	// Tabuada
	printf("\nTabuada\n");
	for(int i = 0; i <= quantidade; i++)
		printf("%d X %d = %d\n", numero, i, tabuada(numero, i));
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
}
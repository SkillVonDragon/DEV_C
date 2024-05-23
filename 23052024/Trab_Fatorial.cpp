#include <stdio.h>
#include <stdlib.h>

// Funções
int calcfatorial(int num)
{
	// Vars
	int fatorial = 1;
	for(int i = 2; i <= num; i++) fatorial = fatorial * i;
	
	// Retornar valor
	return fatorial;
}

// MAIN
int main(void)
{
	// Vars
	int numero;
	printf("Digite um numero positivo: "), scanf("%d", &numero);
	if(numero < 0)
	{
		printf("Erro - Digite um numero positivo\n\n");
		return 1;
	}

	// MSG
	printf("O fatorial de %d e  %d\n\n", numero, calcfatorial(numero));
	system("pause");
}

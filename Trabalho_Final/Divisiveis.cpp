#include <stdio.h>
#include <stdlib.h>

// MAIN
int main(void)
{	
	// Vetor
	int valor[10], divisiveis;
	for(int i = 0; i < 10; i++)
	{
		// Informções
		printf("Digite o numero do elemento %d: ", i+1);
		scanf("%d", &valor[i]);
		
		// Check
		if((valor[i] % 3 == 0) && (valor[i] % 5 == 0)) divisiveis++;
	}
	
	// Infos
	printf("\n\nQuantidade de numeros divisiveis por 3 e 5 e %d", divisiveis);
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
}
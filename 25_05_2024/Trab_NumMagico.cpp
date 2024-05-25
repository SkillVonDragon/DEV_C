#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Main
int main(void)
{
	// Incializar gerador de random
	srand(time(NULL));
	int num_magico = rand() % 501;
	int num_usuario;
	int num_tentativas = 0;
	int acertou = 0;
	
	// MSG
	printf("Bem vindo ao jogo do numero magico.\n");
	printf("Tente adivinhar o numero magico entre 0 e 500\n\n");
	
	// Verificar Numeros
	while(!acertou)
	{
		// MSG
		printf("Qual e o numero magico?\nResposta: ");
		scanf("%d", &num_usuario), num_tentativas++;
		
		// Checks
		if(num_usuario < num_magico) printf("O numero magico e maior\n"), printf("Tente Novamente\n\n");
		else if(num_usuario > num_magico) printf("O numero magico e menor\n"), printf("Tente Novamente\n\n");
		else acertou = 1;
	}
	
	// Info Ganhador
	if(num_tentativas <= 3) printf("\nParabens voce acertou o numero magico (%d) em %d tentativas, voce e muito sortudo.\n\n", num_magico, num_tentativas);
	else if(num_tentativas <= 6) printf("\nParabens voce acertou o numero magico (%d) em %d tentativas, voce e sortudo.\n\n", num_magico, num_tentativas);
	else if(num_tentativas <= 10) printf("\nParabens voce acertou o numero magico (%d) em %d tentativas, voce e normal.\n\n", num_magico, num_tentativas);
	else printf("\nParabens voce acertou o numero magico (%d) em %d tentativas, tente novamente.\n\n", num_magico, num_tentativas);
	
	// Pausar CMD
	system("pause");
}
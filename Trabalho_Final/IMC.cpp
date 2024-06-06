#include <stdio.h>
#include <stdlib.h>

// MAIN
int main(void)
{
	// Quantidade
	float peso, altura, valorimc;
	
	// PrintF
	printf("Digite o peso do individuo: ");
	scanf(" %f", &peso);	
	printf("Digite a altura do individuo: ");
	scanf(" %f", &altura);	
	
	// Quebra de linha & Calcular IMC
	printf("\n");
	valorimc = peso / (altura * altura);
	
	// IFS
	if(valorimc >= 40.0) printf("Este individuo esta com obesidade morbita com %.2f de imc", valorimc);
	else if(valorimc >= 35.0) printf("Este individuo esta com obesidade severa com %.2f de imc", valorimc);
	else if(valorimc >= 30.0) printf("Este individuo esta com obesidade grave com %.2f de imc", valorimc);
	else if(valorimc >= 25.0) printf("Este individuo esta com sobrepeso com %.2f de imc", valorimc);
	else if(valorimc >= 18.5) printf("Este individuo esta com peso normal com %.2f de imc", valorimc);
	else printf("Este individuo esta abaixo do peso com %.2f de imc", valorimc);
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
}
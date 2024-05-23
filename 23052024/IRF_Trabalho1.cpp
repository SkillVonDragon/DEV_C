#include <stdio.h>
#include <stdlib.h>

// Main
int main(void)
{
	// Vars
	int count;
	printf("Digite o numero de salarios: "), scanf("%d", &count);
	
	// Salarios
	float salarios[count], impostos[count];
	for(int i = 0; i < count; i++) printf("Digite o salario %d", i+1), scanf("%f", salarios[i]);
	
	// Calcular IRF
	float imposto, salario;
	for(int i = 0; i < count; i++)
	{
		// Ajuste
		salario = salarios[i];
		imposto = 0.0;
	
		// Checks
		if(salario <= 2112.00) imposto = 0.0;
		else if(salario <= 2826.65) imposto = (salario - 2112.00) * 0.075;
		else if(salario <= 3751.08) imposto = (salario - 2826.65) * 0.15 + (2826.65 - 2112.00) * 0.075;
		else if(salario <= 4664.68) imposto = (salario - 3751.05) * 0.225 + (3751.00 - 2826.65) * 0.15 + (2826.65 - 2112.00) * 0.075;
		else imposto = (salario - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 2112.00) * 0.075;
		
		// Salvar Impostos
		impostos[i] = imposto;
	}
	
	// Mostrar Impostos
	for(int i = 0; i < count; i++) printf("Salario %d valor %.2f imposto %.2f\n", i+1, salarios[i], impostos[i]);
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
	
}
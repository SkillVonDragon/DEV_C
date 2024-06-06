#include <stdio.h>
#include <stdlib.h>

// Struct
typedef struct
{
	char nome[64];
	int matricula;
	float simulado_1;
	float simulado_2;
	float nota_av;
	float media;
} formulario;

// MAIN
int main(void)
{
	// Quantidade
	int quantidade;
	
	// PrintF
	printf("Digite a quantidade de alunos: ");
	scanf("%d", &quantidade);
	
	// Struct
	formulario data[quantidade];
	
	// Inforações
	for(int i = 0; i < quantidade; i++)
	{
		// Informações
		printf("\nDigite o nome do aluno %d: ", i+1);
		scanf(" %s", data[i].nome);		
		printf("Digite a matricula do aluno: ");
		scanf("%d", &data[i].matricula);
		printf("Digite a nota do simulado um deste aluno: ");
		scanf("%f", &data[i].simulado_1);
		printf("Digite a nota do simulado dois deste aluno: ");
		scanf("%f", &data[i].simulado_2);
		printf("Digite a nota da prova av deste aluno: ");
		scanf("%f", &data[i].nota_av);
		
		// Calcular média
		data[i].media = (data[i].simulado_1+data[i].simulado_2+data[i].nota_av)/3;
		if(data[i].media <= 0.0) data[i].media = 0.0;		
	}
	
	// Emitir Informações
	for(int i = 0; i < quantidade; i++)
	{
		printf("\n\nInformacoes do aluno: %s\n", data[i].nome);
		printf("Matricula: %d\n", data[i].matricula);
		printf("Nota do simulado um: %.2f\n", data[i].simulado_1);
		printf("Nota do simulado dois: %.2f\n", data[i].simulado_2);
		printf("Nota da prova av: %.2f\n", data[i].nota_av);
		printf("Media deste aluno: %.2f\n", data[i].media);
	}
	
	// Quebra de linha
	printf("\n\n");
	system("pause");
}
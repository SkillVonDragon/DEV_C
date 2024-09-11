#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// DEFINES
#define TAMANHO 5

// Struct
typedef struct 
{
    int vetor[TAMANHO];
    int topo;
        
}pilhavet;

// Stocks
void empilha(int valor, pilhavet * p)
{
    // Check maximo
    if(p -> topo == TAMANHO - 1)
    {
        printf("\nPilha cheia");
        exit(0);   
    }
    
    // Acessar Ponteiro
    p -> topo++;
    p -> vetor[p -> topo] = valor; 
}
int desempilha(pilhavet * p)
{
    // Var Local
    int auxiliar;
    
    // Verificar Vazio
    if(p -> topo < 0)
    {
        printf("\nPilha vazia.");
        exit(1);
    }
    
    // Acessar Ponteiro
    auxiliar = p -> vetor[p -> topo];
    p -> topo--;
    
    // Retornar Novo valor
    return auxiliar;
}

// Main
int main(void)
{
    // Variaveis - Struct
    pilhavet pilha;
    int valor;
    pilha.topo = -1;
    
    // Loop - Empilha
    for(int i = 0; i < TAMANHO; i++)
    {
        // Info
        printf("\nDigite o valor a ser empilhado: ");
        scanf("%d", &valor);
        
        // Empilhar
        empilha(valor, &pilha);
    }
    
    // Loop - Desempilha
    for(int i = 0; i < TAMANHO; i++)
        printf("\n%d", desempilha(&pilha));
        
    // return
    return 0;
}

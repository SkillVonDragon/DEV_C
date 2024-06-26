#include <stdio.h>
#include <stdlib.h>

// Funções
float AreaRetangulo(float base, float altura) { return base * altura; }
float AreaCirculo(float raio) { return 3.14159 * raio * raio; }
float AreaTriangulo(float base, float altura) { return (base*altura)/2.0; }

// MAIN
int main(void)
{
	// Vars
	float base, altura, raio;
	
	// Retangulo
	printf("Digite a base do retangulo: "), scanf("%f", &base);
	printf("DIgite a altura do retangulo: "), scanf("%f", &altura);
	printf("Area do retangulo: %.2f\n\n", AreaRetangulo(base, altura));
	
	// Circulo 
	printf("Digite o raio do circulo: "), scanf("%f", &raio);
	printf("Area do circulo: %.2f\n", AreaCirculo(raio));
	
	// Triangulo
	printf("Digite a base do triangulo: "), scanf("%f", &base);
	printf("Digite a altura do triangulo: "), scanf("%f", &altura);
	printf("Area do triangulo: %.2f", AreaTriangulo(base, altura));
	
	// Pause
	system("pause");
}
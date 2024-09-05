package br.estacio.input;

import java.util.Scanner;

public class UsersInput 
{
	// Stock De ler ID
	public String lerId()
	{
		System.out.println("Entre com id");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
	public String lerNome()
	{
		System.out.println("Entre com Nome");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
	public String lerEmail()
	{
		System.out.println("Entre com Email");
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
}

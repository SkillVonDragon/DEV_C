package br.estacio;

import br.estacio.input.UsersInput;
import br.estacio.model.Users;

public class UsersApplicattions 
{
	public static void main(String[] args) 
	{
		UsersInput input = new UsersInput();
		Users users = new Users();
		users.setId(new Integer(input.lerId()));
		users.setNome(input.lerNome());
		users.setEmail(input.lerEmail());
	}
}

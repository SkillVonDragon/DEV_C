package br.estacio.service;

import java.util.ArrayList;
import java.util.List;
import br.estacio.model.Users;

public class UserService 
{
	private List<Users> lista;

	public UserService() {
		lista = new ArrayList<Users>();
	}

	public List<Users> Adicionar(Users user) 
	{
		lista.add(user);
		return lista;
	}

	public List<Users> getUsers() {
		return lista;
	}
}

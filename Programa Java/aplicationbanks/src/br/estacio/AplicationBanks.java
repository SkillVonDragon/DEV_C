package br.estacio;

import br.estacio.model.Conta;

public class AplicationBanks {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setId(1001L);
		conta.setNome("Thalles de Souza");
		conta.setSaldo(5000.00d);
		conta.setDeposito(1000.00d);
		conta.depositar();
		System.out.println(conta.getNome() + " = " + conta.getSaldo() + " saldo final ");

	}
}

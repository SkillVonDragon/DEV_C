package br.estacio;

import br.estacio.model.Conta;

public class ApplicationBanks {
	public static void main(String[] args) {
		Conta conta = new Conta(); 
		// Classe para objeto dando espaço de memória para o construtor
		conta.setId(1001L);
		conta.setNome("Geovanna");
		conta.setSaldo(10000d);
		conta.setDeposito(-300d);
		conta.depositar();

		System.out.println(conta.getNome() + " = " + conta.getSaldo() + " saldo final");
	}
}

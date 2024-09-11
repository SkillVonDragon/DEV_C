package banco;

import model.Conta;

public class Aplication {

	
	public static void main(String[] args) {
		Conta conta = new Conta();
			conta.setId(10l);
			conta.setNome("André");
			conta.setSaldo(50000.);
			conta.setDeposito(90.);
			conta.depositar();
			System.out.println(conta.getNome());
			System.out.println(conta.getSaldo());				
	}
}

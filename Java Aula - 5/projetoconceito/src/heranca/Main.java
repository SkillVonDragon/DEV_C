package heranca;

public class Main {
	public static void main(String[] args) 
	{
		Pleno pleno = new Pleno(null, null, null, null, null, null);
		pleno.setHorasmensais(190);
		pleno.setEmail("thalles.s.n@gmail.com");
		pleno.setNome("Thalles de Souza");
		pleno.setSalario(4500.);
		pleno.setSenha("1234");
		
		// Mostrar
		System.out.println(pleno.getNome() + "," + (pleno.getSalario() - pleno.getDesconto()));

	}
}

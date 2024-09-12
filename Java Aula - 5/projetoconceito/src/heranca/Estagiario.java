package heranca;

public class Estagiario extends Programador
{
	
	private Integer horasmensais;

	@Override
	public Double getDesconto() {
		return 1000.;
	}

	public Integer getHorasmensais() {
		return horasmensais;
	}

	public void setHorasmensais(Integer horasmensais) {
		this.horasmensais = horasmensais;
	}

	public Estagiario(String nome, String email, String senha, String acesso, Double salario, Integer horasmensais) {
		super(nome, email, senha, acesso, salario);
		this.horasmensais = horasmensais;
	}
	
	

}

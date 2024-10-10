package herenca;

public class Estagiario	extends Programador {

	
	private String horatrab;

	
	
	
	
	
	
	

	
	public Estagiario(String nome, String sal, String horatrab) {
		super(nome, sal);
		this.horatrab = horatrab;
	}

	

	@Override
	public String toString() {
		return "Estagiario [horatrab=" + horatrab + "]";
	}

	public String getHoratrab() {
		return horatrab;
	}

	public void setHoratrab(String horatrab) {
		this.horatrab = horatrab;
	}
	
	public static void main(String[] args) {
		Estagiario ester = new Estagiario("weslan","1500","60");
		System.out.println(ester);
	}
	
}

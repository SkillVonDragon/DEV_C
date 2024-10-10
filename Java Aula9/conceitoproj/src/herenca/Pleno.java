package herenca;

public class Pleno extends Programador {
	
	private String horatranb;

	
	
	
	
	
	
	public Pleno(String nome, String sal, String horatranb) {
		super(nome, sal);
		this.horatranb = horatranb;
	}

	
	
	@Override
	public String toString() {
		return "Pleno [horatranb=" + horatranb + "]";
	}

	public String getHoratranb() {
		return horatranb;
	}

	public void setHoratranb(String horatranb) {
		this.horatranb = horatranb;
	}
	
	
	public static void main(String[] args) {
		
		Pleno pleno = new Pleno ("60","a","d");
			System.out.println(pleno);
			
	}
}

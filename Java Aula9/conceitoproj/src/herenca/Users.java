package herenca;

import java.util.UUID;

public class Users extends Pessoa{
	
	private String id;
	private String status;
	
	
	
	
	
	
	public Users(String nome, String email, String id, String status) {
		super(nome, email);
		this.id = id;
		this.status = status;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public static void main(String[] args) {
		Users users = new Users("weslan","weslan27@gmail.com",UUID.randomUUID().toString(),"active");
		System.out.println(users);
	}
	
}

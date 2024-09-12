package heranca;

import java.util.UUID;

public class Users extends Pessoa {

	private String id;
	private String status;

	public Users(String nome, String email, String id, String status) {
		super(nome, email);
		this.id = id;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", status=" + status + "]\n" + super.toString();
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
		Users users = new Users("Thalles", "thalles.t.s.n@gmail.com", UUID.randomUUID().toString(), "Active");
		System.out.println(users);
	}
}

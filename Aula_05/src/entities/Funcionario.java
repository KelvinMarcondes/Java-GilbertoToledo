package entities;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String telefone;
	protected Double salario;
	
	public Funcionario(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}

	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
			+  "cpf: " + cpf + "\n"
			+  "telefone: " + telefone + "\n"
			+  "salario: " + String.format("%.2f", this.getSalario());
	}
	

}

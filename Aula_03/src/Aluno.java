
public class Aluno {
	
	private String nome;
	private String matricula;
	private String telefone;
	

	
	public Aluno() {
	}

	public Aluno(String nome, String matricula, String telefone) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	@Override
	public String toString() {
		return  "Nome: " + nome + "\n" + 
				"Matricula: " + matricula + "\n" + 
				"Telefone: " + telefone + "\n";
	}

	
	
}

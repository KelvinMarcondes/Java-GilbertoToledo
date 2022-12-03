package entities;

public class Vendedor extends Funcionario {
	
	
	private int qntVendas;
	private Double comissao;
 
	public Vendedor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	
	@Override
	public double getSalario() {
		return salario + (this.comissao * this.qntVendas);
	}
	

	public int getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	
	
	


}

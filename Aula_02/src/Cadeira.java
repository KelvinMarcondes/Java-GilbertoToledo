
public class Cadeira {
	
	private double altura;
	private double altura_assento;
	private String cor;

	public Cadeira() {
		altura = 0.50;
		altura_assento = 1.20;
		cor = "marrom";
	}
	

	public Cadeira(double altura, double altura_assento, String cor) {
		this.altura = altura;
		this.altura_assento = altura_assento;
		this.cor = cor;
	}



	public void serrar() {
		System.out.println("Serrando a madeira...");
	}
	
	public void lixar() {
		System.out.println("Lixando a madeira...");
	}
	
	public void pintar() {
		System.out.println("Pintar a madeira...");
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getAltura_assento() {
		return altura_assento;
	}

	public void setAltura_assento(float altura_assento) {
		this.altura_assento = altura_assento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if(cor.equals("verde") || cor.equals("vermelho"))
			this.cor = cor;
		else {
			System.out.println("Não existe a cor desejada");
		}
	}
	
	
	
	
}


public class Aula_02 {

	public static void main(String[] args) {
			
/*
		Cadeira c1 = new Cadeira();
	
		c1.serrar();
		
		c1.lixar();
		
		c1.setCor("vermelho");
		c1.pintar();
		
		System.out.println("cor da cadeira: " + c1.getCor());
*/	
		
		Aluno aluno1 = new Aluno("Kelvin");
		aluno1.setMatricula("0001");
		aluno1.setTelefone("11 111111");
		
		
		Aluno aluno2 = new Aluno("Paulo");
		aluno2.setMatricula("0002");
		aluno2.setTelefone("22 222222");
		
		aluno1.imprimeDados();
		
		System.out.println();
		
		aluno2.imprimeDados();

	}

}

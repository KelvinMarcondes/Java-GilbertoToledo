package programa;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("kelvin", "111");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("pedro souza");
		aluno2.setMatricula("222");
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getNome(true));
	}

}

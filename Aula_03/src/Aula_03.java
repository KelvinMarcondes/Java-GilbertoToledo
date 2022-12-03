import java.util.ArrayList;

public class Aula_03 {

	public static void main(String[] args) {
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		//metodo 1
		Aluno aluno1 = new Aluno("kelvin","1111","11 1111");
		listaAlunos.add(aluno1);
		
		
		//metodo 2
		Aluno aluno2 = new Aluno();
		aluno2.setNome("paulo");
		aluno2.setMatricula("22222");
		aluno2.setTelefone("22 2222");
		listaAlunos.add(aluno2);
		
		
		//metodo 3
		listaAlunos.add(new Aluno("pedro", "333", "33 33333"));
		
		
		//imprimir os alunos
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno);
		}
		

	}

}

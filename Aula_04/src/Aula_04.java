
public class Aula_04 {

	public static void main(String[] args) {
		
		
	/*	tratamento de erros.
		
		try = tente isso
		catch = se o try falhar, capture o erro e trate. Podendo tratar vários erros. Vários catch para um unico try
		finally = executa independente se teve erro ou nao
	*/

		try{
			System.out.println(args[0]);
		}
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			System.out.println("obrigado");
		}

	}

}

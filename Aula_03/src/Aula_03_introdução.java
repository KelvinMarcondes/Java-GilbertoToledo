import java.util.ArrayList;

public class Aula_03_introdução {

	public static void main(String[] args) {
	
	//	boolean maior_idade = true;		
	//	int valor = 5;
		
		int valores[] = new int[10];
		valores[0] = 10;
		valores[1] = 20;
		

		
		String nome1 = "kelvin";
		String nome2 = "kelvin";
		
		
		if(nome1.equals(nome2)) {
			System.out.println("Nomes iguais");
		}
		else{
			System.out.println("Nomes diferentes");
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kelvin");
		list.add("Souza");
		list.add("Marcondes");
		
		for (String list1 : list) {
			System.out.println(list1);
		}
		
	}
	
}

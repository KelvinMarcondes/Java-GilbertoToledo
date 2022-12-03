package program;

import java.util.ArrayList;

import entities.Funcionario;
import entities.Motorista;
import entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("kelvin", "222.222.352-43", "11 9238213443");
		vendedor.setSalario(800.0);
		vendedor.setComissao(10.0);
		vendedor.setQntVendas(15);
		
		
		Motorista motorista = new Motorista("paulo", "213.234.564-43", "97 213231244");
		motorista.setSalario(800.0);

/*		
		System.out.println(vendedor);
		System.out.println();
		System.out.println(motorista);
*/
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(vendedor);
		funcionarios.add(motorista);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

}

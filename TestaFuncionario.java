package Funcionario;

import java.util.Scanner;
import java.util.Optional;

public class TestaFuncionario {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {

		Gerente gerente = new Gerente("Rodrigo Pedro", "Curitiba - PR", "Masculino", 29, "253.781.113-99", 16000.00f,
				80);
		Vendedor vendedor = new Vendedor("Camila Pedrosa", "Apucarana - PR", "Feminino", 27, "353.751.213-24",
				346000.00f, 5);
		Gerente gerente2 = new Gerente("George Ricardo", "Belém - PA", "Masculino", 39, "213.081.153-95", 19000.00f,
				92);
		Vendedor vendedor2 = new Vendedor("Alessandra Santos", "Rio de Janeiro - RJ", "Feminino", 36, "053.151.213-34",
				946000.00f, 4);
		
		System.out.println("Digite os dados da pessoa vendedora número 3:");
		System.out.println("Nome: ");
		String nomeT = ler.nextLine();
		System.out.println("Local de nascimento: ");
		String nascT = ler.nextLine();
		System.out.println("Sexo: ");
		String sexoT = ler.nextLine();
		System.out.println("Idade: ");
		int idadeT = ler.nextInt();
		ler.nextLine(); // CONSUMIR LINHA
		System.out.println("C.P.F: ");
		String cpfT = ler.nextLine();
		System.out.println("Lucro obtido pelas suas vendas: ");
		float lucroT = ler.nextFloat();
		System.out.println("Comissâo (em %): ");
		int comissaoT = ler.nextInt();
		
		Vendedor vendedor3 = new Vendedor(nomeT, nascT, sexoT, idadeT, cpfT, lucroT, comissaoT);


		Optional<String> checaNulo = Optional.ofNullable(cpfT);

		if (checaNulo.isPresent()) {
			String palavra = nomeT.toLowerCase();
			System.out.print("A verificação foi feita e o valor do 'nome' não é nulo. O valor é: " + palavra);
		} else {
			System.out.println("A palavra é nula!");
		}
		
		String[] frases = new String[3];
		frases[2] = "Funcionários Ativos!";
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("\n\nExibir optionalVazio: " + optionalVazio);
		System.out.println("\nA posição 2 do Array frases está vazio? " + frases[2].isEmpty());

		Optional<String> valor_indice_02 = Optional.of(frases[2]);
		System.out.println("\nExibir valor do indice 02 do array Frases: " + valor_indice_02);
		System.out.println("\nObter o conteúdo do indice 02 do array Frases: " + valor_indice_02.get());
		System.out.println("\nO Valor do indice 02 está presente? " + valor_indice_02.isPresent());
		
		
		
		gerente.visualizar();
		vendedor.visualizar();
		gerente2.visualizar();
		vendedor2.visualizar();
		vendedor3.visualizar();
	}

}

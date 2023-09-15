package Funcionario;

public class Funcionario {
	
	private String nome;
	private String localNascimento;
	private String sexo;
	private int idade;
	private String cpf;
	
	public Funcionario(String nome, String localNascimento, String sexo, int idade, String cpf) {
		this.nome = nome;
		this.localNascimento = localNascimento;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("* * * Informações do Funcionário * * *");
		System.out.println("Nome: " + nome);
		System.out.println("Local de Nascimento: " + localNascimento);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("O CPF: " + cpf);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}
}

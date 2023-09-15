package Funcionario;

public class Gerente extends Funcionario{
	
	private float salario;
	private int tempoDeCasa;
	
	public Gerente(String nome, String localNascimento, String sexo, int idade, String cpf, float salario, int tempoDeCasa) {
		super(nome, localNascimento, sexo, idade, cpf);
		this.salario = salario;
		this.tempoDeCasa = tempoDeCasa;
		}
	
	@Override
	public void visualizar() {
		System.out.println("\n----------------------");
		System.out.println("A PESSOA ABAIXO É GERENTE!");
		System.out.println("----------------------");
		super.visualizar();
		System.out.println("O salário dele é R$" + salario + ".");
		System.out.println("Esta pessoa está na empresa há " + tempoDeCasa + " meses.");
		
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getTempoDeCasa() {
		return tempoDeCasa;
	}
	public void setTempoDeCasa(int tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
	}
	
}

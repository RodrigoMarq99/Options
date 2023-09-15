package Funcionario;

public class Vendedor extends Funcionario{

	private float vendasNoMes;
	private int comissao;
	
	public Vendedor(String nome, String localNascimento, String sexo, int idade, String cpf, float vendasNoMes, int comissao) {
		super(nome, localNascimento, sexo, idade, cpf);
		this.vendasNoMes = vendasNoMes;
		this.comissao = comissao;
		}
	
	@Override
	public void visualizar() {
		System.out.println("\n----------------------");
		System.out.println("A PESSOA ABAIXO É VENDEDORA!");
		System.out.println("----------------------");
		super.visualizar();
		System.out.println("O lucro obtido das vendas dela no mês atual é R$" + vendasNoMes + ".");
		System.out.println("Esta pessoa recebe " + comissao + "% de comissão.");
	}

	public float getVendasNoMes() {
		return vendasNoMes;
	}

	public void setVendasNoMes(float vendasNoMes) {
		this.vendasNoMes = vendasNoMes;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
}

package entidades;

public class Peca {
	
	private int cod;
	private double valor;
	private int quantidade;
	
	
	public Peca(int cod, double valor,int quantidade) {
		this.cod = cod;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public double calculo() {
		return  quantidade * valor;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}

package conta;

public abstract class Conta{
	private double valor;
	private String nome;
	private int numeroCanais;
		
	public Conta() {
		
	}

	
	public double getValor() {
		return valor;
	}


	protected void setValor(double valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumeroCanais() {
		return numeroCanais;
	}


	protected void setNumeroCanais(int numeroCanais) {
		this.numeroCanais = numeroCanais;
	}


	@Override
	public String toString() {
		return "Conta [Nome = " + nome + ", Valor = " + valor + ", numeroCanais = " + numeroCanais + "]";
	}
}
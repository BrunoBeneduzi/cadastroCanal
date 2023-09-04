package conta;

public class ContaPrata extends Conta{
	
	public ContaPrata() {
		super.setNome("Conta Prata");
		super.setNumeroCanais(150);
		super.setValor(250);
	}
	
	@Override
	public void exibeInformacaoConta() {
		System.out.println("A conta prata te dá direito a 150 canais e custa 250 R$");
	}
	
}
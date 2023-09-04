package conta;

public class ContaBasica extends Conta{
	
	
	public ContaBasica() {
		super.setNome("Conta Basica");
		super.setNumeroCanais(80);
		super.setValor(100);
	}
	

	@Override
	public void exibeInformacaoConta() {
		System.out.println("A conta basica te dá direito a 80 canais e custa apenas 100 R$");
	}
}
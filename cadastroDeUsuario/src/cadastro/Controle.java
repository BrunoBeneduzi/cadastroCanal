package cadastro;
import java.util.Scanner;
import conta.Conta;
import conta.ContaPrata;
import conta.ContaBasica;

public class Controle {
	private String usuario;
	private String senha;
	private boolean atual = true;
	private Conta conta;

	public Controle(String usuario, String senha) {//começa cadastrando o usuario e a senha para impedir que ele mude quando quiser
		this.usuario = usuario;
		this.senha = senha;
		this.adicionaConta();
	}
	
	protected Conta getConta() {
		return conta;
	}

	protected String getUsuario() {
		return usuario;
	}

	private void adicionarPrata() {//adiciona a conta do tipo prata
		Conta contaPrata = new ContaPrata();
		this.conta = contaPrata;
	}

	private void adicionarBasica() {//adiciona a conta do tipo basica
		Conta contaBasica = new ContaBasica();
		this.conta = contaBasica;
	}

	private void adicionaConta() {//escolhe um tipo de conta, se já tiver escolhido uma anteriormente o programa impede de colocar outra.
		Scanner sc = new Scanner(System.in);

		System.out.print("1 para conta basica ou 2 para conta Prata -> ");
		int escolha = sc.nextInt();

		switch(escolha) {
		case 1:
			if(this.atual) {
				this.adicionarBasica();
				
				this.atual = false;
			}
			else {
				System.out.println("Você não pode adicionar uma conta pois já está cadastrado em uma");
				this.separa();
			}

			break;
		case 2:
			if(this.atual) {
				this.adicionarPrata();
				
				this.atual = false;
			}
			else{
				System.out.println("Você não pode adicionar uma conta pois já está cadastrado em uma");
				this.separa();
			}

			break;
		default:
			System.out.println("Codigo de conta não existe");
			break;
		}	
	}

	protected void separa() {
		System.out.println("*************************************");
	}

	@Override
	public String toString() {
		return "Cadastro | usuario = " + usuario + ", senha = " + senha + ", Tipo de conta -> " + conta.getNome() +
				", Valor da conta -> "+ conta.getValor()+"R$ , Quantidade de canais liberados -> "+conta.getNumeroCanais();
	}
}
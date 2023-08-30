package cadastro;
import java.util.Scanner;
import conta.Conta;
import conta.ContaPrata;
import conta.ContaBasica;

public class Controle {
	private String usuario;
	private int senha;
	private boolean atual = true;
	private Conta conta;

	public Controle(String usuario, int senha) {//começa cadastrando o usuario e a senha para impedir que ele mude quando quiser
		this.usuario = usuario;
		this.senha = senha;
		this.adicionaConta();
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
				
				System.out.println("Conta Adicionada, bem vindo a conta BASICA");
				this.separa();
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
				
				System.out.println("Conta Adicionada, bem vindo a conta PRATA");
				this.separa();
				this.atual = false;
			}
			else{
				System.out.println("Você não pode adicionar uma conta pois já está cadastrado em uma");
				this.separa();
			}

			break;
		default:
			System.out.println("Codigo de conta não existe");
			this.separa();
			break;
		}	
	}

	private void separa() {
		System.out.println("*************************************");
	}

	@Override
	public String toString() {
		return "Controle [usuario = " + usuario + ", senha = " + senha + ", Tipo de conta -> " + conta.getNome() +
				", Valor da conta -> "+ conta.getValor()+"R$ , Quantidade de canais liberados -> "+conta.getNumeroCanais();
	}
}
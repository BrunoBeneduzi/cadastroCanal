package cadastro;
import java.util.*;

public class Validador {
	private List<Controle> valida = new ArrayList<>();

	public List<Controle> getValida() {//devolve uma lista que não pode ser modificada
		return valida;
	}

	public void adicionaConta(Controle usuario) {//adiciona os usuarios caso não tenha sido cadastrado antes 
		Controle controle = new Controle();
		controle.setUsuario(usuario.getUsuario());
		
		System.out.println();

		if(this.valida.isEmpty()) {//caso seja o primeiro registro ele será cadastrado
			this.valida.add(usuario);
			System.out.println("Conta Adicionada, Bem vindo a " + usuario.getConta().getNome());
			usuario.separa();

		}
		else {
			if(this.valida.indexOf(controle) == -1) {
				this.valida.add(usuario);
				System.out.println("Conta adicionada, Bem vindo a "+usuario.getConta().getNome());
				usuario.separa();
			}
			else {
				System.out.println("Conta já existe");
				usuario.separa();		
			}
		}
	}

	public void entraPerfil(String usuario) {//permite acessar a informação do usuario caso ele lembre do nome cadastrado
		Controle controle = new Controle();
		controle.setUsuario(usuario);

		if(this.valida.indexOf(controle) != -1) {
			System.out.println(this.valida.get(this.valida.indexOf(controle)));
		}
		else System.out.println("Esse usuario não existe");
	}

	public void exibe() {
		for(Controle i : this.valida) {
			System.out.println(i);
		}
	}
}
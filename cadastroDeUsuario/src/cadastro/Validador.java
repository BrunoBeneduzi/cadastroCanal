package cadastro;
import java.util.*;

public class Validador {
	private List<Controle> valida = new ArrayList<>();

	public List<Controle> getValida() {//devolve uma lista que não pode ser modificada
		return Collections.unmodifiableList(valida);
	}

	public void adiciona(Controle usuario) {//adiciona os usuarios caso não tenha sido cadastrado antes 
		boolean verifica = true;
		
		if(this.valida.isEmpty()) {//caso seja o primeiro registro ele será cadastrado
			this.valida.add(usuario);
			System.out.println("Conta Adicionada, Bem vindo a " + usuario.getConta().getNome());
			usuario.separa();
			
		}
		else {
			for(int i = 0; i < this.valida.size(); i++) {
				
				if(this.valida.get(i).getUsuario().equalsIgnoreCase(usuario.getUsuario())) {//se o usuario existir vai aparecer uma mensagem dizendo que já existe
					System.out.println("Esse suario já foi cadastrado, tente outro");
					verifica = false;
					usuario.separa();
				}
			}
			if(verifica) {//caso não exista vai ser cadastrado
				this.valida.add(usuario);
				System.out.println("Conta Adicionada, Bem vindo a " + usuario.getConta().getNome());
				usuario.separa();
			}
		}
	}
	
	public void acesso(String usuario) {
		boolean existe = false;
		for(Controle i : this.valida) {
			if(i.getUsuario().equalsIgnoreCase(usuario)) {
				existe = true;
				System.out.println(i);
				break;
			}
		}
		if(!existe)System.out.println("usuario não existe");
		
	}
	
	public void exibe() {
		for(Controle i : this.valida) {
			System.out.println(i);
		}
	}
}
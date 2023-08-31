package cadastro;
import java.util.*;

public class Validador {
	private List<Controle> valida = new ArrayList<>();

	public List<Controle> getValida() {
		return Collections.unmodifiableList(valida);
	}

	public void adiciona(Controle usuario) {
		boolean verifica = true;
		if(this.valida.isEmpty()) {
			this.valida.add(usuario);
			System.out.println("Conta Adicionada, Bem vindo a " + usuario.getConta().getNome());

			usuario.separa();
		}
		else {
			for(int i = 0; i < this.valida.size(); i++) {
				if(this.valida.get(i).getUsuario().equalsIgnoreCase(usuario.getUsuario())) {
					System.out.println("Usuario já cadastrado");
					verifica = false;
					usuario.separa();
				}
			}
			if(verifica) {
				this.valida.add(usuario);
				System.out.println("Conta Adicionada, Bem vindo a " + usuario.getConta().getNome());
				usuario.separa();
			}
		}
	}



	@Override
	public String toString() {
		return "Validador [valida=" + valida + "]";
	} 

}
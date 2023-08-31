package cadastro;
import java.util.*;

public class Validador {
	private List<Controle> valida = new ArrayList<>();

	public List<Controle> getValida() {
		return valida;
	}

	public void adiciona(Controle usuario) {
		if(this.valida.isEmpty()) {
			this.valida.add(usuario);
			System.out.println("Adiconado");
			usuario.separa();
		}
		else {
			for(int i = 0; i < this.valida.size(); i++) {
				if(this.valida.get(i).getUsuario().equalsIgnoreCase(usuario.getUsuario())) {
					System.out.println("Usuario já cadastrado");
					usuario.separa();
				}
				else {
					this.valida.add(usuario);
					System.out.println("Adicionado");
					usuario.separa();
				}
			}
		}
	}



	@Override
	public String toString() {
		return "Validador [valida=" + valida + "]";
	} 

}
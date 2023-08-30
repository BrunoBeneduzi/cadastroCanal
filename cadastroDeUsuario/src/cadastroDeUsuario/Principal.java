package cadastroDeUsuario;
import cadastro.*;

public class Principal {

	public static void main(String[] args) {
		Validador usuario = new Validador();
		
		usuario.setValida(new Controle("Bruno",1234));
		usuario.setValida(new Controle("Brun",345));
		usuario.setValida(new Controle("Bru",3432));
		
		System.out.println(usuario);
	}

}

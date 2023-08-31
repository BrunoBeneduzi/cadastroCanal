package cadastroDeUsuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import cadastro.*;

public class Principal {

	public static void main(String[] args) throws IOException {
		Validador usuario = new Validador();
		
		
        
		usuario.adiciona(new Controle("Bruno", 12345));
		usuario.adiciona(new Controle("Vitoria", 12345));
		usuario.adiciona(new Controle("Ramires", 12345));
		usuario.adiciona(new Controle("Jasmin", 12345));
		usuario.adiciona(new Controle("Andresa", 12345));
		
		
		usuario.exibe();
	}
}
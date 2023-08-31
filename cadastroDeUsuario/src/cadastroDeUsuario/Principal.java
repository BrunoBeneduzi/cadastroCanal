package cadastroDeUsuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import cadastro.*;

public class Principal {

	public static void main(String[] args) throws IOException {
		Validador usuario = new Validador();
		
		
        
		usuario.adiciona(new Controle("bruno", 01234));
		usuario.adiciona(new Controle("Bruno", 23412));
		
		
		System.out.println(usuario);
	}
}
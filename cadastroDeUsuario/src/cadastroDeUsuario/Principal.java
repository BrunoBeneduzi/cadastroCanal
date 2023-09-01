package cadastroDeUsuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import cadastro.*;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Validador usuario = new Validador();
		String nome, senha, escolha;

		do {
			System.out.print("Bem vindo ao cadastro de contas\n"+"o que deseja fazer?\n"+"1- Cadastrar usuario e senha + Perfil\n"+
			"2- Para exibir o seu perfil\n"+"Digite (sair) para encerrar\n"+"->");
			escolha = sc.next();
			System.out.println("***************************************");

			switch(escolha) {
			case "1":
				sc.nextLine();
				System.out.print("Digite o seu nome, ele será o seu usuario -> ");
				nome = sc.next();

				do {
					System.out.print("Digite a sua senha, permitido apenas 4 digitos -> ");
					senha = sc.next();
					if(senha.length() <= 4) usuario.adiciona(new Controle(nome, senha));
					else System.out.println("A senha não atende os padrãoes estabelecidos pelo programador.......Tente novamente");
				}while(senha.length() > 5);

				break;
			case "2":
				sc.nextLine();
				System.out.print("Digite o seu usuario -> ");
				String acesso = sc.next();
				
				usuario.acesso(acesso);
				System.out.println("***************************************");
				break;
			}

		}while(!escolha.equalsIgnoreCase("sair"));
	}
}
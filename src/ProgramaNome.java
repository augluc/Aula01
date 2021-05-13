//É preciso importar a função Scanner para ler dados do teclado
import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
	
		// cria um leito para ler o teclado
		Scanner leitor = new Scanner(System.in);
		// uma variável para guardar dados no tip String
		String nome;
		
		System.out.println("Por favor, digite o seu nome:");
		
		// pega o texto digitado no leitor e arquiva em nome
				nome = leitor.nextLine();
				
		System.out.println("Que legal que o seu nome é " + nome);
		System.out.println(nome + ", fico feliz que você esteja usando o meu programa");
		
		// após utilizar o leitor, é preciso fechá-lo
		leitor.close();
	}

}

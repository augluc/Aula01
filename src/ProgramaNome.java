//� preciso importar a fun��o Scanner para ler dados do teclado
import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
	
		// cria um leito para ler o teclado
		Scanner leitor = new Scanner(System.in);
		// uma vari�vel para guardar dados no tip String
		String nome;
		
		System.out.println("Por favor, digite o seu nome:");
		
		// pega o texto digitado no leitor e arquiva em nome
				nome = leitor.nextLine();
				
		System.out.println("Que legal que o seu nome � " + nome);
		System.out.println(nome + ", fico feliz que voc� esteja usando o meu programa");
		
		// ap�s utilizar o leitor, � preciso fech�-lo
		leitor.close();
	}

}

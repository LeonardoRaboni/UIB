import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leTeclado = new Scanner (System.in);
		
		
		System.out.println ("Informe seu nome");
		
		String nome = leTeclado.next(); 
		
		System.out.println ("Hello, " + nome + "!");
		
		
	}

}

import java.util.Scanner;

public class UibMain {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner (System.in);
				final int TOTAL_CLIENTE = 2;
		
		System.out.println( "bem vindo ao unit internet banking");
		System.out.println ("----------------------");
		
		
		Cliente clientes [] = new Cliente [TOTAL_CLIENTE];
		Conta contas [] = new Conta [TOTAL_CLIENTE];
		
		for (int i = 0; i < TOTAL_CLIENTE; i++) {
			clientes [i] = new Cliente ();
			
			System.out.println("Digite nome do Cliente");
			clientes [i].setNome(leTeclado.next());
			System.out.println("Digite nome do cpf do cliente");
			clientes [i].setCpf (leTeclado.next());
			
		}
		
		for (int i = 0; i < TOTAL_CLIENTE; i++) {
			contas[i] = new Conta ();
			
			System.out.println("Digite numero da conta");
			contas[i].setNumeroDaConta(leTeclado.next());
			
			System.out.println("Digite saldo do cliente");
			contas[i].setSaldo(leTeclado.nextDouble());
			
			contas [i].setDonoDaConta (clientes[i]);
			
		}
		
		contas [0].debitar(100);
		contas [0].creditar (20);
		contas [1].transferir(contas[0], 50.0);
		
		for (int j = 0; j < TOTAL_CLIENTE; j ++) {
			
			System.out.println("Saldo da conta" + contas [j].getNumero() + "é " + contas[j].getSaldo());
		}
		
	}

}

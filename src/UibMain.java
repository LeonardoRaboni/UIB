import java.util.Scanner;

public class UibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente clienteLeo = new Cliente();
		clienteLeo.nome = "Leo";
		clienteLeo.cpf = "123.123.123-12";
		
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.donoDaConta = clienteLeo;
		clienteLeo.conta = conta;
		
		
		
		System.out.println(clienteLeo.nome + " tem" + clienteLeo.conta.saldo);
		System.out.println(conta.donoDaConta.nome + " tem " + conta.saldo);
		
	}

}

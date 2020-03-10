
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		Conta conta1 = new Conta ();
		Conta conta2 = new Conta ();
		
		
		conta1.setDonoDaConta(cliente1);
		conta2.setDonoDaConta(cliente2);
		
		cliente1.setNome("Leonardo");
		cliente1.setCpf("12312312345");
		cliente1.setConta(conta1);
		
	
		cliente2.setNome("Maria");
		cliente2.setCpf("13312312345");
		cliente2.setConta(conta2);
		
		conta1.setNumeroDaConta ("4556343344");
		conta2.setNumeroDaConta("34343434343434");
		
				
							
		conta1.debitar(100);
		conta1.creditar(20);
		
		
		conta2.transferir(conta1, 50);
		
		System.out.println(conta1.getDonoDaConta());
		System.out.println(conta2.getDonoDaConta());
	}

}


public class Conta {

	   
	    
	    private String numero;
		
		private double saldo;
	
		private Cliente donoDaConta;
		
		
		
		
		public String getNumero() {
			return numero;
		}
		
		public Double getSaldo () {
			return saldo;
		}

		public Cliente getDonoDaConta () {
			return donoDaConta;
			
		}
		
		public void setNumeroDaConta (String numero) {
			this.numero = numero;
				
		}
		
		public void setSaldo (Double saldo) {
			
			this.saldo = saldo;
		}
		
		public void setDonoDaConta (Cliente donoDaConta) {
			
			this.donoDaConta = donoDaConta;
			
		}
		
		
		
		public void creditar (double valor) {
			saldo = saldo + valor;
			
		}
		
		public void debitar (double valor) {
			saldo = saldo - valor;
			
		}
		
		public void transferir (Conta contaDestino, double valor) {
			debitar (valor);
			contaDestino.creditar(valor);
		}

		@Override
		public String toString() {
			return "Conta [numero=" + numero + ", saldo=" + saldo + ", donoDaConta=" + donoDaConta.getNome() + "]";
		}
		
		
		
		}
		
		


public class Cliente {
	
	
	private String nome;

	private String cpf;
	
	private Conta conta;
	
	
	
    public String getCpf () {
	return cpf;
}

    public void setCpf (String cpf) {
	this.cpf = cpf;
}
	
    public String getNome () {
	
	return nome;
}

    public void setNome (String nome) {

	this.nome = nome;
}

	public Conta getConta () {
		
		return conta;
		
	}

	public void setConta (Conta conta) {
		this.conta = conta;
		
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", conta=" + conta + "]";
	}
	
}

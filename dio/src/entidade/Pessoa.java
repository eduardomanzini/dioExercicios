package entidade;

public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String nomeBanco;
	private String tipoConta; //fisica ou pj
	private String numeroConta;
	
	public Pessoa() {
	}

	
	public Pessoa(String nome, String endereco, String nomeBanco, String tipoConta) {
		this.nome = nome;
		this.endereco = endereco;
		this.nomeBanco = nomeBanco;
		this.tipoConta = tipoConta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public String getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", nomeBanco=" + nomeBanco + ", tipoConta="
				+ tipoConta + ", numeroConta=" + numeroConta + "]";
	}
		
	
}

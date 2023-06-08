package entidade;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, String endereco, String nomeBanco, String tipoConta, String cpf) {
		super(nome, endereco, nomeBanco, tipoConta);
		this.cpf = cpf;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", Nome=" + getNome() + ", Endereco=" + getEndereco()
				+ ", NomeBanco=" + getNomeBanco() + ", TipoConta=" + getTipoConta() + ", NumeroConta="
				+ getNumeroConta() + "]";
	}

	
	
}	

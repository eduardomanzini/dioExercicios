package entidade;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private String numeroFuncionarios;

	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, String endereco, String nomeBanco, String tipoConta, String cnpj,
			String numeroFuncionarios) {
		super(nome, endereco, nomeBanco, tipoConta);
		this.cnpj = cnpj;
		this.numeroFuncionarios = numeroFuncionarios;
		
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(String numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", numeroFuncionarios=" + numeroFuncionarios + ", Nome="
				+ getNome() + ", Endereco=" + getEndereco() + ", NomeBanco=" + getNomeBanco()
				+ ", TipoConta=" + getTipoConta() + ", NumeroConta=" + getNumeroConta() + "]";
	}

	
	
	
}

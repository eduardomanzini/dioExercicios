package view;

import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		
		Pessoa ana = new PessoaJuridica();
		ana.setNome("Ana");
		ana.setEndereco("Avenia Maria");
		ana.setNomeBanco("Itau");
		ana.setNumeroConta("3578-2");
		ana.setTipoConta("Fisica");
		
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Joao");
		pessoaJuridica.setEndereco("Avenia Pedro");
		pessoaJuridica.setNomeBanco("Bradesco");
		pessoaJuridica.setNumeroConta("5468-6");
		pessoaJuridica.setTipoConta("Juridica");
		pessoaJuridica.setCnpj("05.134.355/0008-98");
		pessoaJuridica.setNumeroFuncionarios("9");
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Pedro");
		pessoaFisica.setEndereco("Avenia Joao");
		pessoaFisica.setNomeBanco("Bradesco");
		pessoaFisica.setNumeroConta("5438-6");
		pessoaFisica.setTipoConta("Fisica");
		pessoaFisica.setCpf("450.687.658-80");
	
		System.out.println(ana);
		System.out.println(pessoaJuridica);
		System.out.println(pessoaFisica);
		
		
	}
}

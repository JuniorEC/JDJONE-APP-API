package com.joadjunior.jdjone.app.relatorio.model;

public class Empresa {
	
	private String cnpj;
	private String nomeFantasia;
	private String razaoSocial;
	private String rede;
	private String cidade;
	private String uf;
	
	public Empresa() {
		super();
	}

	public Empresa(String cnpj, String nomeFantasia, String razaoSocial, String rede, String cidade, String uf) {
		super();
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.rede = rede;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getRede() {
		return rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}

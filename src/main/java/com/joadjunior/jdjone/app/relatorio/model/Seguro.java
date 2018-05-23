package com.joadjunior.jdjone.app.relatorio.model;

public class Seguro {
	
	private Empresa empresa;
	private int aprovadas;
	private int seguros;
	private int faturaEmail;
	public Seguro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seguro(Empresa empresa, int aprovadas, int seguros, int faturaEmail) {
		super();
		this.empresa = empresa;
		this.aprovadas = aprovadas;
		this.seguros = seguros;
		this.faturaEmail = faturaEmail;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getAprovadas() {
		return aprovadas;
	}
	public void setAprovadas(int aprovadas) {
		this.aprovadas = aprovadas;
	}
	public int getSeguros() {
		return seguros;
	}
	public void setSeguros(int seguros) {
		this.seguros = seguros;
	}
	public int getFaturaEmail() {
		return faturaEmail;
	}
	public void setFaturaEmail(int faturaEmail) {
		this.faturaEmail = faturaEmail;
	}
	
	

}

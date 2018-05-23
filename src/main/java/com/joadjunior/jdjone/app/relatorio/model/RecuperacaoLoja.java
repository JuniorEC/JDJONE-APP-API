package com.joadjunior.jdjone.app.relatorio.model;

public class RecuperacaoLoja {
	
	private Empresa empresa;
	private double negociadoLoja;
	
	public RecuperacaoLoja() {
		super();
	}
	public RecuperacaoLoja(Empresa empresa, double negociadoLoja) {
		super();
		this.empresa = empresa;
		this.negociadoLoja = negociadoLoja;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public double getNegociadoLoja() {
		return negociadoLoja;
	}
	public void setNegociadoLoja(double negociadoLoja) {
		this.negociadoLoja = negociadoLoja;
	}
	
	

}

package com.joadjunior.jdjone.app.relatorio.model;

public class Cartao {
	
	private Empresa empresa;
	private String status;
	private Faturamento faturamento;
	private boolean isAtivo;
	
	public Cartao() {
		super();
	}

	public Cartao(Empresa empresa, String status, Faturamento faturamento, boolean isAtivo) {
		super();
		this.empresa = empresa;
		this.status = status;
		this.faturamento = faturamento;
		this.isAtivo = isAtivo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Faturamento getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Faturamento faturamento) {
		this.faturamento = faturamento;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	
	
}

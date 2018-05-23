package com.joadjunior.jdjone.app.relatorio.model;

public class Contas {
	
	private Empresa empresa;
	private int contasAptasPl;
	private int contasUsoPl;
	private int contasInativasPl;
	private int contasAptasHib;
	private int contasUsoHib;
	private int contasInativasHib;
	
	public Contas() {
		super();
	}

	public Contas(Empresa empresa, int contasAptasPl, int contasUsoPl, int contasInativasPl, int contasAptasHib,
			int contasUsoHib, int contasInativasHib) {
		super();
		this.empresa = empresa;
		this.contasAptasPl = contasAptasPl;
		this.contasUsoPl = contasUsoPl;
		this.contasInativasPl = contasInativasPl;
		this.contasAptasHib = contasAptasHib;
		this.contasUsoHib = contasUsoHib;
		this.contasInativasHib = contasInativasHib;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getContasAptasPl() {
		return contasAptasPl;
	}

	public void setContasAptasPl(int contasAptasPl) {
		this.contasAptasPl = contasAptasPl;
	}

	public int getContasUsoPl() {
		return contasUsoPl;
	}

	public void setContasUsoPl(int contasUsoPl) {
		this.contasUsoPl = contasUsoPl;
	}

	public int getContasInativasPl() {
		return contasInativasPl;
	}

	public void setContasInativasPl(int contasInativasPl) {
		this.contasInativasPl = contasInativasPl;
	}

	public int getContasAptasHib() {
		return contasAptasHib;
	}

	public void setContasAptasHib(int contasAptasHib) {
		this.contasAptasHib = contasAptasHib;
	}

	public int getContasUsoHib() {
		return contasUsoHib;
	}

	public void setContasUsoHib(int contasUsoHib) {
		this.contasUsoHib = contasUsoHib;
	}

	public int getContasInativasHib() {
		return contasInativasHib;
	}

	public void setContasInativasHib(int contasInativasHib) {
		this.contasInativasHib = contasInativasHib;
	}
	
	

}

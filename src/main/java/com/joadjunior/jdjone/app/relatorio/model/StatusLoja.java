package com.joadjunior.jdjone.app.relatorio.model;

public class StatusLoja {
	
	private Empresa empresa;
	private boolean operando;
	private boolean aprovando;
	private boolean positiva;
	private boolean ativa;
	
	public StatusLoja() {
		super();
	}

	public StatusLoja(Empresa empresa, boolean operando, boolean aprovando, boolean positiva, boolean ativa) {
		super();
		this.empresa = empresa;
		this.operando = operando;
		this.aprovando = aprovando;
		this.positiva = positiva;
		this.ativa = ativa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public boolean isOperando() {
		return operando;
	}

	public void setOperando(boolean operando) {
		this.operando = operando;
	}

	public boolean isAprovando() {
		return aprovando;
	}

	public void setAprovando(boolean aprovando) {
		this.aprovando = aprovando;
	}

	public boolean isPositiva() {
		return positiva;
	}

	public void setPositiva(boolean positiva) {
		this.positiva = positiva;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	

}

package com.joadjunior.jdjone.app.relatorio.model;

public class Aprovadas {
	
	private Empresa empresa;
	private int emitidas;
	private int aprovadas;
	private int aprovadasDefinitivo;
	private int comCompra;
	private int propostasPendentes;
	private Double limiteDefinitivo;
	private Double percEmitidas;
	private Double aprovDeltaAno;
	private Double compraDeltaAno;
	
	public Aprovadas() {
		super();
	}

	public Aprovadas(Empresa empresa, int emitidas, int aprovadas, int aprovadasDefinitivo, int comCompra,
			int propostasPendentes, Double limiteDefinitivo, Double percEmitidas, Double aprovDeltaAno,
			Double compraDeltaAno) {
		super();
		this.empresa = empresa;
		this.emitidas = emitidas;
		this.aprovadas = aprovadas;
		this.aprovadasDefinitivo = aprovadasDefinitivo;
		this.comCompra = comCompra;
		this.propostasPendentes = propostasPendentes;
		this.limiteDefinitivo = limiteDefinitivo;
		this.percEmitidas = percEmitidas;
		this.aprovDeltaAno = aprovDeltaAno;
		this.compraDeltaAno = compraDeltaAno;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getEmitidas() {
		return emitidas;
	}

	public void setEmitidas(int emitidas) {
		this.emitidas = emitidas;
	}

	public int getAprovadas() {
		return aprovadas;
	}

	public void setAprovadas(int aprovadas) {
		this.aprovadas = aprovadas;
	}

	public int getAprovadasDefinitivo() {
		return aprovadasDefinitivo;
	}

	public void setAprovadasDefinitivo(int aprovadasDefinitivo) {
		this.aprovadasDefinitivo = aprovadasDefinitivo;
	}

	public int getComCompra() {
		return comCompra;
	}

	public void setComCompra(int comCompra) {
		this.comCompra = comCompra;
	}

	public int getPropostasPendentes() {
		return propostasPendentes;
	}

	public void setPropostasPendentes(int propostasPendentes) {
		this.propostasPendentes = propostasPendentes;
	}

	public Double getLimiteDefinitivo() {
		return limiteDefinitivo;
	}

	public void setLimiteDefinitivo(Double limiteDefinitivo) {
		this.limiteDefinitivo = limiteDefinitivo;
	}

	public Double getPercEmitidas() {
		return percEmitidas;
	}

	public void setPercEmitidas(Double percEmitidas) {
		this.percEmitidas = percEmitidas;
	}

	public Double getAprovDeltaAno() {
		return aprovDeltaAno;
	}

	public void setAprovDeltaAno(Double aprovDeltaAno) {
		this.aprovDeltaAno = aprovDeltaAno;
	}

	public Double getCompraDeltaAno() {
		return compraDeltaAno;
	}

	public void setCompraDeltaAno(Double compraDeltaAno) {
		this.compraDeltaAno = compraDeltaAno;
	}
	
	
	

}

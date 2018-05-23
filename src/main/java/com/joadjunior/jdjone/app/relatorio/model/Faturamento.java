package com.joadjunior.jdjone.app.relatorio.model;

public class Faturamento {
	
	private Empresa empresa;
	private Double FaturamentoTotal;
	private Double pl;
	private Double hib;
	private Double percFatPl;
	private Double percFatHib;
	private Double delta;
	
	public Faturamento() {
		super();
	}

	public Faturamento(Empresa empresa, Double faturamentoTotal, Double pl, Double hib, Double percFatPl,
			Double percFatHib, Double delta) {
		super();
		this.empresa = empresa;
		FaturamentoTotal = faturamentoTotal;
		this.pl = pl;
		this.hib = hib;
		this.percFatPl = percFatPl;
		this.percFatHib = percFatHib;
		this.delta = delta;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Double getFaturamentoTotal() {
		return FaturamentoTotal;
	}

	public void setFaturamentoTotal(Double faturamentoTotal) {
		FaturamentoTotal = faturamentoTotal;
	}

	public Double getPl() {
		return pl;
	}

	public void setPl(Double pl) {
		this.pl = pl;
	}

	public Double getHib() {
		return hib;
	}

	public void setHib(Double hib) {
		this.hib = hib;
	}

	public Double getPercFatPl() {
		return percFatPl;
	}

	public void setPercFatPl(Double percFatPl) {
		this.percFatPl = percFatPl;
	}

	public Double getPercFatHib() {
		return percFatHib;
	}

	public void setPercFatHib(Double percFatHib) {
		this.percFatHib = percFatHib;
	}

	public Double getDelta() {
		return delta;
	}

	public void setDelta(Double delta) {
		this.delta = delta;
	}
	
	

}

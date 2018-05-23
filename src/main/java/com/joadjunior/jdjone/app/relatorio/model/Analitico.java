package com.joadjunior.jdjone.app.relatorio.model;

public class Analitico {
	
	private int mes;
	private int ano;
	private Faturamento faturamento;
	
	public Analitico() {
		super();
	}

	public Analitico(int mes, int ano, Faturamento faturamento) {
		super();
		this.mes = mes;
		this.ano = ano;
		this.faturamento = faturamento;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Faturamento getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Faturamento faturamento) {
		this.faturamento = faturamento;
	}
	
	

}

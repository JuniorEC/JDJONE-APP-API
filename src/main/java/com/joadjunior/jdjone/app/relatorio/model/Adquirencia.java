package com.joadjunior.jdjone.app.relatorio.model;

public class Adquirencia {
	
	private Empresa empresa;
	private double cieloTotal;
	private double redeTotal;
	private double taxaDebito;
	private double taxaCredito;
	private double taxaSeisX;
	private boolean master;
	private boolean visa;
	private boolean martins;
	
	public Adquirencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adquirencia(Empresa empresa, double cieloTotal, double redeTotal, double taxaDebito, double taxaCredito,
			double taxaSeisX, boolean master, boolean visa, boolean martins) {
		super();
		this.empresa = empresa;
		this.cieloTotal = cieloTotal;
		this.redeTotal = redeTotal;
		this.taxaDebito = taxaDebito;
		this.taxaCredito = taxaCredito;
		this.taxaSeisX = taxaSeisX;
		this.master = master;
		this.visa = visa;
		this.martins = martins;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public double getCieloTotal() {
		return cieloTotal;
	}

	public void setCieloTotal(double cieloTotal) {
		this.cieloTotal = cieloTotal;
	}

	public double getRedeTotal() {
		return redeTotal;
	}

	public void setRedeTotal(double redeTotal) {
		this.redeTotal = redeTotal;
	}

	public double getTaxaDebito() {
		return taxaDebito;
	}

	public void setTaxaDebito(double taxaDebito) {
		this.taxaDebito = taxaDebito;
	}

	public double getTaxaCredito() {
		return taxaCredito;
	}

	public void setTaxaCredito(double taxaCredito) {
		this.taxaCredito = taxaCredito;
	}

	public double getTaxaSeisX() {
		return taxaSeisX;
	}

	public void setTaxaSeisX(double taxaSeisX) {
		this.taxaSeisX = taxaSeisX;
	}

	public boolean isMaster() {
		return master;
	}

	public void setMaster(boolean master) {
		this.master = master;
	}

	public boolean isVisa() {
		return visa;
	}

	public void setVisa(boolean visa) {
		this.visa = visa;
	}

	public boolean isMartins() {
		return martins;
	}

	public void setMartins(boolean martins) {
		this.martins = martins;
	}
	
	
	
}

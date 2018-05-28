package com.joadjunior.jdjone.report.model;

import java.io.Serializable;




public class Faturamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private double pl;
	private double hib;
	private double fatPl;
	private double fatHib;
	private double delta;

	public Faturamento() {
		super();
	}

	public Faturamento(Long id, double pl, double hib, double fatPl, double fatHib, double delta) {
		super();
		this.id = id;
		this.pl = pl;
		this.hib = hib;
		this.fatPl = fatPl;
		this.fatHib = fatHib;
		this.delta = delta;
		//this.analitico = analitico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPl() {
		return pl;
	}

	public void setPl(double pl) {
		this.pl = pl;
	}

	public double getHib() {
		return hib;
	}

	public void setHib(double hib) {
		this.hib = hib;
	}

	public double getFatPl() {
		return fatPl;
	}

	public void setFatPl(double fatPl) {
		this.fatPl = fatPl;
	}

	public double getFatHib() {
		return fatHib;
	}

	public void setFatHib(double fatHib) {
		this.fatHib = fatHib;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}
/*
	public Analitico getAnalitico() {
		return analitico;
	}

	public void setAnalitico(Analitico analitico) {
		this.analitico = analitico;
	}
	
	*/
	
	
}

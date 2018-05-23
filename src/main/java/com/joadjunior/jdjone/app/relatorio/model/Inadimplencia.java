package com.joadjunior.jdjone.app.relatorio.model;

import java.util.List;

public class Inadimplencia {
	
	private List<FPD> fpd;
	private List<CRELIQ> creliq;
	
	public Inadimplencia() {
		super();
	}

	public Inadimplencia(List<FPD> fpd, List<CRELIQ> creliq) {
		super();
		this.fpd = fpd;
		this.creliq = creliq;
	}

	public List<FPD> getFpd() {
		return fpd;
	}

	public void setFpd(List<FPD> fpd) {
		this.fpd = fpd;
	}

	public List<CRELIQ> getCreliq() {
		return creliq;
	}

	public void setCreliq(List<CRELIQ> creliq) {
		this.creliq = creliq;
	}

	

}

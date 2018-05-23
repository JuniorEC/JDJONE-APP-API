package com.joadjunior.jdjone.app.relatorio.model;

import java.util.List;

public class CRELIQ {
	
	private Empresa empresa;
	private List<Double> percAoMes;
	
	public CRELIQ() {
		super();
	}
	
	public CRELIQ(Empresa empresa, List<Double> percAoMes) {
		super();
		this.empresa = empresa;
		this.percAoMes = percAoMes;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public List<Double> getPercAoMes() {
		return percAoMes;
	}
	public void setPercAoMes(List<Double> percAoMes) {
		this.percAoMes = percAoMes;
	}
	
	

}

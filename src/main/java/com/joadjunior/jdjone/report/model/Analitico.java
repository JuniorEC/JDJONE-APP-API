package com.joadjunior.jdjone.report.model;

public class Analitico {
	
	private Long id;
	private int mes;
	private int ano;
	
	private Empresa empresa;
	
	private Faturamento faturamento;
	
	public Analitico() {
		super();
	}
	
	public Analitico(Long id, int mes, int ano) {
		super();
		this.id = id;
		this.mes = mes;
		this.ano = ano;
	}

	public Analitico(Long id, int mes, int ano, Empresa empresa) {
		super();
		this.id = id;
		this.mes = mes;
		this.ano = ano;
		this.empresa = empresa;
	}
	
	public Analitico(Long id, int mes, int ano, Empresa empresa, Faturamento faturamento) {
		super();
		this.id = id;
		this.mes = mes;
		this.ano = ano;
		this.empresa = empresa;
		this.faturamento = faturamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Faturamento getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Faturamento faturamento) {
		this.faturamento = faturamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Analitico other = (Analitico) obj;
		if (ano != other.ano)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Analitico [id=");
		builder.append(id);
		builder.append(", mes=");
		builder.append(mes);
		builder.append(", ano=");
		builder.append(ano);
		builder.append("]");
		return builder.toString();
	}
}

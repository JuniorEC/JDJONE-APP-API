package com.joadjunior.jdjone.report.model;

import java.io.Serializable;
import java.util.List;




public class Empresa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Long id;
	private String cnpj;
	
	
	private String razaoSOcial;
	
	private String nomeFantasia;
	
	private String rede;
	private String cidade;
	private String uf;
	
	private List<Analitico> analiticos;
	

	public Empresa() {
		super();
	}

	public Empresa(Long id, String cnpj, String razaoSOcial, String nomeFantasia, String rede, String cidade, String uf) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSOcial = razaoSOcial;
		this.nomeFantasia = nomeFantasia;
		this.rede = rede;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String string) {
		this.cnpj = string;
	}

	public String getRazaoSOcial() {
		return razaoSOcial;
	}

	public void setRazaoSOcial(String razaoSOcial) {
		this.razaoSOcial = razaoSOcial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRede() {
		return rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public List<Analitico> getAnaliticos() {
		return analiticos;
	}
	
	public void setAnaliticos(List<Analitico> analiticos) {
		this.analiticos = analiticos;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + ((razaoSOcial == null) ? 0 : razaoSOcial.hashCode());
		result = prime * result + ((rede == null) ? 0 : rede.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (razaoSOcial == null) {
			if (other.razaoSOcial != null)
				return false;
		} else if (!razaoSOcial.equals(other.razaoSOcial))
			return false;
		if (rede == null) {
			if (other.rede != null)
				return false;
		} else if (!rede.equals(other.rede))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empresa [id=");
		builder.append(id);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append(", razaoSOcial=");
		builder.append(razaoSOcial);
		builder.append(", nomeFantasia=");
		builder.append(nomeFantasia);
		builder.append(", rede=");
		builder.append(rede);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", uf=");
		builder.append(uf);
		builder.append("]");
		return builder.toString();
	}

		
}

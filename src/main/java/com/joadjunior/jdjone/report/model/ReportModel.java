package com.joadjunior.jdjone.report.model;

import com.joadjunior.jdjone.app.relatorio.model.Representante;
import com.joadjunior.jdjone.app.relatorio.model.Seguro;
import com.joadjunior.jdjone.app.relatorio.model.StatusLoja;

import java.util.List;

import com.joadjunior.jdjone.app.relatorio.model.Adquirencia;
import com.joadjunior.jdjone.app.relatorio.model.Aprovadas;
import com.joadjunior.jdjone.app.relatorio.model.Cartao;
import com.joadjunior.jdjone.app.relatorio.model.Contas;
import com.joadjunior.jdjone.app.relatorio.model.Empresa;
import com.joadjunior.jdjone.app.relatorio.model.Faturamento;
import com.joadjunior.jdjone.app.relatorio.model.Inadimplencia;
import com.joadjunior.jdjone.app.relatorio.model.RecuperacaoLoja;
public class ReportModel {

	private Empresa empresa;
	private String periodo;
	private Representante representante;
	private List<Faturamento> faturamentos;
	private List<Aprovadas> aprovadas;
	private List<Contas> contas;
	private Inadimplencia inadimplencia;
	private List<RecuperacaoLoja> recuperacao;
	private List<Seguro> seguro;
	private List<Adquirencia> adquirencia;
	private List<Cartao> cartao;
	private List<StatusLoja> statusLoja;	

	public ReportModel() {
		super();
	}

	public ReportModel(Empresa empresa, String periodo, Representante representante, List<Faturamento> faturamentos,
			List<Aprovadas> aprovadas, List<Contas> contas, Inadimplencia inadimplencia,
			List<RecuperacaoLoja> recuperacao, List<Seguro> seguro, List<Adquirencia> adquirencia, List<Cartao> cartao,
			List<StatusLoja> statusLoja) {
		super();
		this.empresa = empresa;
		this.periodo = periodo;
		this.representante = representante;
		this.faturamentos = faturamentos;
		this.aprovadas = aprovadas;
		this.contas = contas;
		this.inadimplencia = inadimplencia;
		this.recuperacao = recuperacao;
		this.seguro = seguro;
		this.adquirencia = adquirencia;
		this.cartao = cartao;
		this.statusLoja = statusLoja;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public List<Faturamento> getFaturamentos() {
		return faturamentos;
	}

	public void setFaturamentos(List<Faturamento> faturamentos) {
		this.faturamentos = faturamentos;
	}

	public List<Aprovadas> getAprovadas() {
		return aprovadas;
	}

	public void setAprovadas(List<Aprovadas> aprovadas) {
		this.aprovadas = aprovadas;
	}

	public List<Contas> getContas() {
		return contas;
	}

	public void setContas(List<Contas> contas) {
		this.contas = contas;
	}

	public Inadimplencia getInadimplencia() {
		return inadimplencia;
	}

	public void setInadimplencia(Inadimplencia inadimplencia) {
		this.inadimplencia = inadimplencia;
	}

	public List<RecuperacaoLoja> getRecuperacao() {
		return recuperacao;
	}

	public void setRecuperacao(List<RecuperacaoLoja> recuperacao) {
		this.recuperacao = recuperacao;
	}

	public List<Seguro> getSeguro() {
		return seguro;
	}

	public void setSeguro(List<Seguro> seguro) {
		this.seguro = seguro;
	}

	public List<Adquirencia> getAdquirencia() {
		return adquirencia;
	}

	public void setAdquirencia(List<Adquirencia> adquirencia) {
		this.adquirencia = adquirencia;
	}

	public List<Cartao> getCartao() {
		return cartao;
	}

	public void setCartao(List<Cartao> cartao) {
		this.cartao = cartao;
	}

	public List<StatusLoja> getStatusLoja() {
		return statusLoja;
	}

	public void setStatusLoja(List<StatusLoja> statusLoja) {
		this.statusLoja = statusLoja;
	}

	
	
}

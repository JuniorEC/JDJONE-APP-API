package com.joadjunior.jdjone.app.dao;

import java.io.IOException;
import java.util.List;

import com.joadjunior.jdjone.app.relatorio.model.Empresa;
import com.joadjunior.jdjone.app.repository.EmpresaRepository;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EmpresaDao {
	
	final private static String HEROKU = "https://jdjone-ws.herokuapp.com";
	
	private EmpresaRepository service;
	
	public List<Empresa> getEmpresas() throws IOException {
		Retrofit retrofit = new Retrofit.Builder().baseUrl(HEROKU).addConverterFactory(GsonConverterFactory.create()).build();
		
		this.service = retrofit.create(EmpresaRepository.class);
		
		Call<List<Empresa>> repos = this.service.getAllEmpresas();
		
		List<Empresa> empresas = repos.execute().body();
		
		return empresas;
	}
	
	public Empresa getEmpresa(Long id) throws IOException {
		Retrofit retrofit = new Retrofit.Builder()
										.baseUrl(HEROKU)
										.addConverterFactory(GsonConverterFactory.create())
										.build();
		
		this.service = retrofit.create(EmpresaRepository.class);
		
		Call<Empresa> repos = this.service.getEmpresaByID(id);
		
		Empresa empresa = repos.execute().body();
		
		return empresa;
	}

}

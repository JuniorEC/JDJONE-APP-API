package com.joadjunior.jdjone.app.dao;

import java.io.IOException;
import java.util.List;

import com.joadjunior.jdjone.app.repository.AnaliticoRepository;
import com.joadjunior.jdjone.report.model.Analitico;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnaliticoDao {
	
final private static String HEROKU = "https://jdjone-ws.herokuapp.com";
	
	private AnaliticoRepository service;
	
	public List<Analitico> getAnaliticos() throws IOException {
		Retrofit retrofit = new Retrofit.Builder().baseUrl(HEROKU).addConverterFactory(GsonConverterFactory.create()).build();
		
		this.service = retrofit.create(AnaliticoRepository.class);
		
		Call<List<Analitico>> repos = this.service.getAllAnaliticos();
		
		List<Analitico> analiticos = repos.execute().body();
		
		return analiticos;
	}
	
	public Analitico getAnalitico(Long id) throws IOException {
		Retrofit retrofit = new Retrofit.Builder()
										.baseUrl(HEROKU)
										.addConverterFactory(GsonConverterFactory.create())
										.build();
		
		this.service = retrofit.create(AnaliticoRepository.class);
		
		Call<Analitico> repos = this.service.getAnaliticoByID(id);
		
		Analitico analitico = repos.execute().body();
		
		return analitico;
	}

}

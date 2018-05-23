package com.joadjunior.jdjone.app.repository;

import java.util.List;

import com.joadjunior.jdjone.app.relatorio.model.Analitico;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnaliticoRepository {
	
	@GET("api/analitico")
	Call<List<Analitico>>  getAllAnaliticos();

	@GET("api/analitico/{id}")
	Call<Analitico> getAnaliticoByID(@Path("id") Long id);

}

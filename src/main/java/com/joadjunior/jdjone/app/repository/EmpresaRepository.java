package com.joadjunior.jdjone.app.repository;

import java.util.List;

import com.joadjunior.jdjone.app.relatorio.model.Empresa;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EmpresaRepository {
	
	@GET("api/empresa")
	Call<List<Empresa>>  getAllEmpresas();

	@GET("api/empresa/{id}")
	Call<Empresa> getEmpresaByID(@Path("id") Long id);

}

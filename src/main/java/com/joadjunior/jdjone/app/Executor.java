package com.joadjunior.jdjone.app;

import java.io.IOException;
import java.util.List;

import com.joadjunior.jdjone.app.dao.AnaliticoDao;
import com.joadjunior.jdjone.app.relatorio.model.Analitico;

public class Executor {

	public static void main(String[] args) throws IOException {
		
		AnaliticoDao dao = new AnaliticoDao();
		
		List<Analitico> analiticos = dao.getAnaliticos();
		int i = 1;
		for (Analitico a : analiticos) {
			
			Analitico analitico = dao.getAnalitico(Long.valueOf(i));
			System.out.println(analitico.getFaturamento());
			i++;
		}

	}

}

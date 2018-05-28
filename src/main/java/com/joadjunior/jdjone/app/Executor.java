package com.joadjunior.jdjone.app;

import java.util.ArrayList;
import java.util.List;

import com.joadjunior.jdjone.app.dao.AnaliticoDao;
import com.joadjunior.jdjone.app.relatorio.Relatorio;
import com.joadjunior.jdjone.app.relatorio.model.Empresa;
import com.joadjunior.jdjone.app.relatorio.model.Faturamento;
import com.joadjunior.jdjone.report.model.Analitico;
import com.joadjunior.jdjone.report.model.ReportModel;

public class Executor {

	public static void main(String[] args) throws Exception {

		AnaliticoDao dao = new AnaliticoDao();
		ReportModel model = new ReportModel();
		List<ReportModel> reports = new ArrayList<ReportModel>();
		List<Analitico> analiticos = dao.getAnaliticos();
		int i = 1;
		for (Analitico a : analiticos) {
			model.setEmpresa(new Empresa(a.getEmpresa().getCnpj(), a.getEmpresa().getNomeFantasia(),
					a.getEmpresa().getRazaoSOcial(), a.getEmpresa().getRede(), a.getEmpresa().getCidade(),
					a.getEmpresa().getUf()));
			List<Faturamento> faturamentos = new ArrayList<Faturamento>();
			faturamentos.add(new Faturamento(model.getEmpresa(),
					a.getFaturamento().getId().doubleValue(), a.getFaturamento().getPl(),
					a.getFaturamento().getHib(), a.getFaturamento().getFatPl(), a.getFaturamento().getFatHib(),
					a.getFaturamento().getDelta()));
			model.setFaturamentos(faturamentos);
			model.setPeriodo("" + a.getMes() + a.getAno());
			
			reports.add(model);
			new Relatorio().imprimir(reports);

			i++;
		}

	}

}

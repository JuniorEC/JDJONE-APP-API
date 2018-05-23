package com.joadjunior.jdjone.app.relatorio;

import java.util.List;

import com.joadjunior.jdjone.report.model.ReportModel;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Relatorio {
	
private String path; //Caminho base
	
	private String pathToReportPackage; // Caminho para o package onde estão armazenados os relatorios Jarper
	
	//Recupera os caminhos para que a classe possa encontrar os relatórios
	public Relatorio() {
		this.path = "C:/Users/14208/Documents/NeonWorkspace/Jdjone-API/src/main/java/";
		this.pathToReportPackage = getPath() + "com/joadjunior/jdjone/app/relatorio/";
		System.out.println(path);
	}
	
	//Imprime/gera uma lista de Clientes
	public void imprimir(List<ReportModel> model) throws Exception	
	{
		JasperReport report = JasperCompileManager.compileReport(this.getPathToReportPackage() + "Relatorio.jrxml");
		
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(model));
 
		JasperExportManager.exportReportToPdfFile(print, "c:/Users/14208/Desktop/Relatorio_de_Clientes.pdf");		
	}
 
	public String getPathToReportPackage() {
		return this.pathToReportPackage;
	}
	
	public String getPath() {
		return this.path;
	}

}

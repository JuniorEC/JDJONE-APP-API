package com.joadjunior.jdjone.app.relatorio;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.joadjunior.jdjone.report.model.ReportModel;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Relatorio {
	
	private String path; //Caminho base
	
	private String pathToReportPackage; // Caminho para o package onde est�o armazenados os relatorios Jarper
	
	//Recupera os caminhos para que a classe possa encontrar os relat�rios
	public Relatorio() {
		this.path = "C:/Users/14208/Documents/NeonWorkspace/Jdjone-API/src/main/java/";
		this.pathToReportPackage = getPath() + "com/joadjunior/jdjone/app/relatorio/";
		System.out.println(path);
	}
	
	//Imprime/gera uma lista de Clientes
	public void imprimir(List<ReportModel> model) throws Exception {
		File report = new File(this.getPathToReportPackage() + "Relatorio.jasper");
		
		JasperPrint print = JasperFillManager.fillReport(report.getPath(), null, new JRBeanCollectionDataSource(model));
 
		byte[] bytes = JasperExportManager.exportReportToPdf(print);
		FileOutputStream fos = new FileOutputStream(this.thisFileExist());
		fos.write(bytes);
		fos.flush();
		fos.close();
	}
 
	public String getPathToReportPackage() {
		return this.pathToReportPackage;
	}
	
	public String getPath() {
		return this.path;
	}
	
	private String thisFileExist() {
		String filePah = "c:/Users/14208/Desktop/Relatorio_de_Clientes.pdf";
		File file = new File(filePah);
		int i = 1;
		while(file.exists()) {
			file = new File("c:/Users/14208/Desktop/Relatorio_de_Clientes_"+i+".pdf");
			i++;
		}
		return file.toString();
	}

}

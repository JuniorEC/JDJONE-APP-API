package com.joadjunior.jdjone.app.enums;

public enum Periodo {
	
	JANEIRO(1), FEVEREIRO(2), MARÇO(3), ABRIL(4), MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);
	
	private final int valor;
	
	Periodo(int mes) {
		this.valor = mes;
	}

}

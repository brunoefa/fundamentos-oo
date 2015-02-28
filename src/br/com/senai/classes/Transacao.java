package br.com.senai.classes;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transacao {
	
	public String dataHora;
	public String operacao;
	public double valor;
	public boolean status;
	
	public Transacao(String operacao, double valor, boolean status) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Calendar data = Calendar.getInstance();
		this.dataHora = df.format(data.getTime());
		this.operacao = operacao;
		this.valor = valor;
		this.status = status;
	}

	public String capturarTransacao() {
		DecimalFormat nf = new DecimalFormat("R$ ###,###,###.00");
		String valorString = nf.format(this.valor);
		String statusString = "negado(a)";
		if (this.status == true) {
			statusString = "efetuado(a)";
		}
		
		return  this.dataHora + " - " +
				valorString + " - " +
				this.operacao + " " +
				statusString;
	}		
}

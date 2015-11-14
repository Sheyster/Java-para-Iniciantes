import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Data{
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano){
		if (validaDataApi(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	
	public String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	private boolean validaDataApi(int dia, int mes, int ano) {
		String s = dia+"/"+mes+"/"+ano;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // aqui o pulo do gato
		try {
			df.parse(s);
			// data válida
			System.out.println("Data válida.");
		} catch (ParseException ex) {
			// data inválida
			System.out.println("Data inválida.");
		}
		return true;
	}
	
	private boolean validaData(int dia, int mes, int ano){
		if ((mes < 1) || (mes > 12)) {
			throw new IllegalArgumentException("Mês inválido");
		} else if ((ano < 1970) || (ano > 3000)) {
			throw new IllegalArgumentException("Ano inválido");
		} else if ((dia < 0) || (dia > diasMes(mes, ano))) {
			throw new IllegalArgumentException("Dia inválido");
		} 
		return true;
	}
	
	private boolean anoBissexto(int ano) {
		return ((ano % 4 == 0) && ((!(ano % 100 == 0)) || (ano % 400 == 0)));
	}

	private int diasMes(int mes, int ano) {
		int[] dias_meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int quant_dias = dias_meses[mes - 1];

		if ((anoBissexto(ano)) && (mes == 2))
			quant_dias = 29;

		return quant_dias;
	}
}
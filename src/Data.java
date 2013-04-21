public class Data {
	int dia;
	int mes;
	int ano;

	Data() {

	}

	Data(int dia, int mes, int ano) {
		this();
		if (!dataValida(dia, mes, ano)) {
			System.out.println("Data invalida");
		} else {
			this.setDia(dia);
			this.setMes(mes);
			this.setAno(ano);
		}
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public boolean dataValida(int dia, int mes, int ano) {
		if (dia > 31)
			return false;
		if (mes > 12)
			return false;
		if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
				&& (dia > 30))
			return false;
		if (mes == 2) {
			if (bisexto(ano)) {
				if (dia > 29) {
					return false;
				}
			} else {
				if (dia > 28)
					return false;
			}
		}
		return true;
	}

	public boolean bisexto(int ano) {
		return (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0));
	}

}

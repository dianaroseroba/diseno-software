package Fecha;

public class FechaPrograma {
	private int ano;
	private int mes;
	private int dia;
	
	//Constructores
	public FechaPrograma (int ano, int mes, int dia) {
		setFecha(ano, mes, dia);
	}
	private int diasDelMes(int mes) {
        if (mes == 2) {
            return 28;  // Para mes de febrero
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;  // mes de abril, junio, noviembre, septiembre
        } else {
            return 31;  // Los demas meses
        }
    }
	
	//Obtener getters and setters
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano >= 1000 && ano <= 9999) {
		this.ano = ano;
		} else {
			System.out.println ("el año es invalido, por favor consultar año en el intervalo de 1000 a 9999");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes>= 1 && mes <= 12) {
			this.mes = mes;	
		} else {
			System.out.println  ("el mes registrado no es vàlido, debe encontrarse en el intervalo de 01 a 12");
		}
		
	}

	public int getDia() {
		return dia;
	}

	public int setDia(int dia) {
		if (dia >= 1 && dia <= diasDelMes(this.mes)) {
			this.dia = dia;
			
		} else {
			System.out.println ("el dia registrado no es vàlido");
			
		}
		return dia;
		
	}
	//mi mètodo fecha
	public void setFecha (int ano, int mes, int dia) {
		setAno(ano);
		setMes(mes);
		setDia(dia);
	}

	@Override
	public String toString() {
		return "FechaPrograma [ano=" + ano + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
	

	
	

}

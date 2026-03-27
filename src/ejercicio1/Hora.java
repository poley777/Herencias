package ejercicio1;

public class Hora {
	private int hora;
	private int minuto;
	
	public Hora(int hora, int minuto) {
		if (hora < 0 || hora > 23 || minuto < 0 || minuto > 23) {
			throw new IllegalArgumentException ("Horas o minutos inválidos");
		}
		this.hora = hora;
		this.minuto = minuto;
	}
	
	/**
	 * Método que incrementa un minuto
	 */
	void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}
	
	/**
	 * Metodo que asigna un valor, si es valido a los minutos
	 * @param valor a asignar
	 * @return true/false si lo consigue modificar o no
	 */
	boolean setMinutos(int valor) {
		boolean minutosValidos = false;
		this.minuto = valor;
		if (minuto != valor) {
			minutosValidos = false;
		} else {
			minutosValidos = true;
		}
		return minutosValidos;
	}
	
	/**
	 * Metodo que asigna un valor, si es valido a los minutos
	 * @param valor a asignar
	 * @return true/false si lo consigue modificar o no
	 */
	boolean setHoras(int valor) {
		boolean horasValidas = false;
		this.hora = valor;
		if (hora < 0 || hora > 23) {
			horasValidas = false;
		} else {
			horasValidas = true;
		}
		return horasValidas;
	}

	@Override
	public String toString() {
		return + hora + ":" + minuto;
	}
	
	
	
	
	
	
}

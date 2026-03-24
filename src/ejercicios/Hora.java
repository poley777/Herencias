package ejercicios;

public class Hora {
	private int hora;
	private int minuto;
	
	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
	
	/**
	 * Método que incrementa un minuto
	 */
	void inc() {
		if (minuto == 59) {
			minuto = 0;
			if (hora == 23) {
				hora = 0;
			} else {
				hora++;
			}
			
		} else {
			minuto++;
		}
	}
	
	/**
	 * Metodo que asigna un valor, si es valido a los minutos
	 * @param valor a asignar
	 * @return true/false si lo consigue modificar o no
	 */
	boolean setMinutos(int valor) {
		this.minuto = valor;
		if (minuto != valor) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Metodo que asigna un valor, si es valido a los minutos
	 * @param valor a asignar
	 * @return true/false si lo consigue modificar o no
	 */
	boolean setHoras(int valor) {
		this.hora = valor;
		if (hora < 0 || hora > 23) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return + hora + ":" + minuto;
	}
	
	
	
	
	
	
}

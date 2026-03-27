	package ejercicio1;

public class HoraExacta extends Hora {
	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo < 0 || segundo > 60) {
			throw new IllegalArgumentException ("Segundos inválidos");
		}
		this.segundo = segundo;
	}
	
	boolean setSegundos (int valor) {
		boolean modificarSegundos = false;
		if (valor < 0 || valor > 60) {
			modificarSegundos = false;
		} else {
			this.segundo = valor;
			modificarSegundos = true;
		}
		return modificarSegundos;
	}
	
	void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
			}
		}

	@Override
	public String toString() {
		return super.toString() + ":" + segundo;
	}
	
}




package ejercicio1;

public class MainHora {

	public static void main(String[] args) {
		HoraExacta hora = new HoraExacta(3, 5, 59);
		
		System.out.println(hora);
		hora.inc();
		System.out.println(hora);
	}

}

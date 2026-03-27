package ejercicio2;

public class mainEmpleado {

	public static void main(String[] args) {
		
		Empleado E1 = new Empleado("Sergio");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Álvaro");
		Oficial OF1 = new Oficial("Miguel");
		Tecnico T1 = new Tecnico("Pedro");	
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);

	}

}

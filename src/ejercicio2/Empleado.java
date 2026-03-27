package ejercicio2;

public class Empleado {
	
	private String nombre;
	
	public Empleado (String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nuevoNombre) { 
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {return nombre;}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
}
	
	

package Arbol;


public class Persona implements Comparable<Persona> {
	private String Nombre;
	private int Edad;
	
	public Persona(String n,int e) {
		super();
		Nombre=n;
		Edad=e;
	}
	
	

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return Nombre;
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if (Nombre.compareTo(o.getNombre())==0) {
			return Edad-o.getEdad();
		}else {
		return Nombre.compareTo(o.getNombre());
		}
	}

}

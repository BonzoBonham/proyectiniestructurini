package Arbol;


public class Persona implements Comparable<Persona> {
	private String Nombre;
	private int Edad;
	private boolean isVivo;
	private String fechanacimiento;
	private String fechamuerte;
	private String conyugue;
	
	public Persona(String n,int e, boolean isVivo ) {
		super();
		Nombre=n;
		Edad=e;
		this.isVivo = isVivo;
		conyugue = null;
	}
	
	public boolean isVivo() {
		return isVivo;
	}

	public void setVivo(boolean isVivo) {
		this.isVivo = isVivo;
	}

	public Persona(String n,int e, String fechanacimiento ) {
		super();
		fechamuerte = null;
		fechanacimiento = fechanacimiento;
		Nombre=n;
		Edad=e;
		this.isVivo = true;
		
		conyugue = null;
	}
	
	

	public String getFechamuerte() {
		return fechamuerte;
	}

	public void setFechamuerte(String fechamuerte) {
		this.fechamuerte = fechamuerte;
	}

	public String getConyugue() {
		return conyugue;
	}

	public void setConyugue(String conyugue) {
		this.conyugue = conyugue;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
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
		
			return Edad-o.getEdad();
	}
	public String toStringCompleto() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", isVivo=" + isVivo + ", fechanacimiento="
				+ fechanacimiento + ", fechamuerte=" + fechamuerte + "]";
			}
		}
	
	
	


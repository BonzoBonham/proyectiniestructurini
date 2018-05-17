package Arbol;

public class Nodo <E extends Comparable<E>>{
private E persona;
private Nodo hermanos;
private NodoPareja papas;
private NodoPareja esposa;


public Nodo(E persona, Nodo hermanos, NodoPareja papas, NodoPareja esposa) {
	super();
	this.persona = persona;
	this.hermanos = hermanos;
	this.papas = papas;
	this.esposa = esposa;
}
public Nodo(E persona) {
	super();
	this.persona = persona;
	this.hermanos = null;
	this.papas = null;
	this.esposa = null;
}


public E getPersona() {
	return persona;
}


public void setPersona(E persona) {
	this.persona = persona;
}


public Nodo getHermanos() {
	return hermanos;
}


public void setHermanos(Nodo hermanos) {
	this.hermanos = hermanos;
}


public NodoPareja getPapas() {
	return papas;
}


public void setPapas(NodoPareja papas) {
	this.papas = papas;
}


public NodoPareja getEsposa() {
	return esposa;
}


public void setEsposa(NodoPareja esposa) {
	this.esposa = esposa;
}



public String toStringCompleto() {
	String herma="[";
	Nodo nodo=this.getHermanos();
	while(nodo!=null) {
		herma=herma+nodo.getPersona()+" ,";
		nodo=nodo.getHermanos();
	}
	herma=herma+"]";
	return "Persona=\n\t" + ((Persona)persona).getNombre() + "\nHermanos=\n\t" + herma + "\nPadres=\n\t"+ papas+ "\nPareja=\n\t" + esposa;
} 

@Override
public String toString() {
	return ((Persona)persona).getNombre();
	
}
}

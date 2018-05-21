package Arbol;

import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;

public class Nodo <E extends Comparable<E>> extends DefaultMutableTreeNode{
private E persona;
private NodoPareja papas;
private NodoPareja esposa;


public Nodo(E persona, NodoPareja papas, NodoPareja esposa) {
	super();
	this.persona = persona;
	this.papas = papas;
	this.esposa = esposa;
	hermanos = new ArrayList<E>();
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


public ArrayList<E> getHermanos() {
	return hermanos;
}


public void setHermanos(ArrayList<E> hermanos) {
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

public void addHermano(Persona agregar) {
	
}



/*public String toStringCompleto() {
	String herma="[";
	Nodo nodo=this.getHermanos();
	while(nodo!=null) {
		herma=herma+nodo.getPersona()+" ,";
		nodo=nodo.getHermanos();
	}
	herma=herma+"]";
	return "Persona=\n\t" + ((Persona)persona).getNombre() + "\nHermanos=\n\t" + herma + "\nPadres=\n\t"+ papas+ "\nPareja=\n\t" + esposa;
} */

@Override
public String toString() {
	return ((Persona)persona).getNombre();
	
}
}

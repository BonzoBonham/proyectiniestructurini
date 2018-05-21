package Arbol;

import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;

public class Nodo <E extends Comparable<E>> extends DefaultMutableTreeNode{

	//Atributos	
	private E info;


	//Constructor: recibe objeto persona y nodopareja papas
	public Nodo(E info) {
		this.info = info;
	}

	//Getters y Setters
	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}
	//-------------------//-----------------------------//-----------------


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

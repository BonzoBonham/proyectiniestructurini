package Arbol;

import java.util.ArrayList;

public class NodoPareja <E extends Comparable<E>> extends Nodo{

	//Atributos 
	private ArrayList<Nodo> hijos;
	private NodoIndividual anterior;

	//Getters y setters
	public ArrayList<Nodo> getHijos() {
		return hijos;
	}
	public void setHijos(ArrayList<Nodo> hijos) {
		this.hijos = hijos;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setHombre(Nodo anterior) {
		this.anterior = (NodoIndividual) anterior;
	}

	//Constructor
	public NodoPareja(String info) {
		super(info);
		this.hijos = new ArrayList<>();
	}
	
	//Metodo para agregar un hijo, se le pasa una persona
	public void AgregarHijo(Nodo per) {
		this.hijos.add(per);
		((NodoIndividual) per).setPapas(this);
	}
	
	@Override
	public String toString() {
		return this.getInfo().toString();
	}
	
	/*public String toStringCompleto() {
		String herma;
		if(this.getHijo()==null) {herma=" ";}
		else {
			Nodo n=this.getHijo().getHermanos();
			herma=((Persona)this.getHijo().getPersona()).getNombre()+", ";
			if(n!=null) {

				while(n!=null) {
					herma=herma+((Persona)n.getPersona()).getNombre()+", ";
					n=n.getHermanos();
				}
			}

		}
		return "Hombre=\n\t" + (Persona)hombre.getPersona() + "\nMujer=\n\t" + (Persona)mujer.getPersona() + "\nHijos=\n\t"+herma;

	}*/
	
	
}

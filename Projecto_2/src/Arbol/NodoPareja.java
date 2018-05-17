package Arbol;

public class NodoPareja <E extends Comparable<E>> {
private Nodo hijo;
private Nodo hombre;
private Nodo mujer;
public Nodo getHijo() {
	return hijo;
}
public void setHijo(Nodo hijo) {
	this.hijo = hijo;
}
public Nodo getHombre() {
	return hombre;
}
public void setHombre(Nodo hombre) {
	this.hombre = hombre;
}
public Nodo getMujer() {
	return mujer;
}
public void setMujer(Nodo mujer) {
	this.mujer = mujer;
}
public NodoPareja(Nodo hijo, Nodo hombre, Nodo mujer) {
	super();
	this.hijo = hijo;
	this.hombre = hombre;
	this.mujer = mujer;
}
public NodoPareja(Nodo hombre, Nodo mujer) {
	super();
	this.hijo = null;
	this.hombre = hombre;
	this.mujer = mujer;
}
public NodoPareja() {
	super();
	this.hijo = null;
	this.hombre = null;
	this.mujer = null;
}
@Override
public String toString() {
	
	return " [Hombre=" + (Persona)hombre.getPersona() + ", Mujer=" + (Persona)mujer.getPersona() + "]";
}
public String toStringCompleto() {
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

	}
}

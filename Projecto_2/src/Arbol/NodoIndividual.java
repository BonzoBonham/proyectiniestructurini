package Arbol;

public class NodoIndividual <E extends Comparable<E>> extends Nodo{
	
	//Atributos
	private NodoPareja papas;
	private NodoPareja signi;
	
	//Getters y Setters
	public NodoPareja getPapas() {
		return papas;
	}

	public void setPapas(NodoPareja papas) {
		this.papas = papas;
	}
	
	//Constructor
	public NodoIndividual(Persona info) {
		super(info);
		
	}
	public NodoPareja getSigni() {
		return signi;
	}

	public void setSigni(NodoPareja signi) {
		this.signi = signi;
	}

	@Override
	public String toString() {

		return ((Persona)this.getInfo()).getNombre();
	}
}

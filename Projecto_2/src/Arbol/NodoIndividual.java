package Arbol;

public class NodoIndividual <E extends Comparable<E>> extends Nodo{
	
	//Atributos
	private NodoPareja papas;
	
	//Getters y Setters
	public NodoPareja getPapas() {
		return papas;
	}

	public void setPapas(NodoPareja papas) {
		this.papas = papas;
	}
	
	//Constructor
	public NodoIndividual(Persona info, NodoPareja papas) {
		super(info);
		this.papas = papas;
	}
	
}

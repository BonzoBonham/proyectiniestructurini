package Arbol;

public class Arbol<E> {
private Nodo raiz;

public Nodo getRaiz() {
	return raiz;
}

public void setRaiz(Nodo raiz) {
	this.raiz = raiz;
}

public Arbol(Nodo raiz) {
	super();
	this.raiz = raiz;
}

public Arbol() {
	super();
	this.raiz = null;
}

public NodoPareja Casar(Nodo n1, Persona n2) {
	NodoPareja np=new NodoPareja(((Persona)(n1.getInfo())).getNombre()+" y "+n2.getNombre());
	((NodoIndividual) n1).setSigni(np);
	return np;
}
/*
public void AgregarHijoAPareja(NodoPareja nodo, Nodo n) {
	if(nodo.getHijo()==null) {nodo.setHijo(n);n.setPapas(nodo);
	}
	
	else{
		Nodo nod=nodo.getHijo();
		while(nod.getHermanos()!=null) {
			nod=nod.getHermanos();
		}
		nod.setHermanos(n);
	}
}

public void AgregarHermano(Nodo n1,Nodo n) {
		Nodo n2=n1;
		while(n2.getHermanos()!=null) {
			n2=n2.getHermanos();
		}
		n2.setHermanos(n);
		}

public void AgregarPapas(Nodo nod,NodoPareja n) {
	nod.setPapas(n);
	n.setHijo(nod);
}

public void getPrimos(Nodo n) {
	NodoPareja AbuP=n.getPapas().getHombre().getPapas();
	
	System.out.println("Por Parte de Papa");
	if(AbuP!=null) {
	if(AbuP.getHijo()==null) {} 
	else {
	Nodo tios=AbuP.getHijo();
		while(tios!=null) {
		if(tios.getPersona().compareTo(n.getPapas().getHombre().getPersona())==0) {}
		else {
			System.out.println("\t"+tios);
			recorrerHijos(tios.getEsposa());}
		tios=tios.getHermanos();
		System.out.println("");
		}
	
	}
	}
	NodoPareja AbuM=n.getPapas().getMujer().getPapas();
	
	System.out.println("Por Parte de Mama");
	if(AbuM!=null) {
		if(AbuM.getHijo()==null) {} 
		else {
		Nodo tios=AbuM.getHijo();
			while(tios!=null) {
			if(tios.getPersona().compareTo(n.getPapas().getMujer().getPersona())==0) {}
			else {
				System.out.println("\t"+tios);
				recorrerHijos(tios.getEsposa());}
			tios=tios.getHermanos();
			System.out.println("");
			}
		
		}
		}
}

public void recorrerHijos(NodoPareja n) {
	if(n!=null) {
	System.out.print("\t\t"+n.getHijo().getPersona()+"\n");
	Nodo herm=n.getHijo().getHermanos();
	while(herm!=null) {
		System.out.print("\t\t"+herm.getPersona()+"\n");
		herm=herm.getHermanos();
	}
	}
}

public void getAbuelos(Nodo n) {
	System.out.print("Por Parte de Papa \n\t");
	System.out.print(n.getPapas().getHombre().getPapas()+"\nPor Parte de Mama\n\t");
	System.out.print(n.getPapas().getMujer().getPapas()+"\n");
}

*/


}


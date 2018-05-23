package Arbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthSplitPaneUI;

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

public Nodo Casar(Nodo n1, Persona n2) {
	Nodo np=new NodoPareja(((Persona)(n1.getInfo())).getNombre()+" y "+n2.getNombre());
	((NodoIndividual) n1).setSigni((NodoPareja)np);
	((NodoPareja) np).setHombre((NodoIndividual) n1);
	
	return np;
}

public Nodo buscarNodo(Nodo busc){
	return buscarNodo(busc, raiz);
}


//Metodo que busca la pareja que es padre de un nodoindividual
public Nodo buscarNodo(Nodo busc, Nodo padre) {
	if(padre instanceof NodoPareja){
		NodoPareja pareja = ((NodoPareja)padre);
		if(pareja.getHijos() != null && pareja.getHijos().contains(busc)){
			return (Nodo)pareja;
		}
		Nodo temp = null;
		int j = 0;
		while (pareja.getHijos() != null && j<pareja.getHijos().size()) {
			temp = buscarNodo(busc, (Nodo)pareja.getHijos().get(j++));		
			if(temp != null)
				return (Nodo)temp;
		}
		return null;
	} else {
		NodoIndividual pareja = ((NodoIndividual)padre);
		Nodo ret = buscarNodo(busc, pareja.getSigni());
		return ret;
	}
}

public LinkedList<Nodo> getHermanos(Nodo yo) {
	LinkedList <Nodo> list=new LinkedList<Nodo>();
	Nodo papas=buscarNodo(yo);
	
	Iterator<Nodo> r=((NodoPareja)papas).getHijos().iterator();
	while(r.hasNext()) {
		Nodo her=r.next();
		if(her!=yo) {
			list.add(her);
		}
	}
	return list;
	}

public void AgregarHijoAPareja(Nodo n, Nodo n2) {
	((NodoPareja)n).AgregarHijo(n2);
}

public Nodo getAbuelosPaternos(Nodo yo) {
return ((NodoIndividual)((NodoPareja)buscarNodo(yo)).getAnterior()).getPapas();
}

public LinkedList<Nodo> getTios(Nodo yo) {
	LinkedList <Nodo> list=new LinkedList<Nodo>();
	Nodo papa=((NodoPareja)buscarNodo(yo)).getAnterior();
	return getHermanos(papa);
	
}
public LinkedList<Nodo> getPrimos(Nodo yo) {
	LinkedList <Nodo> list=new LinkedList<Nodo>();
	LinkedList <Nodo> tios=getTios(yo);
	Iterator t=tios.iterator();
	while(t.hasNext()) {
		Nodo f=(Nodo) t.next();
		if(((NodoIndividual)f).getSigni()!=null) {
			if(((NodoPareja)((NodoIndividual)f).getSigni()).getHijos().isEmpty()) {}
			else {
				Iterator p=((NodoPareja)((NodoIndividual)f).getSigni()).getHijos().iterator();
				while(p.hasNext()) {
					list.add((Nodo) p.next());
					
				}
				
			}
		}
		
		}
	
		
	
	return list;
	
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


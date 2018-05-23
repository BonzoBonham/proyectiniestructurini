package Arbol;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona p1=new Persona("Andres Posada",21,true); 
Persona p2=new Persona("Daniel Posada",18,true); 
Persona p3=new Persona("Tomas Posada",13,true);
Persona p4=new Persona("Jorge Luis Posada",54,true);
Persona p5=new Persona("Ana Lucia Saldarriaga",52,true);
Persona p6=new Persona("Camilo Posada",37,true);
Persona p7=new Persona("Juan Posada",50,true);
Persona p8=new Persona("Nubia Mejia",73,true);
Persona p9=new Persona("Jorge Posada",79,true);
Persona p10=new Persona("Valentina Posada",10,true);
Persona p11=new Persona("Santiago Posada",5,true);
Persona p12=new Persona("Jenny Ramirez",33,true);
Persona p13=new Persona("Daniela Pareja",19,true);


Nodo n1=new NodoIndividual(p1);
Nodo n2=new NodoIndividual(p2);
Nodo n3=new NodoIndividual(p3);
Nodo n4=new NodoIndividual(p4);
Nodo n6=new NodoIndividual(p6);
Nodo n7=new NodoIndividual(p7);
Nodo n9=new NodoIndividual(p9);
Nodo n10=new NodoIndividual(p10);
Nodo n11=new NodoIndividual(p11);




/*Persona [] per= {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12};
for(int i=0;i<per.length ; i++) {
	System.out.println(per[i]);
}

Nodo [] ner= {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12};
for(int i=0;i<ner.length ; i++) {
	System.out.println(ner[i]);
}*/

Arbol a=new Arbol();
Nodo np1=a.Casar(n4,p5); //mis papas
Nodo np2=a.Casar(n9,p8); // mis abuelos
Nodo np3=a.Casar(n6,p12); // mi tio
Nodo np4=a.Casar(n1,p13); //mi novia

a.setRaiz(n9);

//Agregar Hijos de mis abuelos
a.AgregarHijoAPareja(np2, n4);
a.AgregarHijoAPareja(np2, n6);
a.AgregarHijoAPareja(np2, n7);
//Agregar Hijos de mis Papas
a.AgregarHijoAPareja(np1, n1);
a.AgregarHijoAPareja(np1, n2);
a.AgregarHijoAPareja(np1, n3);
//Agregar Hijos de mis tios
a.AgregarHijoAPareja(np3, n10);
a.AgregarHijoAPareja(np3, n11);

/*
System.out.println(n4);
System.out.println();
System.out.println("Casar");
System.out.println(((NodoIndividual)n4).getSigni());
System.out.println(((NodoPareja)np2).getAnterior());
System.out.println();
System.out.println("Agregar Hijo a la pareja " + np2);
System.out.println(((NodoIndividual)n4).getPapas());
System.out.println(((NodoPareja)np2).getHijos());

System.out.println(a.buscarNodo(n4));
*/
System.out.println(n1);
System.out.println();
System.out.println("Casar");
System.out.println(((NodoIndividual)n1).getSigni());
System.out.println(((NodoIndividual)n1).getSigni().getAnterior());
System.out.println();
System.out.println("Agregar Hijo a la pareja :" + ((NodoIndividual)n1).getPapas());
System.out.println(((NodoIndividual)n1).getPapas());
System.out.println(((NodoIndividual)n1).getPapas().getHijos());

System.out.println();
System.out.println("Los abuelos paternos son "+ a.getAbuelosPaternos(n1));
System.out.println();
System.out.println("Los hermanos son "+ a.getHermanos(n1));
System.out.println();
System.out.println("Los tios son "+ a.getTios(n1));
System.out.println();
System.out.println("Los primos son "+ a.getPrimos(n1));

/*
a.AgregarHermano(n1, n2); // mi hermano
a.AgregarHermano(n1, n3); //mi hermano
a.AgregarPapas(n1,np1); //mis papas
a.AgregarHermano(n4, n6);//mi tio 
a.AgregarHermano(n4, n7); // mi tio
a.AgregarPapas(n4, np2); // mis abuelos
a.AgregarHijoAPareja(np3, n10); // hijos de mi tio (primos)
a.AgregarHermano(n10, n11);
a.AgregarHermano(n5,n16); // hermano de mi mama
a.AgregarHijoAPareja(np5, n5);
a.AgregarHijoAPareja(np6, n17);
a.AgregarHermano(n17, n18);
//System.out.println(n1.toStringCompleto());
a.getAbuelos(n1);
//a.getPrimos(n1);
	*/
}

}

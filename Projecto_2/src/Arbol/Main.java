package Arbol;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona p1=new Persona("Andres Posada",21);
Persona p2=new Persona("Daniel Posada",18);
Persona p3=new Persona("Tomas Posada",13);
Persona p4=new Persona("Jorge Luis Posada",54);
Persona p5=new Persona("Ana Lucia Saldarriaga",52);
Persona p6=new Persona("Camilo Posada",37);
Persona p7=new Persona("Juan Posada",50);
Persona p8=new Persona("Nubia Mejia",73);
Persona p9=new Persona("Jorge Posada",79);
Persona p10=new Persona("Valentina Posada",10);
Persona p11=new Persona("Santiago Posada",5);
Persona p12=new Persona("Jenny Ramirez",33);
Persona p13=new Persona("Daniela Pareja",19);
Persona p14=new Persona("Luis Guillermo Saldarriaga",78);
Persona p15=new Persona("Vivian Moreno",70);
Persona p16=new Persona("Juan Guillermo Saldarriaga",55);
Persona p17=new Persona("Felipe Saldarriaga",19);
Persona p18=new Persona("Juan Luis Saldarriaga",19);
Persona p19=new Persona("Gloria Perez",50);

Nodo n1=new Nodo(p1);
Nodo n2=new Nodo(p2);
Nodo n3=new Nodo(p3);
Nodo n4=new Nodo(p4);
Nodo n5=new Nodo(p5);
Nodo n6=new Nodo(p6);
Nodo n7=new Nodo(p7);
Nodo n8=new Nodo(p8);
Nodo n9=new Nodo(p9);
Nodo n10=new Nodo(p10);
Nodo n11=new Nodo(p11);
Nodo n12=new Nodo(p12);
Nodo n13=new Nodo(p13);
Nodo n14=new Nodo(p14);
Nodo n15=new Nodo(p15);
Nodo n16=new Nodo(p16);
Nodo n17=new Nodo(p17);
Nodo n18=new Nodo(p18);
Nodo n19=new Nodo(p19);



/*Persona [] per= {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12};
for(int i=0;i<per.length ; i++) {
	System.out.println(per[i]);
}

Nodo [] ner= {n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12};
for(int i=0;i<ner.length ; i++) {
	System.out.println(ner[i]);
}*/

Arbol a=new Arbol();
NodoPareja np1=a.Casar(n4,n5); //mis papas
NodoPareja np2=a.Casar(n9,n8); // mis abuelos
NodoPareja np3=a.Casar(n6,n12); // mi tio
NodoPareja np4=a.Casar(n1,n13); //mi novia
NodoPareja np5=a.Casar(n14,n15); //mis otros abuelos
NodoPareja np6=a.Casar(n16,n19); //mis otros tios

a.setRaiz(n1); //yo

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
	}

}

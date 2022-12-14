package test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import modelo.entidades.*;

public class testJPA {

	public static void main(String[] args) {
		EntityManager em =  Persistence.createEntityManagerFactory("MascoTinder_Proyecto").createEntityManager();
		
		//INSERCION
		Persona p = new Persona("Erick", "Munoz", "erick1416", "1234ericknator");
		Mascota m = new Mascota("Atomicardo22", null, Especie.PERRO,Sexo.MACHO , 2, p);
		ArrayList<Foto> fotosAtom = new ArrayList<Foto>();
		fotosAtom.add(new Foto("./imgs/Atom1.jpg",m));
		fotosAtom.add(new Foto("./imgs/Atom2.jpg",m));
		fotosAtom.add(new Foto("./imgs/Atom3.jpg",m));
		m.setFotos(fotosAtom);
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
	}

}

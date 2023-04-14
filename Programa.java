package programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dominio");
		EntityManager em = emf.createEntityManager();
	
	
		Pessoa p = em.find(Pessoa.class,2);
		
		System.out.println(p);
		
		System.out.println("Done!");
		em.close();
		emf.close();
	
	}

}

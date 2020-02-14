package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Personne;

public class test {

	public static void main(String[] args) {
		// test();
		// testCreate();
//		testFind();
//		testModif();
//		 testRemove();
//		testMergev1();
		testMergev2();
	}
	
	static void testMergev2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Personne p = null;

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p = em.find(Personne.class, 3);
		p.setAge(852);
		em.close();
		
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();
		tx2.begin();
		p= em2.merge(p);
		tx2.commit();
		em2.close();
		
		emf.close();
	}
	
	
	static void testMergev1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = new Personne(3, "ezaeza", "azertyuiop", 80);
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p = em.merge(p);
		
		tx.commit();
		em.close();
		emf.close();
	}
	
	static void testRemove() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p = em.find(Personne.class, 2);
		em.remove(p);
		
		tx.commit();
		em.close();
		emf.close();
	}
	
	static void testModif() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p = em.find(Personne.class, 1);
		p.setAge(22);
		
		tx.commit();
		em.close();
		emf.close();
	}


	static void testFind() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		p = em.find(Personne.class, 1);
		em.contains(p);
		
		System.out.println(em.contains(p));

		em.close();
		emf.close();
	}

	static void testCreate() {
		Personne p = new Personne(1, "dupond", "toto", 10);
		Personne p2 = new Personne(2, "ezaeza", "toezto", 80);
		Personne p3 = new Personne(3, "ezaeza", "totezeeo", 40);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);
		em.persist(p2);
		em.persist(p3);
		tx.commit();

		em.close();
		emf.close();

	}

	static void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

}
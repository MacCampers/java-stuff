package projetSerialisation;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// test1();
		// testSerialiserPersonne();
		// testDSerialiserBineairePersonne();
		// testSerialiserPersonneXML();
		// testDSerialiserXMLPersonne();
		// testSerialiserDeuxPersonneXML();
		// testDSerialiserXMLDeuxPersonne();
		testSerialiserArrayListPersonneXML();

	}

	static void testSerialiserArrayListPersonneXML() throws IOException { // flux d'écriture

		ArrayList<Personne> e = new ArrayList<Personne>();
		e.add(new Personne("pierro", "jacquo", 55));
		e.add(new Personne("luc", "paul", 44));
		e.add(new Personne("marc", "carl", 33));
		File f = new File("c://tmp/test4arraylistjava.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(e);
		oos.close();
		fos.close();
	}

	static void testDSerialiserXMLDeuxPersonne() throws IOException, ClassNotFoundException { // flux de lecture

		Personne p1 = null;
		Personne p2 = null;
		Personne p3 = null;
		File f = new File("c://tmp/test3java.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		Object o1 = ois.readObject();
		p1 = (Personne) ois.readObject();
		p2 = (Personne) ois.readObject();
		p3 = (Personne) ois.readObject();

		ois.close();
		fis.close();
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());

	}

	static void testSerialiserDeuxPersonneXML() throws IOException { // flux d'�criture

		Personne p1 = new Personne("Jean", "marc", 25);
		Personne p2 = new Personne("Maitre", "Jerome", 27);
		File f = new File("c://tmp/test3java.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		fos.close();
	}

	static void testDSerialiserXMLPersonne() throws IOException, ClassNotFoundException { // flux de lecture

		Personne p1 = null;
		File f = new File("c://tmp/test2java.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(p1.getAge());
	}

	static void testSerialiserPersonneXML() throws IOException { // flux d'�criture

		Personne p1 = new Personne("Jean", "marc", 25);
		p1.setAge(22);
		System.out.println(p1);
		File f = new File("c://tmp/test2java.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(p1);
		oos.close();
		fos.close();
	}

	static void testDSerialiserBineairePersonne() throws IOException, ClassNotFoundException { // flux de lecture

		Personne p1 = null;
		File f = new File("c://tmp/test1java.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(p1.getNom());
	}

	static void testSerialiserPersonne() throws IOException { // flux d'�criture

		Personne p1 = new Personne("Jean", "marc", 25);
		p1.setAge(22);
		System.out.println(p1);
		File f = new File("c://tmp/test1java.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.close();
		fos.close();
	}

	static void test1() {
		Personne p = new Personne("Jean", "marc", 25);
		p.setAge(22);
		System.out.println(p);

	}
}
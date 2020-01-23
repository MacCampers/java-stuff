package projetSerialization;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		testSerializePersonneBinaire();
//		testSerializePersonneObject();
//		testSerialiserPersonneXML();
		testSerialiseListPersonnes();
	}
	
	static void testSerialiseListPersonnes() throws IOException {
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.add(new Personne("11", "ppp", 20));
		list.add(new Personne("22", "ppp", 240));
		list.add(new Personne("33", "ppp", 250));
		
		File f = new File("c\\tmp\\list.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(list);
		oos.close();
		fos.close();
		
	}

	static void testSerialiserPersonneXML() throws IOException {
		ArrayList<Personne> recup = null;
		File f = new File("c:/tmp/listeserie.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		recup = (ArrayList<Personne>) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(recup);
	}

	static void testSerializePersonneObject() throws IOException, ClassNotFoundException {
		Personne p = new Personne("aa", "bb", 10);
		p.setAge(15);
		System.out.println(p);

		File f = new File("banque.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Personne p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();
	}

	static void testSerializePersonneBinaire() throws IOException {
		Personne p1 = new Personne("aa", "bb", 10);
		p1.setAge(15);
		System.out.println(p1);

		File f = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.close();
		fos.close();
	}

}

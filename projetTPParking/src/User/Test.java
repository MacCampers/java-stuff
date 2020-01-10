package User;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		InfoProprio proprio = new InfoProprio("Charles", "Dupond");
		Voitures p1 = new Voitures(0, proprio, "testmat", "Renault");
		Voitures p2 = new Voitures(130, proprio, "testmat123", "Twingo");
		Voitures[] tab = { p1, p2 };
		Parking parking = new Parking("TestParking", tab);
		System.out.println(parking);
		p1.setVitesse(150);
		System.out.println("flash : " + p1.getFlash());
		parking.Remove("testmat");
		System.out.println(parking);
		parking.Add(p1);
		System.out.println(parking);
		System.out.println(parking.getCount());
		System.out.println(parking.getCountByMarque("Twingo"));
	}
}

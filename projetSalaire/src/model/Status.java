package model;

public class Status {
	private int experience;
	private boolean isCadre;
	private final int expPivot = 3;
	private final int expMin = 0;

	public Status(int experience) {
		this.experience = experience;
		computeCadre();
	}

	private void computeCadre() {
		if (experience > expMin && experience < expPivot)
			isCadre = false;
		else
			isCadre = true;
	}

	public String toString() {
		String str = "Status [experience=" + experience;
		str += (isCadre = true) ? " est cadre]" : " n'est pas cadre]";
		return str;
	}
}

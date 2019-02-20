package cours06;

public class Carre extends FormeGeometrique {
	
	private double cote;
	
	public Carre(double cote) {
		super();
		this.cote = cote;
	}
	public Carre() {
	}
	
	public double getAire() {
		return cote*cote;
	}
	public double getPerimetre() {
		return 4*cote;
	}
	public String toString() {
		return "Le carré a un cote de " + cote + " " + uniteDeMesure + " " + super.toString();
	}
	public static void main(String[] args) {
		Carre carre = new Carre();
		carre.cote = 5;
		System.out.println(carre);
		
	}
	
}

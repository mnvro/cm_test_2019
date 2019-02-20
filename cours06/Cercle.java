package cours06;

public class Cercle extends FormeGeometrique {
	private double rayon;
	
	public Cercle() {
	}
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	public double getAire() {
		return Math.PI * Math.pow(rayon, 2);
	}
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	public String toString() {
		return "Le cercle a " + rayon + " " + uniteDeMesure + " de rayon " + super.toString();
	}

	public static void main(String[] args) {
		Cercle cercle = new Cercle();
		cercle.rayon = 5;
		cercle.uniteDeMesure = "cm";
		System.out.println(cercle);
	}
	
}

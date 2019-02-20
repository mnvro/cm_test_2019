package cours06;

public abstract class FormeGeometrique {
	protected String uniteDeMesure = "m";
	public abstract double getAire();
	public abstract double getPerimetre();
	public String toString() {
		return "La figure a "+ getAire() + " " + uniteDeMesure + "²" + " de surface et " + getPerimetre() + " " +uniteDeMesure + " de périmètre";
	}
}

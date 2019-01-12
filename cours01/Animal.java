package cours01;

public class Animal {
	

	private String espece;
	private int age;
	private double poids;

	public Animal(String espece, int age, double poids) {
		this.espece = espece;
		this.age = age;
		this.poids = poids;
	}
	
	public Animal() {
	}

	public void dort() {
		System.out.println("Je dors");
	}
	public void seDeplace() {
		System.out.println("Je me déplace");
	}
	public void mange() {
		System.out.println("Je mange");
	}
	
	public String toString() {
		return "Animal [espece=" + espece + ", age=" + age + " ans, poids=" + poids + "kg]";
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public static void main(String[] args) {
		
		Animal felix = new Animal();
		felix.espece = "chat";
		felix.age = 5;
		felix.poids = 3;
		
		Animal milou = new Animal();
		milou.espece = "chien";
		milou.age = 7;
		milou.poids = 8;

	}

}

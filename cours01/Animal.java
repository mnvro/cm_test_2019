package cours01;

public class Animal {
	private String espece;
	private int age;
	private double poids;

	public void dort() {
		System.out.println("Je dors");
	}
	public void seDeplace() {
		System.out.println("Je me déplace");
	}
	public void mange() {
		System.out.println("Je mange");
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

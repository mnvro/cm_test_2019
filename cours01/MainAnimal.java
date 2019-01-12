package cours01;

public class MainAnimal {

	public static void main(String[] args) {
		Animal felix = new Animal("chat", 5, 3);
		System.out.println(felix);
		
		
		//Animal milou = new Animal("chien",7,8);
		Animal milou = new Animal();
		milou.setEspece("chien");
		milou.setAge(7);
		milou.setPoids(8);
		
		System.out.println(milou.getEspece()+" "+milou.getAge()+" ans "+milou.getPoids()+" kg");
		System.out.println(milou);

	}

}

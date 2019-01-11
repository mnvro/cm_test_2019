package cours01;

public class Etudiant {
	private String nom;
	private String prenom;
	private int numero;
	
	public static void main(String[] args) {
		Etudiant etudiant1 = new Etudiant();
		etudiant1.nom = "Castiaux";
		etudiant1.prenom = "Julien";
		etudiant1.numero = 42;
		
		Etudiant etudiant2 = new Etudiant();
		etudiant2.nom = "Dupont";
		etudiant2.prenom = "Jérémy";
		etudiant2.numero = 3;
	}

}

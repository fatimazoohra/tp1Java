package GestionEleve;

public class testEx1 {

	public static void main(String[] args) {
		Eleve e1=new Eleve("san");
		e1.ajouterNote(10.00);
		e1.ajouterNote(12.00);
		System.out.println(e1.getListeNotes().size());
		System.out.println(e1.getListeNotes());
		System.out.println(e1.toString());

	}

}

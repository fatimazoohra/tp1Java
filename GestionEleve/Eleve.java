package GestionEleve;

import java.util.ArrayList;
import java.util.Iterator;

public class Eleve {
	private String nom;
	private ArrayList<Double> list;
	private double moyenne;
	
	public Eleve(String nom) {
		list = new ArrayList<Double>();
		this.nom = nom;
	}
	public double getMoyenne() {
		return moyenne;
	}
	
	
	public void ajouterNote(double note) {
		
		double somme=0 ;
		
		for(int i=0; i<list.size(); i++)
		{
			somme += list.get(i);
		}
		
		double  length = (double)list.size();
		double oldmoyenne= somme/length;
		
		list.add(note);
		double newsomme=(oldmoyenne+note);
		moyenne= newsomme/(length+1);
	}
	
	public String getNom() {
		return nom;
	}
	public ArrayList<Double> getListeNotes(){
		return list;
	}
	public String toString() {
		return "Eleve ( nom:  "+nom +" liste des moyenne :"+getListeNotes()+" , Moyenne :"+moyenne+")";
	}
}

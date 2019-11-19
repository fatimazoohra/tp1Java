package animal;

public class Animal {
	public static int nbAnimal;
	private String nom;
	private int age;
	private int poid;
	private double speed;
	private int id;
	
	public Animal() {
		this.nbAnimal++;
		this.setPoid();
	}
	public Animal(String nom,int age) {
		this.nbAnimal++;
		this.age=age;
		this.nom=nom;
		this.setPoid();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoid() {
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
	public void setPoid() {
		this.poid =(int) ( Math.random()*60+1);
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "animal:"+this.nom+" "+this.age+" "+this.poid;
	}
	public  String parle() {
		return "wwwww";
	}


}

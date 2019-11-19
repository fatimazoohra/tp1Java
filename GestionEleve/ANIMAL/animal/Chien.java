package animal;

public class Chien extends Animal{

	public Chien() {	
		super();
	}
	public Chien(String nom, int age,double speed) {
		super(nom,age);
		this.setSpeed(speed);
	}
	public String parle(){
		return " HAAW";
	}
	public void setPoid() {
		this.setPoid((int) ( Math.random()*80+1));
	}
	public String toString() {
		return "Chien:"+this. getNom()+" "+this.getAge()+" "+this. getPoid();
	}
}

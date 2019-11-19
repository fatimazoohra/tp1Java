package animal;

public class Chat extends Animal{

	public Chat() {	
		super();
	}
	public Chat(String nom, int age,double speed) {
		super(nom,age);
		this.setSpeed(speed);
	}
	public String parle(){
		return " Miaaaw";
	}
	public  void setPoid() {
		this.setPoid((int) ( Math.random()*80+1));
	}
	public String toString() {
		return "Chat:"+this. getNom()+" "+this.getAge()+" "+this. getPoid();
	}

}

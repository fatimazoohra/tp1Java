import animal.*;

public class TestAnimal {

	public TestAnimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("animal1", 12);
		Animal a2 = new Chat("chat", 13, 30);
		Animal a3 = new	Chien("chien", 20, 50);
	
		System.out.println(a1.parle());
		System.out.println(a2.parle());
		System.out.println(a3.parle());
		System.out.println("le nombre des animaux est "+Animal.nbAnimal);
	}

}

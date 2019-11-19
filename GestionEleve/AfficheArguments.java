package exercice1;

public class AfficheArguments {

	public AfficheArguments() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		if(args.length==0) 
			System.out.println("no args");
		else
			for(String s:args) System.out.println(s);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}

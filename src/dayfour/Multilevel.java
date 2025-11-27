package dayfour;

public class Multilevel extends types {
	public static void main(String[] args) {
		Multilevel ml=new Multilevel();
		ml.types();
		ml.Carniorals();
		ml.herbiorals();
	}
	
}
class animal{
	void types(){
		System.out.println("1.Carniorals.");
		System.out.println("2.herbiorals");
	}
}
class types extends animal{
	void Carniorals() {
		System.out.println("Lion,tiger,fox,dog");
	}
	void herbiorals() {
		System.out.println("cow,buffolo,ox,horse");
	}
}

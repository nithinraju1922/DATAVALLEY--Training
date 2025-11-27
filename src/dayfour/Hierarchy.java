package dayfour;

public class Hierarchy  {
	public static void main(String[] args) {
		Omnioras h=new Omnioras();
		h.type();
		//h.herbioras();
		h.types();
		
	}
	

}
class Animal{
	void type() {
		System.out.println("Herbioras");
		System.out.println("carnioras");
	}
}
class Herbioras extends Animal{
	void herbioras() {
		System.out.println("cow,buffolo,deer,ox");
	}
}
class Omnioras extends Animal{
	void types() {
		System.out.println("lion,tiger,dog,fox");
	}
	
}
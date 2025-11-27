package dayfour;

public class Methodoverride {
	public static void main(String[] args) {
		
	Methodoverride mr=new Methodoverride();
	
	B b=new B();
	System.out.println(b.add(10,20));
	System.out.println(b.add(20,10));
	A a=new A();
	System.out.println(a.add(20,10));
	}

}
class A{
	int add(int a,int b) {
		return a+b;
		
	}
}
class B extends A{
	int add(int a,int b) {
		return a-b;
	}
}


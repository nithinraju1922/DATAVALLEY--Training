package dayfour;

public class Methodoverride extends B {
	Methodoverride mr=new Methodoverride();
	//int a=10;
	//int b=20;
	A a=new A();
	System.out.println(a.add(10,5));
	B b=new B();
	System.out.println(b.add(10,20));
	

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

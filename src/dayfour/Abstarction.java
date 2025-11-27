package dayfour;

public class Abstarction{
	public static void main(String[] args) {
		Work w=new Work();
		System.out.println(w.add(10,50));
		System.out.println(w.sub(50,20));
	}
	

}
abstract class Operation{
	abstract int add(int a,int b);
	abstract int sub(int a,int b);
}
class Work extends Operation{
	int add(int a,int b){
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	
	
}

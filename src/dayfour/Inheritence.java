package dayfour;

class Student{
	void details() {
	int number=19;
	String name="nithin";
	int age=22;
	System.out.println(number);
	System.out.println(name);
	System.out.println(age);
	}
	
}
public class Inheritence extends Student{
	public static void main(String[] args) {
		String college="CITY";
		String Course="CSE";
		Inheritence s=new Inheritence();
		s.details();
		System.out.println(college);
	}
}


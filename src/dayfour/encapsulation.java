package dayfour;

public class encapsulation {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Nithin");
		p.setage(22);
		System.out.println(p.getName());
		System.out.println(p.getage());
		
		
	}

}

class Person{
	private String name;
	private int age;
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		if(age>0) {
			this.age=age;
			
		}else {
			System.out.println("Enter positive number");
		}
	}
	
}

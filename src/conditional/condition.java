package conditional;

public class condition {
	public static void main(String[]args) {
		int a=-20,b=-20,c=30;
		if(a>0&&b>0) {
			if(a==b) {
				System.out.println("both are equal!");
			}
			else if(a>b) {
				System.out.println(a+" is the biggest number");
			}
			else {
				System.out.println(b+" is the biggest number");
			}
		}
		else {
			System.out.println("Please enter positive numbers only");
		}
		
		
	}
	
}

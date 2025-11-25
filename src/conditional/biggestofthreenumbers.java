package conditional;

public class biggestofthreenumbers {
	public static void main(String[] args) {
		int a=10,b=40,c=30;
		if(a>0&&b>0&&c>0) {
			if(a>b) {
				System.out.println(a+"is the biggest number");
			}
			else if(a>c) {
				System.out.println(a+"is the biggest number");
			}
			else if(b>c) {
				System.out.println(b+"is the biggest number");
			}
			else {
				System.out.println(c+"is the biggest number");
			}
		}
		else {
			System.out.println("Enter positive number");
		}
	}
	

}
244396542483
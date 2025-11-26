package daythree;
import java.util.*;
public class swapping {
	//without temporary varibale
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>0&&b>0) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
		else {
			System.out.println("Enter valid input!");	
		}
		//with third variable
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	

}

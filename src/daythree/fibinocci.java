package daythree;
import java.util.*;

public class fibinocci {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
		int c;
		System.out.println("Enter no of terms:");
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			if(i==t) {
				System.out.println();
			}
		}
		
	}

}

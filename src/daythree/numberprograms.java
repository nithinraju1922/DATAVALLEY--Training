package daythree;
import java.util.*;

public class numberprograms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isprime(n));
		
		
	}
	public static boolean isprime(int n) {
		int count=0;
		if(n<=1) {
			return false;
		}
		else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
					
				}
			}
			if(count>2) {
				return false;
			}
		}
		return true;
	}

}


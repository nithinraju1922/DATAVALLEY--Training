package daythree;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(temp==sum) {
			System.out.println(sum+" is strong number");
		}
		else {
			System.out.println(sum+" is not strong number");
		}
	}

}

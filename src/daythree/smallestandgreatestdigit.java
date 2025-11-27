package daythree;
import java.util.*;
public class smallestandgreatestdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int smallest=9;
		int greatest=0;
		int temp=n;
		while(temp>0) {
			int digit=temp%10;
			if(digit<smallest) {
				smallest=digit;
			}
			if(digit>greatest) {
				greatest=digit;
			}
			temp/=10;
		}
		System.out.println("smallest digit is :"+smallest);
		System.out.println("greatest digit is :"+greatest);
	}

}

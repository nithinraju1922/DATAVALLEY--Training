package daythree;
import java.util.*;

public class Armstrong {
	int number(int num) {
		int result=0;
		int originalnum=num;
		int n=0;
		while(originalnum!=0) {
			 originalnum/=10;
			 ++n;
		}
		originalnum=num;
		while(originalnum!=0) {
			int digit=originalnum%10;
			result+=Math.pow(digit,n);
			originalnum/=10;
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Armstrong ar=new Armstrong();
		int number=ar.number(num);
		if(num==number) {
			System.out.println("It is an armstrong number!");
		}
		else {
			System.out.println("It is not an armstrong number!");
		}
		
	}
	

}

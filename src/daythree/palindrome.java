package daythree;
import java.util.*;

public class palindrome {
	int Reversenumber(int num) {
		int reversed=0;
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num/=10;
		}
		return reversed;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		int num=sc.nextInt();
		palindrome rs=new palindrome();
		int reversed =rs.Reversenumber(num);
		if(num==reversed) {
			System.out.println("it is palindrome!");
		}
		else {
			System.out.println("It is not palindrome!");
		}
	}

}

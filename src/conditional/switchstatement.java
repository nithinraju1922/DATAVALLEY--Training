package conditional;
import java.util.Scanner;
public class switchstatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Withdraw");
		System.out.println("2.Deposite");
		System.out.println("3.Check balance");
		System.out.println("4.Pin Generation");
		System.out.println("5.Bank statement");
		System.out.println("6.Cardless deposite");
		System.out.println("7.Exit");
		int choice=sc.nextInt();
		while(choice!=8) {
		switch(choice){
		case 1:
			withdraw();
			break;
		case 2:	
			  Deposite();
			  break;
		case 3:
			System.out.println("your balance is");
		}
		}
		
		
	}
	public static void withdraw() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your amount:");
		int amount=s.nextInt();
		System.out.println("Your amount is beeing transaction!");
		
	}
	public static void Deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposite:");
		int amount=sc.nextInt();
		if(amount>=10000) {
			System.out.println("your amount is deposited!");
		}
		else {
			System.out.println("Please deposite valid amount!");
		}
	}
//	public static void checkbalance
	
}

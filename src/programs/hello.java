package programs;
import java.util.*;

public class hello {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String Branch=sc.next();
		String Number=sc.next();
		Double marks=sc.nextDouble();
		//int age=sc.nextInt();
		System.out.println("My Details:");
		System.out.print(name+" "+Branch+" "+Number+" "+marks+" ");
		
	}

}

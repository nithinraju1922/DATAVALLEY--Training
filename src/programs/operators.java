package programs;
import java.util.*;
public class operators {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Operators in java:");
		System.out.println("Arithemetic Operators");
		System.out.println("Bit wise Operators");
		System.out.println("Conditional operators");
		System.out.println("Logical operators");
		System.out.println("Decrement or Increment operators");
		System.out.println("Combinational operators");
		System.out.println("Terninary operators");
		System.out.println("BITWISE OPERATOR:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println((a&b));
		System.out.println("OR:"+(a|b));
		System.out.println("XOR:"+(a^b));
		System.out.println("Not:"+(~a));
		System.out.println("left shift:"+(a>>b));
		System.out.println("right shift:"+(a<<b));
	}
	

}

package programs;
import java.util.Scanner;

public class inputdata {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your marks:");
		Double marks=sc.nextDouble();
		System.out.println("Enter your percentage:");
		double c=sc.nextDouble();
		System.out.println("Enter your job status:");
		Boolean b=sc.nextBoolean();
		System.out.println("Enter your college name:");
		String clg=sc.nextLine();
		System.out.println(name);
		System.out.println(marks);
		System.out.println(c+"%");
		System.out.println(b);
		System.out.println(clg);
		System.out.println(age);
	}

}

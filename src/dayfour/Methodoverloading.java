package dayfour;

import java.util.Scanner;

public class Methodoverloading {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Methodoverloading mo=new Methodoverloading();
		System.out.println(mo.add(a,b));
		System.out.println(mo.add(a,b,c));
		
		
	}
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int add(int a,int b,int c) {
		int d=a+b+c;
		return d;
	}

	


}

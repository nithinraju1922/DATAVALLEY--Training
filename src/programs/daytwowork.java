package programs;

public class daytwowork {
	public static void main(String[] args) {
		loop();
		whileloop();
		dowhileloop();
		nestedforloop();
		NLETTER();
				
		
	}
	public static void loop() {
		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public static void  whileloop () {
		int t=0;
		int sum=0;
		while(t<=10) {
			sum+=t;
			t++;
		}
		System.out.println(sum);
	}
	public static void dowhileloop() {
		int n=1;
		do {
			System.out.println("welcome");
			n++;
		}while(n<=5);
	}
	public static void nestedforloop() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	public static void NLETTER() {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==0) {
				System.out.print("*");
				}
				else if(j==n-1) {
					System.out.print("*");
				}
				else if(j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" " );
				}
			}
			System.out.println();
		}
	}
}

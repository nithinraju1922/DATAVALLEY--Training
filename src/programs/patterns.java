package programs;

public class patterns {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print("* ");
				
			}
			for(int k=i;k<=n;k++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		//to print triangle one by one
		int k=5;
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=k;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//to print square
		int m=5;
		for(int i=1;i<=m;i++) {
			 
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}

}

package Pattern;

public class Pattern {
	public static void main(String[] args) {
		int n=5;
		// Left Angle Triangle
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		// Decreasing Left Angle Triangle
		/*for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//Right Sided Triangle
		/*for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");// Two Spaces
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		// Decresing Right Sided Triangle
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");// Twospaces
			}
			for(int k=i;k<=n;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		//Hill Pattern
	/*	for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");//Two Spaces
			}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		// Reverse Hill Pattern
		for(int i=1;i<=n;i++) {
		int	number=1;
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k<n;k++) {
				System.out.print(number+" ");
				number++;
			}
			for(int l=i;l<=n;l++) {
				System.out.print(number+" ");
				number--;
			}
			System.out.println();
		}
	}

}

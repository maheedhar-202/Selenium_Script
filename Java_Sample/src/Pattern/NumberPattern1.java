package Pattern;

public class NumberPattern1 {
public static void main(String[] args) {
	int n=5, num=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(num+" ");
			num=num+1;
		}
		System.out.println();
//		for(int k=1;k<=n;k++) {
//			System.out.print();
//		}
		
	}
}
}

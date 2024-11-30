
public class Reverse_A_String {

	public static void main(String[] args) {

		/*//Approch-1- Length(),charAt()
		String s="Testing";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/

		/*	// Approch-2- Without Using String methods - By Converting String to Array
		String s="Welcome";
		String rev="";
		char[] c=s.toCharArray();
		for(int i=c.length()-1;i>=0;i--) {
			rev=rev+c[i];
		}
		System.out.println(rev);*/

		/*//Approch-3 Using String Buffer Class
		StringBuffer s= new StringBuffer("Welcome");
		System.out.println(s.reverse());*/
		
		StringBuilder s= new StringBuilder("Welcome");
		System.out.println(s.reverse());
	}

}

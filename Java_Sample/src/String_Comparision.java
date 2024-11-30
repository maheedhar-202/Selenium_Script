
public class String_Comparision {

	public static void main(String[] args) {
		// Case-1- == || Equals();
		
		String s1="Welocme";
		String s2="Welocme";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//Case2-==|| equals()
		String s3= new String("Welcome");
		String s4=new String("Welcome");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		//Case3
		String s5="abc";
		String s6=new String("abc");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		//Case4
		
		String ss="abc";
		String sss= new String("abc");
		String ssss=sss;
		
		System.out.println(ss==sss);
		System.out.println(ss.equals(sss));
		
		System.out.println(sss==ssss);
		System.out.println(sss.equals(ssss));
		
		System.out.println(ss==ssss);
		System.out.println(ss.equals(ssss));
		
		
		
		

	}

}

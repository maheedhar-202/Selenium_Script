
public class Plandrom {
public static void main(String[] args) {
	String text="MoM";
	String rev="";
	
	for(int i=text.length()-1;i>=0;i--) {
		rev=rev+text.charAt(i);
	}
	System.out.println(rev);
	if(text.equals(rev)) {
		System.out.println("Given String is A Plandrome");
	}else {
		System.out.println("Give String is Not A Plandrome");
		
	}
}
}

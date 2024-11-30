
public class StringVSStringBufferVSStringBuilder {
public static void main(String[] args) {
	String s="Welcome";
	s.concat("Testing");
	System.out.println(s);
	
	//String Buffer
	StringBuffer sb= new StringBuffer("Welcome");
	sb.append("To Testing");
	System.out.println("String buffer:"+sb);
	// String Builder
	
	StringBuilder sb1= new StringBuilder("Wlecome");
	sb1.append("Testing");
	System.out.println("String Builder"+sb1);
	
	
}
}

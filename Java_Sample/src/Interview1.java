
public class Interview1 {
	public static void main(String[] args) {
		String text="Test-1234.";
		String final_Value = text.substring(5, text.length()-1);
		System.out.println(final_Value);
		//fetch the characters count
		char[] a=text.toCharArray();
		int count=0;
		for(char b:a) {
			count++;
		}
		System.out.println(count);
		//Checking the capital and small letter in String
		for(char c:a) {
			//char c=text.charAt(i);
			if(c>='A'&& c<='Z') {
				System.out.println("Uppercase:"+c);
			}else if(c>='a' && c<='z') {
				System.out.println("Lower Case:"+c);
			}
		}	
	}

}

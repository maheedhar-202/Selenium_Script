
public class RemoveJunk_And_SpecialCharacters {
	public static void main(String[] args) {
		String input="Hello@# World!$%^&*()123";
//		String cleanedString = input.replaceAll("[^A-Za-z0-9]", "");
//		System.out.println("Original String : "+input);
//		System.out.println("Cleaned String : "+cleanedString);
		
		//Another way
		StringBuilder sb = new StringBuilder();
		for(char c :input.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				 sb.append(c);
			}
		}
		System.out.println("Original String: "+input);
		System.out.println("Cleaned String: "+sb);
		
	}
	
	
}

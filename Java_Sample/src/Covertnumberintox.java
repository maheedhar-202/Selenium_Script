
public class Covertnumberintox {

	//public String value="987654321";

		public static void main(String[] args) {
			int number=912345678;
			String numberString=String.valueOf(number);
			StringBuilder result= new StringBuilder();
			for(int i=0;i<numberString.length();i++) {
				char digit = numberString.charAt(i);
				if(Character.isDigit(digit)&&i>0&&i<numberString.length()-2) {
					result.append('*');
				}else {
					result.append(digit);
				}
			}
			String finalValue = result.toString();
			System.out.println(finalValue);
		}
//		public static void main(String[] args) {
//			int number = 912345678;
//			String numberString = String.valueOf(number);
//
//			StringBuilder result = new StringBuilder();
//
//			for (int i = 0; i < numberString.length(); i++) {
//				char digit = numberString.charAt(i);
//
//				if (Character.isDigit(digit) && i > 0 && i < numberString.length() - 1) {
//					// Replace digits in the middle with '*'
//					result.append('*');
//				} else {
//					// Keep digits at the beginning and end unchanged
//					result.append(digit);
//				}
//			}
//
//			String resultString = result.toString();
//			System.out.println("Original Number: " + number);
//			System.out.println("Number with Asterisks in the Middle: " + resultString);
//		}


}

package week3.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		System.out.println("Original value is: " +value);
		String reverse = "";
		//int len = value.length();
		//System.out.println(len);
		
		for (int i=value.length()-1; i>=0; i--)
		{
			char ch = value.charAt(i);
			reverse += ch;
		}
		System.out.println("Reversed value is: " +reverse);
		
		if(value.equals(reverse))
			System.out.println("Given word " +value+ " is Palindrome");
		else
			System.out.println("Given word " +value+ " is not a Palindrome");
	}
}
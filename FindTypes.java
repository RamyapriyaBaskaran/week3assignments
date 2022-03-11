package week3.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] ch = test.toCharArray();
		int letter = 0;
		int digit = 0;
		int space = 0;
		int other = 0;
		for (int i=0; i<ch.length; i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				digit++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Number of Letters: "+letter);
		System.out.println("Number of Digits: "+digit);
		System.out.println("Number of WhiteSpaces: "+space);
		System.out.println("Number of SpecialCharcaters: "+other);
	}
}

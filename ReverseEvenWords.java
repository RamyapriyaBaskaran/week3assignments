package week3.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] str = test.split(" ");
		
		for (int i=0; i<=str.length-1; i++)
		{
			String reverse="";
			if(i%2 != 0)
			{
				char[] ch = str[i].toCharArray();
				for (int j=ch.length-1; j>=0; j--)
				{
					char chrev = ch[j];
					reverse += chrev;
				}System.out.print(reverse +" ");
			}
			else 
				System.out.print(str[i] +" ");
		}
		

	}
}

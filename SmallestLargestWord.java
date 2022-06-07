import java.util.Scanner;

public class SmallestLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		String word="",small="",large="";
		
		String words[]=new String[100];
		int length=0;
		str=str+" ";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				word=word+ch;
			}
			else
			{
				words[length]=word;
				length++;
				word=" ";
			}
		}

		small=large=words[0];
		for(int i=0;i<length;i++)
		{
			if(small.length()>words[i].length())
				small=words[i];
			if(large.length()<words[i].length())
				large=words[i];
		}
		
		System.out.println("smallest="+small);
		System.out.println("largest="+large);
		
	}

}


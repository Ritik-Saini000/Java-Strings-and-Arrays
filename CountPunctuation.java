import java.util.Scanner;

public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("enter a String:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int counter[]=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||  str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
			{
				counter[str.charAt(i)]++;
			}
		}
		
		for(int i=0;i<256;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char)i+"-->"+counter[i]);
			}
		}
	}

}

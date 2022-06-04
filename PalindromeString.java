import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag=0;
		String str;
		System.out.println("enter string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("not palindrome");
		else
			System.out.println("palindrome");
			
	}

}

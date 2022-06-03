import java.util.Scanner;

public class Consonant_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int counter[]=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			if(ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				continue;
			}
			else
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

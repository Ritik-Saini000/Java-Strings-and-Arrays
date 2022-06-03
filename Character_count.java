import java.util.Scanner;

public class Character_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		int counter[]=new int[256];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			counter[str.charAt(i)]++;
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

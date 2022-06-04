import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		System.out.println("enter string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		int j=str.length()-1;
		
		for(int i=0;i<j;i++)
		{
			int a=str.charAt(i);
			int b=str.charAt(j);
			int temp=a;
			a=b;
			b=temp;
		}
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}

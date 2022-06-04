
public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaaabbbbcccc";
		int n=3;
		int temp=0;
		String equalStr[]=new String [n];
		if(str.length() % n!=0)
		{
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
			
		}
		else
		{
			for(int i=0;i<str.length();i=i+str.length()/n)
			{
				String part=str.substring(i,i+str.length()/n);
				equalStr[temp]=part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for(int i=0;i<equalStr.length;i++)
			{
				System.out.println(equalStr[i]);
			}
		}
	}

}

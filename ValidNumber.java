
public class ValidNumber {

	public static boolean isNumeric(String str)
	{
		if(str==null||str.equals(""))
		{
			return false;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch<'0' || ch>'9')
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="e";
		if(isNumeric(str)==true)
		System.out.println("Valid number");
		else
			System.out.println("Invalid number");
	}

}


public class changeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Ritik Saini";
		StringBuffer newStr=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
				newStr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			else if(Character.isUpperCase(str.charAt(i)))
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
		System.out.println(newStr);
		
	}

}

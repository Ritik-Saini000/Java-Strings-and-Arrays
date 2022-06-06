
public class CheckStringContentIgnoringCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="My Name Is Ritik";
		String str2="my name is ritik";
		
		System.out.println("ckecking with case:"+str1.equals(str2));
		System.out.println("checking without case:"+str1.equalsIgnoreCase(str2));
	}

}

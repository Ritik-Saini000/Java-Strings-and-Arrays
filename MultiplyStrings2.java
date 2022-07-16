
import java.math.*;
public class MultiplyStrings2 {
    public static String multiply(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        n1=n1.multiply(n2);
        return n1.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1="4";
		String num2="6";
		System.out.println(multiply(num1,num2));
	}

}

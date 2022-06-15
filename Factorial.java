import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=0,fact=1;
		System.out.println("Enter number:");
		num=sc.nextInt();
		for(int i=num;i>=1;i--)
			fact=fact*i;
		
		System.out.println("Factorial:"+fact);
	}

}


//int i=1;
//while(i<=num)
//{
//	fact=fact*i;
//	i++;
//}
import java.util.Scanner;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int arr[]=new int[5];
		System.out.println("Enter array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int n=0;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					continue;
				}
				else
				{
					temp=1;
					n=arr[i];
				}
			}
		}
		if(temp==1)
			System.out.print(n+" ");
		else
			System.out.println("0");
		
	}

}

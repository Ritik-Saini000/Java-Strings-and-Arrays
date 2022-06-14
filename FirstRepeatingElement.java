import java.util.Scanner;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int arr[]=new int[7];
		System.out.println("Enter array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					temp=1;
					i=arr.length;
					j=arr.length;
				}
			}
		}
		if(temp==0)
			System.out.println("No repeating intger found");
	}

}

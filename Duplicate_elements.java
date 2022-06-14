import java.util.Scanner;

public class Duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Duplicate elements are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					
				}
			}
		}
		
	}

}

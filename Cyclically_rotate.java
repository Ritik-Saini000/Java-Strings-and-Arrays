import java.util.Scanner;

public class Cyclically_rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n = 0;
		System.out.println("Enter length of array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int temp=arr[n-1];  //storing last element
			arr[n-1]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Array after cylindrical rotation");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}

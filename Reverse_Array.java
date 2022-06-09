import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		System.out.println("enter array:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Reverse Array:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

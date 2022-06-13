import java.util.Scanner;

public class Occurance_of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int [5];
		System.out.println("Enter array:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter integer:");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				count++;
		}
		
		System.out.println("Frequency of "+num+" is "+count);
				
	}

}

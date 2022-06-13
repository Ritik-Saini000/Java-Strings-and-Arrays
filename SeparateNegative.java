import java.util.Scanner;

public class SeparateNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int [8];
		System.out.println("Enter array:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int i=-1;
		int pivot=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
			
		
	}

}

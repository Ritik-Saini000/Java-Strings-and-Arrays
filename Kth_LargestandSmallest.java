import java.util.Scanner;

public class Kth_LargestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int [10];
		System.out.println("Enter array:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter Kth element:");
		int k=sc.nextInt();
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+" largest element is "+arr[i]);
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println("n"+k+" smallest element is "+arr[i]);
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}

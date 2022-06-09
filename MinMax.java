import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		System.out.println("enter array:");
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
		
	}

}

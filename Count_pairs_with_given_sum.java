import java.util.Scanner;

public class Count_pairs_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int arr[]=new int[5];
		System.out.println("Enter array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter sum value:");
		int k=sc.nextInt();
		
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
					ans++;
			}
		}
		
		System.out.println("no. of pairs are:"+ans);
		
	}

}

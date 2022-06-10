import java.util.Scanner;

public class Binary_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		System.out.println("Enter array:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int start=0,mid,end=4,num,flag=0;
		System.out.println("Enter number you want to search:");
		num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			mid=(start+end)/2;
			if(num<arr[mid])
				end=mid-1;
			else if(num>arr[mid])
				start=mid+1;
			else
				flag=1;
		}
		
		if(flag==1)
			System.out.println("element found");
		else
			System.out.println("not found");
	}

}

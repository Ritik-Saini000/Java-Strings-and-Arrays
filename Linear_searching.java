import java.util.Scanner;

public class Linear_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		System.out.println("enter array:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("enter number you want to search:");
		int num=sc.nextInt();
		int flag=0;
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				flag=1;
				pos=i;
			}
		}
		
		if(flag==1)
			System.out.println("Element found at pos:"+pos);
		else
			System.out.println("Not found");
	}

}

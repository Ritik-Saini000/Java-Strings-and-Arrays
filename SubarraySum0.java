
public class SubarraySum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,2,-3,1,6};
		int flag=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum==0) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

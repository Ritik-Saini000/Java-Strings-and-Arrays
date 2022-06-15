
public class Kadane_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,-2,5};
		int maxSum=arr[0];
		int currsum=0;
		for(int i=0;i<arr.length;i++)
		{
			currsum=Math.max(arr[i],currsum+arr[i]);
			maxSum=Math.max(currsum,maxSum);
					
		}
		System.out.println(maxSum);
	}

}

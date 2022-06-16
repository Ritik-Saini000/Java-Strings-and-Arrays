import java.util.Arrays;

public class Min_ele_sorted_rotated_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,2,6,1,4,3};
		int n=arr.length;
		Arrays.sort(arr);
		
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println("Minimum element "+arr[n-1]);
		System.out.println("Maximum element "+arr[0]);
	}

}

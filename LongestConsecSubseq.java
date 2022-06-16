import java.util.Arrays;

public class LongestConsecSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,6,1,9,4,5,3};
		Arrays.sort(arr);
		int counter=1,max=1;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1==arr[i+1])
			{
				counter++;
				if(counter>max)
					max=counter;
			}
			else if(arr[i]==arr[i+1])
				continue;
			else
				counter=1;
		}
		
		System.out.println(max);
		
		
	}

}

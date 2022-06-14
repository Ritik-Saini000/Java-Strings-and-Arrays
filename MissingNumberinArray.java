
public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<arr.length;i++)
			sum1+=arr[i];
		System.out.println("Sum of elements in array:"+sum1);
		
		int sum2=0;
		for(int i=1;i<6;i++)
			sum2+=i;
		System.out.println("Sum of range of elements in array:"+sum2);
		System.out.println("Missing number is:"+(sum2-sum1));
	}

}

//int arr[]= {1,2,3,5,6,7};
//int sum1=0,sum2=0;
//for(int i=0;i<arr.length;i++)
//	sum1+=arr[i];
//for(int i=1;i<arr.length+2;i++)
//	sum2+=i;
//System.out.println("Missing number is:"+(sum2-sum1));
package arrays;

public class FindSubArrayOfGivenSum {

	static int start=0;
	static int end =0;
	public static void main(String[] args) {
		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20}; 
		int sum = 15; 
		int n = arr.length; 
		findSubArrayOfGivenSum(arr, n, sum); 
		for(int i=start;i<end;i++)
			System.out.print(arr[i]+" ");

	}

	private static void findSubArrayOfGivenSum(int[] arr, int n, int sum) {
		
		 int currSum=0;
		 for(int i=0;i<n;i++) {
			 
			 while(currSum>sum && start<i-1) {
				 currSum= currSum-arr[start];
				 start++;
			 }
			 if(currSum==sum) {
				 System.out.println("Found sum");
				 end=i;
				 return;
			 }
			 currSum+=arr[i];
		 }
			 
		
	}

}

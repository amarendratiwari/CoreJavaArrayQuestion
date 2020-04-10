package arrays;

public class MaxSumOfSubArrayOfSizeK {

	public static void main(String[] args) {

		int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20}; 
		int k = 4; 
		int n = arr.length; 
		System.out.println(maxSum(arr, n, k)); 
	}

	private static int maxSum(int[] arr, int n, int k) {
		
		int sum=0;
		int currSum=0;
		
		for(int i =0;i<k;i++)
			sum+=arr[i];
		currSum = sum;
		for(int i=k;i<n;i++) {
			sum+= arr[i]-arr[i-k];
			currSum = Math.max(currSum, sum);
		}
		return currSum;
	}

}

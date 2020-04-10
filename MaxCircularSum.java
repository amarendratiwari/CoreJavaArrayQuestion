package arrays;

public class MaxCircularSum {

	public static void main(String[] args) {
		int [] arr = {-1, 40, -14, 7, 6, 5, -4, -1};
		int maxsum = maxCircularSum(arr,arr.length);
		System.out.println(maxsum);
	}

	private static int maxCircularSum(int[] arr, int length) {
		 int maxSumInArray = maxSum(arr,length);
		 if(maxSumInArray<0)
			 return maxSumInArray;
		 int sum=0;
		 for(int i=0;i<length;i++) {
			 sum=sum+arr[i];
			 arr[i]= -arr[i];
		 }
		 int maxCircular = sum + maxSum(arr,length);
		 
		return Math.max(maxCircular, maxSumInArray);
	}

	private static int maxSum(int[] arr, int length) {
		
		int max=arr[0];
		int maxtillNow=arr[0];
		for(int i=1;i<length;i++) {
			maxtillNow = Math.max(arr[i], arr[i]+maxtillNow);
			max= Math.max(max, maxtillNow);
		}
		return max;
	}

}

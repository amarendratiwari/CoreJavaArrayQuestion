package arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		int total_sum =arr[0];
		int current_sum = arr[0];
		
			
		for(int i=1;i<arr.length;i++) {
			
			current_sum = Math.max(arr[i], current_sum+arr[i]);
				
			total_sum = Math.max(current_sum, total_sum);
			System.out.println(current_sum+" "+total_sum);
		}
		System.out.println("Maximum sub array sum is "+total_sum);

	}

}

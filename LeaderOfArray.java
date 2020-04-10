package arrays;

public class LeaderOfArray {

	public static void main(String[] args) {
		
		int arr[]= {10,4,5,6,11,12,3,4,1,2};
		//int arr[]= {1,2,3};
		int n=arr.length;
		int leader= arr[n-1];
		System.out.print("Leaders are "+leader);
		//boolean isLeader =false;
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>leader) {
				leader =arr[i];
				System.out.print(" "+leader);
			}
			
		}

	}

}

package arrays;

public class MaximumContinuesOddEvenSequence {

	public static void main(String[] args) {
		int arr[] = {5,10,20,6,3,8};
		int count =1;
		int maxCount=1;
		for(int i=1;i<arr.length;i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) ||
					(arr[i]%2!=0 && arr[i-1]%2==0)) {
				count++;
				maxCount = Math.max(maxCount, count);
			}else {
				count =1;
			}
		}
		
		System.out.println(maxCount);
		

	}

}

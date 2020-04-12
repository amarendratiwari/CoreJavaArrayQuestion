package arrays;

//It will return the sum of array element found in given range,it includes start and end index also
public class PrefixSum {

	public static void main(String[] args) {	
		
		int arr[]= {2,8,3,4,7,9,2};
		int prefixSum[] = new int [arr.length];
		prefixSum[0] = arr[0];
		for(int i =1;i<arr.length;i++) {
			prefixSum[i] = prefixSum[i-1] + arr[i];
			System.out.print(prefixSum[i]+" ");
		}
		System.out.println(getSum(0,2,prefixSum));
		System.out.println(getSum(1,3,prefixSum));
		System.out.println(getSum(3,6,prefixSum));
	}

	private static int getSum(int i, int j, int[] prefixSum) {
		
		if(i==0) {
			return prefixSum[j];
		}else {
			return prefixSum[j]- prefixSum[i-1];
		}
				
	}

}

package arrays;

public class MaximumOccuredIntegerInNrangeArray {

	public static void main(String[] args) {
		int[] L = { 1, 4, 9, 13, 21 }; //start of number 
        int[] R = { 15, 8, 12, 20, 30 }; //end of number
        int n = L.length; 
        System.out.println(maximumOccurredElement(L, R, n)); 

	}

	/*Algo
	 * Define one array and initialize with 0
	 * Add 1 to Li index of array and subtract 1 to Ri array( i.e. array[r[i]+1] = array[r[i]+1] -1;
	 * Do the prefix sum and return the lowest index
	 */
	
	private static int maximumOccurredElement(int[] L, int[] R, int n) {
		
	
		
		int maxSizeOfArray= 100000;
		int maxArray[] = new int[maxSizeOfArray];
		int max=Integer.MIN_VALUE; int index=0;
		for(int i = 0;i<n;i++) {
			maxArray[L[i]]+=1;
			maxArray[R[i]+1]-=1;
			if(max<R[i]) {
				max= R[i];
				//System.out.println("Max>>"+max);
			}
		}
		int maxSum = maxArray[0];
		for(int i = 1; i < max+1; i++) {
			maxArray[i] += maxArray[i-1];
			if(maxSum < maxArray[i]) {
				maxSum = maxArray[i];
				index = i;
				//System.out.println(i);
			}
		}
		
		return index;
	}

}

package arrays;

public class RemoveDuplicatesInSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,20,20,30,30,40,40,40,40};
		int size = removeDuplicates(arr,arr.length);
		for(int a:arr)
			System.out.println(a);

	}

	private static int removeDuplicates(int[] arr, int size) {
		int result= 1;
		
		for(int i=1;i<size;i++) {
			if(arr[i]!=arr[result-1]) {
				arr[result]=arr[i];
				result++;
			}
		}
		return result;
	}

}

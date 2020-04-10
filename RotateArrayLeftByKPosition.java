package arrays;

public class RotateArrayLeftByKPosition {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int k= 3;
		rotateArrayLeftByKPosition(arr,k);
		for(int a:arr)
			System.out.print(a+" ");

	}

	private static void rotateArrayLeftByKPosition(int[] arr, int k) {

		int n= arr.length;
		reverseArray(arr,0,k-1);
		reverseArray(arr,k,n-1);
		reverseArray(arr,0,n-1);
	}

	private static void reverseArray(int[] arr, int i, int k) {
		
		int temp=0;
		while(i<k) {
			temp= arr[i];
			arr[i]=arr[k];
			arr[k]=temp;	
			i++;
			k--;
		}
	}

}

package arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4};
		int count =1;
		int currElem= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(currElem == arr[i]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				currElem = arr[i];
				count =1;
			}
		}
		//currElem is a number, maximum number of times found in array 
		//Need to check how many count it appears in below flow
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(currElem == arr[i])
				count++;
		}
		if(count>(arr.length)/2) {
			System.out.println("Fount the majority element "+currElem);
		}else {
			System.out.println("No majority element");
		}

	}

}

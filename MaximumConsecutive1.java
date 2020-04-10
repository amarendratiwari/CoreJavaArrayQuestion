package arrays;

public class MaximumConsecutive1 {

	public static void main(String[] args) {
		int arr[] = {0,1,2,1,1,1,1,0,3,1,1,1};
		int maxCount =0;
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				if(count>maxCount)
					maxCount = count;
			}else {
				count=0;
			}
		}
		System.out.println(maxCount);

	}

}

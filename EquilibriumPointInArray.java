package arrays;

//it will give equilibrium point of array- that means sum of all left elements will be equal to sum of all right elements
public class EquilibriumPointInArray {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		int sum=0;
		for(int i =0; i<arr.length; i++)
			sum+= arr[i];
		int leftSum=0;
		boolean isEquilibrium= false;
		for(int i = 0;i<arr.length;i++) {
			if(leftSum == sum-arr[i]) {
				isEquilibrium = true;
				System.out.println("Equilibrium index is +"+i+" and number is "+arr[i]);
			}{
				leftSum+=arr[i];
				sum= sum - arr[i];
			}
		}
		if(!isEquilibrium)
			System.out.println("Equilibrium did not find in array");
		
	}

}

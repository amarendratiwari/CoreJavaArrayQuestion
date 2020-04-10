package arrays;

public class TrappingrainWater {

	public static void main(String[] args) {

		int buildingBlocks[]= {3,4,1,0,9};
		int leftMax[]=new int [buildingBlocks.length]; 
		int rightMax[]=new int [buildingBlocks.length];
		leftMax[0]=buildingBlocks[0];
		rightMax[buildingBlocks.length-1]= buildingBlocks[buildingBlocks.length-1];
		
		for(int i=1;i<buildingBlocks.length;i++) {
			leftMax[i]= Math.max(leftMax[i-1], buildingBlocks[i]);
				
		}
		for(int i= buildingBlocks.length-2;i>=0;i--) {
			rightMax[i]= Math.max(rightMax[i+1], buildingBlocks[i]);
		}
		int maxTrappingWater = 0;
		for(int i=0;i<buildingBlocks.length;i++) {
			maxTrappingWater =maxTrappingWater+Math.min(leftMax[i], rightMax[i])-buildingBlocks[i];
		}
		System.out.println(maxTrappingWater);
	}

}

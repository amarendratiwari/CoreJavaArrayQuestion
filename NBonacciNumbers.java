package arrays;

public class NBonacciNumbers {

	public static void main(String[] args) {
		int n=3;//like 3 bonaki 
		int m=8;//print number till m count
		if(m<n || n<3) {
			System.out.println("Need to throw exception");
		}
		int a[]= new int[m];
		for(int i =0;i<m;i++)
			a[i]=0;
		a[n-1]=1;
		a[n]=1;
		for(int i=n+1;i<m;i++) {
			a[i]= a[i-1]+a[i-1]-a[i-n-1];
		}
		for(int i =0;i<m;i++)
			System.out.print(a[i]+" ");

	}

}

import java.util.Scanner;
class LargestAmongNDigit{
	void largestNum(int[] x){
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	static int maxNum(int[] b){
		int max=0;
		for(int i=0;i<b.length;i++){
			if(b[i]>max)
				max=b[i];
		}
		return max;
	}
	public static void main(String[] args)	{
		Scanner scn=new Scanner(System.in);
		LargestAmongNDigit lgt=new LargestAmongNDigit();
		System.out.print("Enter how many numbers: ");
		int n=scn.nextInt();
		int[] a=new int[n];		
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" number: ");
			a[i]=scn.nextInt();
		}
		lgt.largestNum(a);
		int max=maxNum(a);
		System.out.println("The Maximum number is "+max);
	}
}

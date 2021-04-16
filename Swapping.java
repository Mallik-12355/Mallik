import java.util.Scanner;
class Swapping{
	void swap(int x, int y){
		System.out.print("Before Swapping the numbers are: "+x+" and "+y);
		System.out.println();
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping the numbers are: "+x+" and "+y);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Swapping sw=new Swapping();
		System.out.print("Enter two numbers: ");
		sw.swap(scn.nextInt(),scn.nextInt());
	}
}

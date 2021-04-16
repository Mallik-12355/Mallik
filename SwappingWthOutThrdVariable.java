import java.util.Scanner;
class SwappingWthOutThrdVariable{
	void swap(int x, int y){
		System.out.println("Before Swapping the Numbers are: "+x+" and "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping the Numbers are: "+x+" and "+y);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		SwappingWthOutThrdVariable sw=new SwappingWthOutThrdVariable();
		System.out.print("Enter two numbers: ");
		sw.swap(scn.nextInt(), scn.nextInt());
	}
}

import java.util.Scanner;
class SwappingWthoutThrdVariableWthXor{
	public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x=scn.nextInt();
		System.out.print("Enter second number: ");
		int y=scn.nextInt();
		System.out.println("Before Swapping the numbers: "+x+" and "+y);
		x=x^y;
		y=y^x;
		x=y^x;
		System.out.println("After Swapping the numbers: "+x+" and "+y);
	}
}

import java.util.Scanner;
class SwappingWthoutThrdVariableWthMulDiv{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x=scn.nextInt();
		System.out.print("Enter second number: ");
		int y=scn.nextInt();
		System.out.println("Before Swapping the two numbers is: "+x+" and "+y);
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("After Swapping the two numbers is: "+x+" and "+y);
	}
}

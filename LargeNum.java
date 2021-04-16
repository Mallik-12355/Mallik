import java.util.Scanner;
class LargeNum{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int largeNum=0;
		System.out.print("Enter three numbers: ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		largeNum=(a>b&&a>c)?a:(b>a&&b>c?b:c);
		System.out.println("The Largest Number is: "+largeNum);
	}
}

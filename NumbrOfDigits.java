import java.util.Scanner;
class NumbrOfDigits{
	static void numbrOfDigits(int x){
		int count=0;
		while(x>0){
			x=x/10;
			count++;
		}
		System.out.println("Number of Digits are "+count);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scn.nextInt();
		numbrOfDigits(num);
	}
}

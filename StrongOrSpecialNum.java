import java.util.Scanner;
class StrongOrSpecialNum{
	static void specialNum(int inputNum){
		int lastDigit,temp,sum=0;
		temp=inputNum;
		while(temp>0){
			lastDigit=temp%10;
			sum=sum+factorial(lastDigit);
			temp=temp/10;
		}
		if(sum==inputNum){
			System.out.println(inputNum+" is a Special Number");
		}
		else{
			System.out.println(inputNum+" is not a Special Number");
		}
	}
	static int factorial(int a){
		if(a==0){
			return 1;
		}
		else{
			return a*factorial(a-1);
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scn.nextInt();
		specialNum(num);
	}
}

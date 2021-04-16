import java.util.Scanner;
class LcmOfTwoNumbrs{
	static void lcm(int n1,int n2){
		if(n1==0||n2==0){
			System.out.println("LCM is Zero:");
			System.exit(0);
		}
		int lcm1=(n1>n2)?n1:n2;
		while(true){
			if(lcm1%n1==0&&lcm1%n2==0){
				System.out.println("The LCM is: "+lcm1);
				break;
			}
			lcm1++;
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		lcm(num1,num2);
	}
}

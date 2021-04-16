import java.util.Scanner;
class HcfOfTwoNum{
	static void hcf(int n1,int n2){
		int hcf1=(n1<n2)?n1:n2;
		while(true){
			if(n1%hcf1==0&&n2%hcf1==0){
				System.out.println("The HCF is "+hcf1);
				break;
			}
			hcf1--;
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		hcf(num1,num2);
	}
}

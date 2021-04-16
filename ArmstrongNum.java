import java.util.Scanner;
class ArmstrongNum{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scn.nextInt();
		int r,a,b=0,temp=n;
		while(n!=0){
			r=n%10;
			a=r*r*r;
			n=n/10;
			b=b+a;
		}
		if(temp==b){
			System.out.println(temp+" is an armstrong number");
		}
		else{
			System.out.println(temp+" is not an armstrong number");
		}
		
	}
}

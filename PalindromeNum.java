import java.util.Scanner;
class PalindromeNum{
	void palindromeNum(int x){
		int r,sum=0,temp;
		temp=x;
		while(x>0){
			r=x%10;
			sum=(sum*10)+r;
			x=x/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a Palindrome Number");
		else
			System.out.println(temp+" is not a Palindrome Number");
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		PalindromeNum pl=new PalindromeNum();
		System.out.println("Enter a number: ");
		pl.palindromeNum(scn.nextInt());
	}
}

import java.util.Scanner;
class NumbrOfEvnOddDigits{
	static void evnOddDigits(int n){
		int even=0,odd=0,lastDigit,temp;
		temp=n;
		while(temp>0){
			lastDigit=temp%10;
			if(lastDigit%2==0){
				even++;
			}
			else{
				odd++;
			}
			temp=temp/10;
		}
		System.out.println("In "+n+" there are "+even+" even digits are present");
		System.out.println("In "+n+" there are "+odd+" odd digits are present");
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scn.nextInt();
		evnOddDigits(num);
	}
}

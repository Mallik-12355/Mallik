import java.util.Scanner;
class PrimeLogic {
	void isPrime(int x) {
		int count=0;
		if(x>1){
			for(int i=1;i<=x;i++) {
				if(x%i==0)
					count++;
			}
		if(count==2)
			System.out.println(x+" is a prime number");
		else
			System.out.println(x+" is not a prime number");
	}
		else{
			System.out.println(x+" is not a prime number");
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		PrimeLogic p1=new PrimeLogic();
		System.out.print("Enter a number: ");
		p1.isPrime(scn.nextInt());
	}
}

import java.util.Scanner;
class Fibonacci{
	void fibonacci(int x){
		int fno=0,sno=1,res;
		int count=0;
		while(true){
			res=fno+sno;
			count++;
			if(res>=x)
				break;
			fno=sno;
			sno=res;
			System.out.println("The fibonacci series of ["+count+"] is: "+res);
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Fibonacci fn=new Fibonacci();
		System.out.print("Enter a number: ");
		fn.fibonacci(scn.nextInt());
	}
}

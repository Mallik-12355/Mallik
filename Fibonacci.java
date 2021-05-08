import java.util.Scanner;
class Fibonacci{
	void fibonacci(int x){
		int fno=0,sno=1,res;
		System.out.println(fno);
		System.out.println(sno);
		while(true){
			res=fno+sno;
			if(res>=x)
				break;
			fno=sno;
			sno=res;
			System.out.println(res);
		}
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Fibonacci fn=new Fibonacci();
		System.out.print("Enter a number: ");
		fn.fibonacci(scn.nextInt());
	}
}

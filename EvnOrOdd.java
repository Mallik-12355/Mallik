import java.util.Scanner;
class EvnOrOdd{
	void evnOdd(int x){
			if(x%2==0){
				System.out.println(x+" is an even number");
				}
			else{
				System.out.println(x+" is an odd number");
			}
		}

		
/*		void boolean evnOdd1(int x){
			if(x%2==0)
				return (x%2==0);
			else
				return false;
		}
*/	
	
	public static void main(String[] args){
		
		Scanner scn=new Scanner(System.in);
		EvnOrOdd evnodd=new EvnOrOdd();
		System.out.print("Enter a number: ");
		evnodd.evnOdd(scn.nextInt());
		//evnodd.evnOdd1(scn.nextInt());
//		boolean evnOdd2=evnOdd1(scn.nextInt());

/*		int x=scn.nextInt();
		if(x%2==0){
			System.out.println(x+" is an even number");
		}
		else{
			System.out.println(x+" is an odd number");
		}
*/
	}
}

import java.util.*;
class Armstrong{
	public static void main(String[] args) {
		Scanner scr=new Scanner (System.in);
		int i,sum=0,r,count=0,m;
		System.out.print("enter your number : ");
		int n=scr.nextInt();
		int temp1=n;
		int temp2=n;
		while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		while(n>0){
			m=1;
			r=n%10;
			for(i=1; i<=count; i++){
				m=m*r;
			}
			sum=sum+m;
			n=n/10;
		}
		if(temp2==sum){
		System.out.println(temp2+" is Armstrong");}
		else{
		System.out.println(temp2+" is not Armstrong");
		}
	}
}
import java.util.Scanner;
class MatrixPrnting{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int rows,cols;
		System.out.print("Enter number of rows: ");
		rows=scn.nextInt();
		System.out.print("Enter number of columns: ");
		cols=scn.nextInt();
		int[][] ia=new int[rows][cols];
		System.out.println("Enter values of the matrix: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				ia[i][j]=scn.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(ia[i][j]+" ");
			}
			System.out.println();
		}
	}
}

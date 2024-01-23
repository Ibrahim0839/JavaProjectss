package Jan09;

import java.util.Scanner;

public class diagonalmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Scanner sc=new Scanner(System.in);
//		System.out.println("How Many elements you want");
//		int size=sc.nextInt();
		
		int a[][]=new int [3][3];
		int i,j;
		int sum=0;
		System.out.println("Enter the Data");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(j==i)
					sum=sum+a[i][j];
			}
		}
		System.out.println("The sum of Diagonal is"+sum);
	

	}

}

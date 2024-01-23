package Jan09;

import java.util.Scanner;

public class MultiDimensionalArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("How Many elements you want");
//		int size=sc.nextInt();
		
		int a[][]=new int [3][3];
		int i,j;
		System.out.println("Enter the Data");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print the Matrix");
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}


	}

}

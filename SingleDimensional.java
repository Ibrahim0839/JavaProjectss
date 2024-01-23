package Jan09;

import java.util.*;
public class SingleDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many elements you want");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the Data");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<size;j++)
		{
			System.out.println(a[j]);
		}

	}

}

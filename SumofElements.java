package Jan09;

import java.util.Scanner;

public class SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many elements you want");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter the Data");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The Sum of Element is"+sum);
	}

}

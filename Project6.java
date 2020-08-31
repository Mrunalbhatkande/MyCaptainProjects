package Project6;

import java.util.Scanner;

public class Project6 {
	public static int fibo(int a) {
		if(a==1)
			return 0;
		if(a==2)
			return 1;
		return fibo(a-1)+fibo(a-2);
			
		
	}

	public static void main(String[] args) {
		System.out.println("Enter number of terms of FIBONACCHI SEIES :- ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		fibo(n);
		for(int i=1;i<=n;i++)
		 System.out.println(fibo(i)+" ");
	}

}

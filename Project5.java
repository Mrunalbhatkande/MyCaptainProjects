package Project5;

import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {
		System.out.println("Enter a number :- ");
		Scanner sc=new Scanner(System.in);
		int c=1;
		int a =sc.nextInt();
		for(int i=2;i<a-1;i++) {
			if(a%i!=0) {}
			else 
				c=0;
		}
		
		if(c==0)
			System.out.println(a+" is not a prime number");
		else
			System.out.println(a+" is a prime number");
	}

}

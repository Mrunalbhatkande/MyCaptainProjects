package Project2;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) 
	{
		System.out.println("USING SWITCH CASE");
		System.out.println("Pick one:\n 1. Good Morning\n2. Good Afternoon\n3. Good Evening ");
		Scanner sc = new Scanner(System.in);
		int choice;
		choice=sc.nextInt();
		switch(choice)
		{
			case 1 : System.out.println("GOOD MORNING");
					break;
			case 2 : System.out.println("GOOD AFTERNOON");
					break;
			case 3 : System.out.println("GOOD EVENING");
					break;
			default : System.out.println("select a valid option");
					break;
		}
		System.out.println("USING IF ELSE");
		System.out.println("Pick one:\n 1. Good Morning\n2. Good Afternoon\n3. Good Evening ");
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println("GOOD MORNING");
		}
		else if (choice==2) {
			System.out.println("GOOD AFTERNOON");
		}
		else if(choice==3) {
			System.out.println("GOOD EVENING");
		}	
		else {
			System.out.println("select a valid option");
		}
		
	}

}

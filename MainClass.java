package com.cg.calculate.client;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.cg.calculate.service.*;


public class MainClass {
	public static void main(String args[]) {


			Scanner s = new Scanner(System.in);
			try {
			System.out.println("Enter 1st number");
			int num1 = s.nextInt();
			System.out.println("Enter 2nd number");
			int num2 = s.nextInt();
			System.out.println("Ans:"+num1/num2);
		}
	catch(InputMismatchException c)
			{
		System.err.println("Enter numbers only");		
	}
			catch(ArithmeticException c)
			{
				System.err.println(c.getMessage()+" "+"Enter number other then 0");
			}
				
		System.out.println("code after catch block"); 
	}

}

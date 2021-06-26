package com.Employee;

import java.util.Random;

public class Employee
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Employee Wage Computation Program");
		Random ran=new Random();
		int ran1 = ran.nextInt(2);
		if (ran1 == 1)
			System.out.println("Employee is Present");
		else

				System.out.println("Employee is Absent");
	}

}

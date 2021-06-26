package com.Employee;

import java.util.Random;

public class Employee
{
	public static void main(String[] args)
	{	
		int Fullday=8;
		int Wageperhour=20;
		int dailywage;
		int parttime=4;
		
		System.out.println("Welcome to the Employee Wage Computation Program");
		Random ran=new Random();
		int ran1 = ran.nextInt(2);
		if (ran1 == 1)
		{
			System.out.println("Employee is Present");
			dailywage=Fullday*Wageperhour;
			System.out.println("Employee Wage is" +dailywage);
		}
		else if (ran1 == 2)
		{
			System.out.println("Employee is parttime present");
			dailywage=parttime*Wageperhour;
			System.out.println("Employee wage is" +dailywage);
		}
		else
			System.out.println("Employee is Absent");
	 }

}

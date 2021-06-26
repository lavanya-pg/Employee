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
		int num_of_workingdays=20;
		
		System.out.println("Welcome to the Employee Wage Computation Program");
		for (int day = 0; day < num_of_workingdays; day++) 
		{		
		Random ran=new Random();
		int ran1 = ran.nextInt(3);
		
		switch (ran1)
		{
		case 1:
		dailywage=Fullday*Wageperhour;
		System.out.println("Employee is present");
		System.out.println("Employee wage is" +dailywage);
		break;
		case 2:
		dailywage=parttime*Wageperhour;
		System.out.println("Employee is patrtime present");
		System.out.println("Employee wage is" +dailywage);
		break;
		default:
			System.out.println("Employee is absent");
		}
		}
	}
}

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
		int maximum_hrs_in_month=100;
		int emphrs=0,totalemphrs=0,totalworkingdays=0;
		
		System.out.println("Welcome to the Employee Wage Computation Program");
		while (totalemphrs<=maximum_hrs_in_month&&totalworkingdays<num_of_workingdays)
		{
		totalworkingdays++;
		
		Random ran=new Random();
		int ran1 = ran.nextInt(3);
		
		switch (ran1)
		{
		case 1:
		emphrs=8;
		break;
		case 2:
		emphrs=4;
		break;
		default:
		emphrs=0;
		}
		totalemphrs=emphrs;
		System.out.println("day#:"+totalworkingdays + "Emp hr" +emphrs);
		}
		int totalempwage =totalemphrs*Wageperhour;
		System.out.println("Total Emp wage: " +totalempwage);
	}
}

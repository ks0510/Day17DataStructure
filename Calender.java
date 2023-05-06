/*
 * This java program generate calender for a month.
 */
package com.linkedlist;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

/**
 * 
 * @author Kaif
 *
 */
public class Calender {
	
	/**
	 * This ia main function of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month of year");
		
		int month = sc.nextInt();
		
		System.out.println("Enter Year");
		
		int year = sc.nextInt();
		
		displayMonth(year,month);
		
		}
	/*
	 * To define method which will take month and year and print calender of that month
	 */
	static void displayMonth(int y,int m) {
		
		YearMonth ym = YearMonth.of(y, m);
		
		System.out.println("----------------------------");
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		System.out.println("----------------------------");
		
		int count = 1;
		
		/*
		 * To get day of week by calling out functions
		 */
		int day = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
		if (day != 7)
			for (int i = 0; i < day; i++, count++)
			{
				System.out.printf("%-4s", "");
			}
		/*
		 * To get date on that day of week
		 */
 
		for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, count++)
		{
			System.out.printf("%-4d", i);
			if (count % 7 == 0)
			{
				System.out.println();
			}
		}		
		System.out.println("\n---------------------------");
	}

}

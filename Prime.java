/*
 * This java program finds prime numbers and store it in two dimensional array.
 */
package com.linkedlist;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * To intialize two dimensional array 
		 */
		
		int [] [] array = new int [10] [27];
		
		/*
		 * To intialize array and storing the all prime numbers in a array
		 */
		int[] primeNumber = new int [168];
		int k=0;
		for(int i=2;i<=1000;i++) {
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				primeNumber[k] =i;
				k++;
			}
		}
		
		/*
		 * Intializing index for each range
		 * 
		 */
		int m1=0,m2=0,m3=0,m4=0,m5=0,m6=0,m7=0,m8=0,m9=0,m10=0;
		for(int i=0;i<primeNumber.length;i++) {
			if(primeNumber[i]<101) {
				/*
				 * Storing 0 to 100 range prime numbers
				 */
				array[0][m1]=primeNumber[i];
				m1++;
			}
			else if(primeNumber[i]<201) {
				/*
				 * Storing 101 to 200 range prime numbers 
				 */
				array[1][m2]=primeNumber[i];
				m2++;
			}
			else if(primeNumber[i]<301) {
				/*
				 * Storing 201 to 300 range prime numbers 
				 */
				array[2][m3]=primeNumber[i];
				m3++;
			}
			else if(primeNumber[i]<401) {
				/*
				 * Storing 301 to 400 range prime numbers 
				 */
				array[3][m4]=primeNumber[i];
				m4++;
			}
			else if(primeNumber[i]<501) {
				/*
				 * Storing 401 to 500 range prime numbers 
				 */
				array[4][m5]=primeNumber[i];
				m5++;
			}
			else if(primeNumber[i]<601) {
				/*
				 * Storing 501 to 600 range prime numbers 
				 */
				array[5][m6]=primeNumber[i];
				m6++;
			}
			else if(primeNumber[i]<701) {
				/*
				 * Storing 601 to 700 range prime numbers 
				 */
				array[6][m7]=primeNumber[i];
				m7++;
			}
			else if(primeNumber[i]<801) {
				/*
				 * Storing 701 to 800 range prime numbers 
				 */
				array[7][m8]=primeNumber[i];
				m8++;
			}
			else if(primeNumber[i]<901) {
				/*
				 * Storing 801 to 900 range prime numbers 
				 */
				array[8][m9]=primeNumber[i];
				m9++;
			}
			else if(primeNumber[i]<1000) {
				/*
				 * Storing 901 to 1000 range prime numbers 
				 */
				array[9][m10]=primeNumber[i];
				m10++;
			}
		}
		/*
		 * To print prime numbers array
		 */
		for(int i=0;i<10;i++) {
			for(int j=0;j<26;j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}

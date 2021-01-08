//MADHUSUDANAN NAGESH SAI

import java.util.Scanner;

class exercise1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the desired value: ");
		int x = in.nextInt();
		
		int i=0;
		while(i<x){
			int j = 0;
			while(j < x){
				if(i == j || j == 0 || j == x-1 && i < x-1){
					System.out.print("* ");
				}
				else{
					System.out.print(" ");					
				}
				j++;
			}
			System.out.println(); i++;
		}
	}
}



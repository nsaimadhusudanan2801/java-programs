//MADHUSUDANAN NAGESH SAI


import java.util.Scanner;
import java.lang.Math;

class exercise3{
	public static float area(float e, float f){
		return 0.5f*e*f;
	}
	
	public static float perimeter(float e, float f){
		float x = e/2;
		float y = f/2;
		float z = 4 * (float)(Math.sqrt(x*x + y*y));
		
		return z;
	}
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of 1st Diagonal: ");
		float diag1 = in.nextFloat();
		System.out.print("Enter the value of 2nd Diagonal: ");
		float diag2 = in.nextFloat();
				
		if(diag1 < 0 || diag2 < 0){
			System.out.println("WRONG DATA TYPE");
			System.exit(0);
		}
		else{
			System.out.println("The area of the rhombus is: "+ area(diag1, diag2));
			System.out.println("The perimeter of the rhombus is: "+ perimeter(diag1, diag2));
		}
	}
}


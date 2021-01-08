//MADHUSUDANAN NAGESH SAI


import java.util.Scanner;
import java.lang.Math;

class Rectangular{
	float a;
	float b;
	float c;
	
	Rectangular(float a, float b, float c){
		if(a < 0 || b < 0 || c < 0){
			System.out.print("THERE ARE NEGATIVE VALUES. HENCE, THE OBJECT CANNOT BE CREATED");
			System.exit(0);
		}
		else{
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	float area(float a, float b, float c){
		return 2 * (float)(a*b + b*c + a*c);
	}
	
	float diagonal(float a, float b, float c){
		return (float)Math.sqrt(a*a + b*b + c*c);
	}
}

public class exercise4{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		float x = in.nextFloat();
		System.out.print("Enter the value of b: ");
		float y = in.nextFloat();
		System.out.print("Enter the value of c: ");
		float z = in.nextFloat();
		
		Rectangular rect = new Rectangular(x, y, z);
		System.out.println("The area of the rectangle is: "+ rect.area(x, y, z));
		System.out.println("The diagonal of the rectangle is: "+rect.diagonal(x, y, z));
	}
}

		
		
		
		
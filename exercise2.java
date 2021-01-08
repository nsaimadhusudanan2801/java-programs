//MADHUSUDANAN NAGESH SAI


import java.util.Random;

class exercise2{
	public static void main(String args[]){
		int x[] = new int[80];
		int odd[] = new int[80];
		Random r = new Random();
		int sum =0;
		
		for(int i=0; i<80; i++){
			int z = 1 + r.nextInt(100);
			if(z >= 30 && z<=100){
				x[i]=z;
			}
		}
		
		System.out.println("The list is: ");
		for(int i=0; i<80; i++){
			System.out.print(x[i] + "  ");
		}
		
		System.out.println("\n"+"The list of odd numbers are: ");
		for(int i=0; i<80; i++){
			if(x[i] % 2 != 0){
				odd[i] = x[i];
			}
			System.out.print(odd[i] +"  ");
		}
		
		for(int i=0; i<80; i++){
			sum += odd[i];
		}
		System.out.println("\n"+"The sum of odd numbers from the list is: " + sum);
	}
}

			
		
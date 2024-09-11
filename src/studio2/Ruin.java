package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Start amount:");
		int startAmount = in.nextInt();
		System.out.print("Win chance:");
		double winChance = in.nextDouble();
		System.out.print("Win limit:");
		double winLimit = in.nextDouble();
		System.out.print("Total days");
		double totalSimulations = in.nextDouble();
		
		int currentAmount;
		currentAmount = startAmount; 
		
		
		
		for (int day = 1; day <= totalSimulations; day++) {
			currentAmount = startAmount; 
		
			while (currentAmount > 0  && currentAmount < winLimit) {
				
				if (Math.random() > winChance) {
					currentAmount ++; 
					

				} else {
					currentAmount--;
					
				
	
				}
				
				if (currentAmount == 0) {
					currentAmount++;
					
				}
				System.out.println( currentAmount);
				
			} 
			
			
				if (currentAmount >= winLimit) {
					System.out.println("Success");
					
					
				}	
				
				
				
				
				
				
		} 
	}
}

				
			

				
				
				
			
		
	

		


	



import java.util.*;

public class TrackingSales {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		//final int SALESPEOPLE = 5;
		System.out.println("Enter number of sales people: ");
		int Salespeople = console.nextInt();
		int[] sales = new int[Salespeople];
		double sum;
		int max = 0;
		int index = 0;
		int min_index = 0;
		int goalmet = 0;
		int index3 = 0;
		for(int i = 0; i < sales.length; i++) {
			System.out.print("Enter sales for sales person" + (i+1) + ": ");
			sales[i] = console.nextInt();
		}
		
		System.out.println("\nSalesperson Sales");
		System.out.println("----------------");
		sum = 0;
		for(int i = 0; i < sales.length; i++) {
			System.out.println(" " + (i+1) + " " + sales[i]);
			sum += sales[i];
			if(sales[i] > max) {
				
				max = sales[i];
				index = i;
							}
			
		}
		int min = max;
		
		for(int i = 1; i < sales.length; i++) 
			if(sales[i] < min ) {
				min = sales[i];
				min_index = i;
			
			}
		System.out.println("\nTotal sales: " + sum);
		System.out.printf("Average sale: %.2f", sum/sales.length);
		System.out.println("\nMax sale completed by Salesperson " + (index + 1) + " with $"  + max);
		System.out.println("Min sale completed by Salesperson " + (min_index + 1) + " with $" + min);
		System.out.print("Enter a value: ");
		int value = console.nextInt();
		for(int i = 0; i < sales.length; i++)
			if(sales[i] > value) {
				goalmet = sales[i];
				index3 = i;
				
				System.out.println("Goal met by Salesperson " + (index3 + 1) + " with $" + sales[i]);
			
			}
		
	}

}

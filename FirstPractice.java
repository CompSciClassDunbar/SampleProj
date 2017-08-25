import java.util.*;

public class FirstPractice {

//Initiating statics for later use
static double lemonadeCost = 0.79, brownieCost = 1.29, salesTax = 1.06;
static double overallBrownie = 0, overallLemonade = 0, overallTotal = 0;
static boolean status = true;


	public static void main(String[] args) {
		
		while(status){ //Check to see if the store is open
			//Initiate variables for input and later calculations
			double total = 0, discount;
			int percentOff;
			String response, name;
			Scanner s = new Scanner(System.in);
			
			
			//Ask and save user's name
			System.out.println("What is your name?"); 
			name = s.next();
			
			//Get brownie amount and add to total
			System.out.println("How many brownies do you want?");
			response = s.next();
			int valueB = Integer.parseInt(response);
			total = valueB * brownieCost;
			overallBrownie += valueB;
			
			//Get lemonade amount and add to total
			System.out.println("How many cups of lemonade do you want?");
			response = s.next();
			int valueL = Integer.parseInt(response);
			total = total + (valueL * lemonadeCost);
			overallLemonade += valueL;
			
			
			//Find the discount, if needed
			if(valueB >= 5 && valueL >= 5){
				discount = 0.78;
				percentOff = 22;
			}
			else if(valueB >= 5){
				discount = 0.90;
				percentOff = 10;
			}
			else if(valueL >= 5){
				discount = 0.95;
				percentOff = 5;
			}
			else{
				discount = 1.00;
				percentOff = 0;
			}
			
			
			//Calculate total, round, and add to the overall total
			total = (total * discount) * salesTax;
			total = Math.round(total * 100.0) / 100.0;
			overallTotal += total;
			
			
			//Print out the order
			System.out.println(name + "'s Order:");
			System.out.println("\nBrownies: " + valueB + " at $1.29 per brownie");
			System.out.println("Lemonade: " + valueL + " at $0.79 per cup of lemonade");
			System.out.println("Discount: " + percentOff + "%");
			System.out.println("Sales Tax: 6%");
			System.out.println("Your total: $" + total);
			System.out.println("Thanks for your purchase, have a great day!");
			
			
			//Check to see if the store is open
			System.out.println("Are we still open?");
			response = s.next();
			if(response.compareTo("no") == 0){
				status = false;
			}
		
		}
		//Print out the day's sales
		System.out.println("\nToday's Sales:");
		System.out.println("\nBrownies: " + overallBrownie);
		System.out.println("Lemonade: " + overallLemonade);
		System.out.println("Total: " + overallTotal);
	}

}

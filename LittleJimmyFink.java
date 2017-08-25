import java.util.*;

public class LittleJimmyFink {
	public static void main(String[] args){
		Scanner thing = new Scanner(System.in);
		String name = null;		
		short lemonade = 0;
		short brownies = 0;
		double total = 0;
		int totalCust = 0;
		
		while(true){
			System.out.println("Oh look! A new customer!");
			System.out.println("Bro, what's your name?");
			name = thing.next();
		
			System.out.println("how many of them tasty brownies you want?");
			brownies = thing.nextShort();
		
			System.out.println("how many cups of that hella refreshing lemonade do you want?");
			lemonade = thing.nextShort();
		
			double cost = 0;
			double newCost = 0;
			
			if(lemonade>5 && brownies<5){
				cost = ((0.79*lemonade)*.95) + (1.29*brownies);
				newCost = (cost*.06)+cost;
			}
			else if(lemonade<5 && brownies>5){
				cost = (0.79*lemonade) + ((1.29*brownies)*.9);
				newCost = (cost*.06)+cost;
			}
			else if(lemonade>5 && brownies>5){
				cost = ((0.79*lemonade) + (1.29*brownies))*.78;
				newCost = (cost*.06)+cost;
			}
			else{
				cost = (0.79*lemonade) + (1.29*brownies);
				newCost = (cost*.06)+cost;
			}
			
			
			System.out.println("Customer: "+name);
			System.out.println("Number of brownies: "+brownies);
			System.out.println("Cups of Lemonade: "+lemonade);
			if(lemonade>=5 && brownies<5){
				System.out.println("5% Discount");
			}
			else if(lemonade<5 && brownies>=5){
				System.out.println("10% Discount");
			}
			else if(lemonade>=5 && brownies>=5){
				System.out.println("22% Discount");
			}
			else{
				System.out.println("No Discount");
			}
			System.out.println("Sales Tax: $"+(cost*.6));
			System.out.println("Total Cost: "+newCost);
			System.out.println("Have a good day, "+name+"! Don't forget to come back to Little Johnny Fink's Snack Stand!");
			
			total += newCost;
			totalCust += 1;

			System.out.println("****************");
			System.out.println("The total so far is "+totalCust+" Customer(s) so far. I've made $"+total+" today");
			System.out.println("****************");
		}	
		
	}
}

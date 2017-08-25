import java.util.*;

public class LemonadeStand {

	final static double browniePrice = 1.29;
	final static double lemonadePrice = .79;
	final static double tax = .06;

	static Scanner strings = new Scanner(System.in);
	static Scanner nums = new Scanner(System.in);
	public static void main(String[] args) {
		int numLemonade;
		int numBrownies;
		double cost;
		double dayTotal = 0;
		boolean open = true;
		
		
		while(open){
		System.out.println("Enter your name");
		String name = strings.next();
		//shuts down program;
		if(name.equals("/endDay")){
			open = false;		
			break;
		}
		
		System.out.println("How many cups of lemonade would you like?");
		numLemonade = nums.nextInt();
		System.out.println("How many brownies would you like?");
		numBrownies = nums.nextInt();
		cost = calculatePrice(numLemonade, numBrownies);
		System.out.println("Your total is " + cost);
		dayTotal += cost;
		System.out.println("Today's total sales are " +dayTotal);

		numLemonade = 0;
		numBrownies = 0;
		cost = 0;
		}
		
		
		strings.close();
		nums.close();

	}

	public static double calculatePrice(int lemonade, int brownies) {
		double lemonadeTotal;
		double brownieTotal;
		double total;

		lemonadeTotal = (lemonade * lemonadePrice);
		brownieTotal = (brownies * browniePrice);
		total = lemonadeTotal + brownieTotal;
		if (lemonade >= 5 && brownies >= 5) {
			total -= (total * .22);
			System.out.println(brownies + " brownies = $" + brownieTotal);
			System.out.println(lemonade + " cups of lemonade = $" + lemonadeTotal);
			System.out.println("22% discount");
			System.out.println("$" + (total * tax) + " sales tax");
			return total += total * tax;
		} else if (brownies >= 5) {
			brownieTotal -= (brownieTotal * .1);
			System.out.println("10% brownie discount");
		} else if (lemonade >= 5) {
			lemonadeTotal -= (lemonadeTotal * .05);
			System.out.println("5% lemonade discount");
		}

		total += (total * tax);

		System.out.println(brownies + " brownies = $" + brownieTotal);
		System.out.println(lemonade + " cups of lemonade = $" + lemonadeTotal);
		
		return total;
	}

}

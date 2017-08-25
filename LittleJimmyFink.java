import java.util.*;
public class LittleJimmyFink {

	public static void main(String[] args) {
		Scanner fink = new Scanner(System.in);
		String name; int lnum, bnum; double total, falsetotal,ldiscount = 0, bdiscount = 0, tdiscount = 0; boolean finished = true; double suptotal = 0;
		while(finished){
		System.out.println("Name?");
		name = fink.next();
		
		System.out.println("Number of lemonades");
		lnum = fink.nextInt();
		System.out.println("Number of brownies");
		bnum = fink.nextInt();
		
		double discL, discB;
		falsetotal = (lnum * 0.79) + (bnum * 1.29);
		if(lnum >= 5 && bnum < 5){
			discL = (0.79 * lnum)- (0.79 * lnum)*(0.05);
			total = discL + (bnum * 1.29);
			ldiscount = 5;
			System.out.println("You get a 5% discount on your lemonades");
			
		}
		else if(lnum<5 && bnum >= 5){
			discB = (1.29 * bnum)- (1.29 * bnum)*(0.1);
			total = discB + (lnum * 0.79);
			bdiscount = 10;
			System.out.println("You get a 10% discount on your brownies");
		}
		else if(lnum >= 5 && bnum >= 5){
			total = falsetotal - (falsetotal * .22);
			tdiscount = 22;
			System.out.println("Your obtained a 22% discount on your total pricing");
		}
		else{
			total = falsetotal;
			System.out.println("wow what a loser");
		}
		total += total + (.06*total);
		
		System.out.println(name+" purchased:");
		System.out.println(lnum+" lemonades");
		System.out.println("and "+bnum+" brownies");
		System.out.println("with a "+ldiscount+"% discount on your lemonade");
		System.out.println("and a "+bdiscount+"% discount on your brownies");
		System.out.println("Your total cost is "+total+" with a 6% sales tax and a "+tdiscount+"% total discount");
		
		System.out.println("Are there any more people? (true for yes false for no)");
		finished = fink.nextBoolean();
		suptotal += total;
		}
		System.out.println("The total amount of money made today is: "+suptotal);

	}

}

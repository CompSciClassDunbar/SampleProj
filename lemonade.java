import java.util.*;
public class lemonade {

	public static void main(String[] args) {
		//variables
		double lemCost= 0.79;
		double brownCost= 1.29;
		Scanner scan= new Scanner(System.in);
		int numLem=0;
		int numBrown=0;
		double costBrown=0;
		double costLem=0;
		double salesTax;
		double total=0;
		double savings=0;
		double totalSales=0;
		String name;
		boolean brownDis=false;
		boolean lemDis=false;
		boolean bigDis=false;
		boolean isNext=true;
		
		//talk to the person
		
		while(isNext){
			System.out.println("What is your name?");
			name= scan.next();
			System.out.println("How many brownies would you like to buy?");
			numBrown= scan.nextInt();
			System.out.println("How many cups of lemonade would you like to buy?");
			numLem= scan.nextInt();
		
			//Check discounts
			if(numBrown>4 && numLem>4)
				bigDis=true;
			else if(numBrown>4)
				brownDis= true;
			else if(numLem>4)
				lemDis=true;
		
			//Math
			costBrown= numBrown*brownCost;
			if(brownDis){
				savings= costBrown*.1;
				costBrown= costBrown-costBrown*.1;
			}
			
			costLem= numLem*lemCost;
			if(lemDis){
				savings= costLem*.05;
				costLem= costLem-costLem*.05;
			}
		
			total= costLem + costBrown;
			if(bigDis){
				savings= total*.22;
				total= total-total*.22;
			}
			salesTax=total*.06;
			
			totalSales= totalSales+ total+ salesTax;
		
			//tell them stuff
			System.out.println("Hey, "+name);
			System.out.println("You've ordered "+ numBrown+" brownie(s).");
			System.out.println("You've ordered "+ numLem+" cup(s) of lemonade.");
		
			System.out.println("You've spent $"+ costBrown+" on brownies before any discounts.");
			System.out.println("You've spent $"+ costLem+" on lemoande before any discounts.");
		
			if(brownDis)
				System.out.println("You've qualified for the brownie discount!! You saved $"+savings+" on brownies");
			if(lemDis)
				System.out.println("You've qualified for the lemonade discount!! You saved $"+savings+" on lemonade");
			if(bigDis)
				System.out.println("You've qualified for the bulk buyer's discount!! You saved $"+savings+" on your total");
		
			System.out.println("A sales tax of $"+salesTax+" will be added");
			System.out.println("In total you've spent $"+(total+salesTax));
			System.out.println("Thanks for shopping at Eli's Stand, our total sales today have been $"+totalSales);
			
			System.out.println("Is there a customer next in line?");
			isNext= scan.nextBoolean();
		}
		scan.close();
	}

}

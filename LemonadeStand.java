import java.util.*;
public class LemonadeStand {
	//this is a function to round to .01 to make simpler answers
	public static double round100(double dble){
		dble = dble*100;
		dble = Math.round(dble);
		return dble/100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//making scanner
		Scanner sc = new Scanner(System.in);
		//making boolean for shutting store true= store is open
		boolean open = true;
		double runningtotal = 0;
		while(open){
			System.out.println("What is your name?");
			String name = sc.next();
			//got name
			System.out.println("How many brownies did you buy?");
			String brownies;
			brownies = sc.next();
			int brownienum = Integer.parseInt(brownies);
			//got brownie#s
			
			System.out.println("How many glasses of lemonade did you buy?");
			String lemonade;
			lemonade = sc.next();
			int lemonadenum = Integer.parseInt(lemonade);
			//got lemonade#s
			boolean discountbrownie = false; 
			double nbrownie = brownienum;
			//calculating brownie discount if brownnies + lemonade arent both discounted
			if(!(brownienum>4&lemonadenum>4))
				if(brownienum>4){
					nbrownie = nbrownie*.9; 
					discountbrownie = true; 
				}
			//got brownie discount
			
			//if they bought five or more brownies discount 10%
			//calculating lemonade discount if brownies + lemonade arent both discounted 
			boolean discountlem = false;
			double nlemonade = lemonadenum;
			if(!(brownienum>4&lemonadenum>4))
				if(lemonadenum>4){
					nlemonade = nlemonade*.95;
					discountlem = true; 
				}
			//got lemonade discount
			//if they got five or more lemonades, discount 10%
			//getting discount  total if lemonade + brownies are both discounted
			boolean discounttotal = false; 
			if((brownienum>4&lemonadenum>4)){
				nbrownie = nbrownie*.78;
				nlemonade = nlemonade*.78;
				discounttotal = true;
			}
			//got bigger discount 
			double cost = nbrownie*1.29 + nlemonade*.79;
			//getting sales tax before i change the cost 
			double salestax;
			salestax = cost*.06;
			double newcost; 
			newcost = cost*1.06;
			//printing out final results 
			System.out.println(name+", your purchased "+brownienum+" brownies and "+lemonadenum+" lemonades");
			newcost = round100(newcost);
			System.out.println("Your total cost is: "+newcost+". Thank you for your business!");
			runningtotal = runningtotal+newcost;
			//saying what discounts the customer got
			if(discountlem){
				double lemdiscount = lemonadenum*.79*.05;
				lemdiscount = round100(lemdiscount);
				System.out.println("You were discounted "+lemdiscount+" because you bought more than 5 lemonades");
				
			}
			
			if(discountbrownie){
				double browniediscount = brownienum*1.29*.1;
				browniediscount = round100(browniediscount);
				System.out.println("You were discounted "+browniediscount+" because you bought more than 5 lemonades");
			}
			
			if(discounttotal){
				double totaldiscount = cost*.22;
				totaldiscount = round100(totaldiscount);
				System.out.println("You were discounted "+totaldiscount+" because you bought more than 5 lemonades and more than 5 brownies.");
				
			}
			System.out.println("Is the store closing? Please say yes or no.");
			String answerclose = sc.next();
			if(answerclose.compareTo("yes")==0)
				open = false;
			
			
			
		}
		System.out.println("The total sales for the day were:"+runningtotal);
	
		
		
	}

}

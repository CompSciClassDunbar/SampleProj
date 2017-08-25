import java.util.*;
public class LemonadeStand {
	
	public static void main(String[] args) {
		
		//make variables for if there is a customer and a running total
		boolean customer=true;
		double runtot=0;
		
		while(customer){//while there are customers in line
			
			//instantiate variables
			int lems, brs, bd=0, ld=0;
			double lemcost=.79, bcost=1.29, total=0, totbrs, totlems;
			String nm;
			Scanner sc=new Scanner(System.in);
			
			 
			System.out.println("What is their name?");//ask for name
			nm=sc.next();//store it in nm
			
			System.out.println("How many brownies did they buy?");//find num of brownies bought
			brs=sc.nextInt();//store in brs
			
			if(brs>=5){//if they bought more than 5
				totbrs=brs*bcost*.9;//calculate discounted brownie price
				bd++;//make it true
			}//end of if
			
			else//didn't buy more than 5 brownies
				totbrs=brs*bcost;//no discount
			
			System.out.println("How many lemonades did they buy?");//find num of lemonades bought
			lems=sc.nextInt();//store in lems
			
			if(lems>=5){//if they bought more than 5
				totlems=lems*lemcost*.95;//calculate discounted lemonade price
				ld++;//make discount for lems true
			}//end of if
			
			else //didn't buy more than 5
				totlems=lems*lemcost; //calculate regular price
			
			if (ld==1 && bd==1){ //if they got both discounts
				total=((totlems/.95)+(totbrs/.9))*.78; //reset prices, then give a 22% discount
			}//end of if
			
			else //if they didn't
				total+=totlems+totbrs;//calculate regular total
			
			
			
			//end script
			System.out.println(nm+" bought "+lems+" lemonades for $"+lems*lemcost+" and "+brs+" brownies for $"+brs*bcost+".");//items bought
			
			//if they got big discount
			if (ld==1 && bd==1){
				System.out.println("They got a 22% discount on their entire purchase! This brings their total to $"+total+" without tax.");//tell them
			}//end of if
			
			else if (ld==1)//only got lemonade discount
				System.out.println("They got a 5% discount on lemonades, bringing their total down to $"+total+".");
			
			else if (bd==1)//only got brownie discount
				System.out.println("They got a 10% discount on brownies, bringing their total down to $"+total+".");
			
			else//no discount
				System.out.println("They got no discounts.");
			
			total*=1.06;//calculate total with sales tax
			
			//tell them about sales tax and their total
			System.out.println("There was a 6% sales tax, which brings the final price to $"+total+".");
			
			//last line from Little Jimmy
			System.out.println("Thank you for visiting Little Jimmy's Lemonade Emporium!");
			
			runtot+=total;//add total to running total
			System.out.println("We have $"+runtot+" in sales today.");//print running total
			
			System.out.println("Is there another customer?");//check for more in line
			customer=sc.nextBoolean();
			
			
		}	//end of while
	
	}//end of main
	

}

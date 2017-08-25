import java.util.*;
public class LemonadeStand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		final double lemCost=.79;
		final double brownCost=1.29;
		final double brownDiscount=.9;
		final double lemDiscount=.95;
		final double totalDiscount=.78;
		
		boolean lastPurchase=false;
		double totalEarnings=0;
		
	while(!lastPurchase){	
			double totalSavings=0;
			double totalCost=0;
			int numBrownies=0;
			int numLemonades=0;
			String Name;
		
			boolean bDisc=false;
			boolean lDisc=false;
			boolean tDisc=false;
		
			System.out.println("What's your name?");
			Name=sc.next();
			System.out.println("How many glasses of lemonade would you like?");
			numLemonades=sc.nextInt();
			System.out.println("How many brownies would you like?");
			numBrownies=sc.nextInt();
		
			totalCost=numBrownies*brownCost + numLemonades*lemCost;
			if(numBrownies>=5 && numLemonades>=5){
				totalSavings=totalCost-(totalDiscount*(numBrownies*brownCost + numLemonades*lemCost));
				totalCost=totalDiscount*(numBrownies*brownCost + numLemonades*lemCost);
				tDisc=true;
			}else if(numBrownies>=5 && numLemonades<5){
				totalCost=numBrownies*brownCost*brownDiscount + numLemonades*lemCost;
				bDisc=true;
				totalSavings=numBrownies*brownCost*(1-brownDiscount);
			}else if(numBrownies<5 && numLemonades>=5){
				totalCost=numBrownies*brownCost + numLemonades*lemCost*lemDiscount;
				lDisc=true;
				totalSavings=numLemonades*lemCost*(1-lemDiscount);
			}
			totalEarnings+=totalCost;
			totalCost=totalCost*1.06; //taxes
			
			System.out.println("Customer Name: "+Name);
			System.out.println("Your Purchases:");
			if(numBrownies>0){
				System.out.println(numBrownies+" Brownies........$"+brownCost*numBrownies);
				if(bDisc){
					System.out.println("You received a 10% discount on your brownies!");
				}
			}
			if(numLemonades>0){
				System.out.println(numLemonades+" Lemonades.......$"+lemCost*numLemonades);
				if(lDisc){
					System.out.println("You received a 5% discount on your lemonade!");
				}
			}
			if(tDisc){
				System.out.println("You received a 22% discount on your entire purchase!");
			}
			System.out.println("Total Cost: $"+totalCost);
			System.out.println("Total Savings: $"+ totalSavings);
			System.out.println("Have a Finky Day!");
			System.out.println("End?");
			int thing=sc.nextInt();
			if(thing==1){
				lastPurchase=true;
			}
		}
		System.out.println("Total Earnings Today: $"+totalEarnings);
	}
}

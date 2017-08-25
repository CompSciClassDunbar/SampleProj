import java.util.*;

public class lemonade {
	static double lemC=.79, broC=1.29;//setting cost without discounts

	public static void main(String[] args) {
		ArrayList<String> peeps=new ArrayList<String>();
		String nm;									//making
		short numL, numB;								//cool
		double total;									//variables
		Scanner scanny=new Scanner(System.in);			//oh
		boolean stillCustomers;							//yeah
		
			System.out.print("Enter name:");
			nm=scanny.nextLine();				//put scanny to work
			System.out.println("How many lemonades would you like?");
			numL=scanny.nextShort();
			if(numL>5)									//applies discount
				lemC*=.95;
			System.out.println("And how many brownies?");
			numB=scanny.nextShort();
			if(numB>5)									//applies discount
				broC*=.9;
			scanny.close();								//closes scanner
			
			total=lemC*numL+broC*numB;					//calc total
			if(numL>5 && numB>5)						//applies total discount
				total*=.78;
			double totTax=total*1.06;					//adds tax
		
		//making a nice formatted receipt
		System.out.println();
		System.out.println();
		System.out.println("Little Jimmy's Lemonade \n");
		System.out.println("Transaction "+(int)(Math.random()*10000)+1);
		System.out.println("8/23/17 \n");
		System.out.println(nm);
		System.out.println("Lemonade\t"+numL+"\t"+lemC*numL);
		if(numL>5)
			System.out.println("\tdisc 5%\t\t-"+(lemC*.05)*numL);
		System.out.println("Brownie\t\t"+numB+"\t"+broC*numB);
		if(numB>5)
			System.out.println("\tdisc 5%\t\t-"+(broC*.05)*numB);
		System.out.println();
		System.out.println("\tSubtotal:\t"+total);
		if(numL>5 && numB>5)
			System.out.println("\t    disc 22%    -"+total*.22);
		System.out.println("\tTax:\t\t"+total*.06);
		System.out.println("\tTotal:\t\t"+totTax);
		System.out.println();
		System.out.println("Get away from me now");
	}
}

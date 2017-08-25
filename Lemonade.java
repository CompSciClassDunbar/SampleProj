import java.util.Scanner;
public class Lemonade {

	public static void main(String[] args) {
		Scanner Billy = new Scanner(System.in);
		
		//i didn't do step 3
		
		String name;
		String discount="0%";
		
		float numLem;
		float numBrow;
		

		
		boolean fiveB= false;
		boolean fiveL= false;
		
		double fCost=0;
		boolean customer= true;
		
		String newP="";
		
	
			
			
			System.out.println("What is name of the customer?");
			name= Billy.nextLine();
			System.out.println("How many lemonades do you want?");
			numLem= Billy.nextInt();
			System.out.println("How many brownies do you want?");
			numBrow= Billy.nextInt();
			
		
			if(numBrow>=5)
				fiveB= true;
			if(numLem>=5)
				fiveL= true;
			
			if(fiveB==true && fiveL==true){
				fCost=.78 * (1.29 * numBrow + .79 * numLem);
				discount="22%";
			}
			if(fiveB==true && fiveL==false){
				fCost= .9 *(1.29 * numBrow) + .79 * numLem;
				discount="10%";
			}
			if(fiveB==false && fiveL==true){
				fCost= 1.29 * numBrow + .95 *(.79 * numLem);
				discount="05%";
			}
			if(fiveB==false && fiveL==false)
				fCost= 1.29 * numBrow + .79 * numLem;
			total+= fCost;
			
			fCost+= fCost*.06;
			
			System.out.println("Recipt for customer: "+ name);
			System.out.println(numBrow + " Brownies: $" + 1.29 * numBrow );
			System.out.println(numLem + " Lemonades: $" + .79 * numLem);
			System.out.println("You have earned a discount of: " + discount);
			System.out.println("Tax: 06%");
			System.out.println("Total cost with dicount and tax: $" + fCost);
			System.out.println("Have a nice day!");
			
			
			
			
			
		
		
	}

}

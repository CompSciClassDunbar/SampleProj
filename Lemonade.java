import java.util.*;

public class Lemonade {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		double finalCost=0;
		boolean another=true;
		while (another==true){


			String[] want=new String[5];
			int[] newWant=new int[2];

			String[] product={"lemonades", "brownies"};
			double lem=0.79;
			double brownie=1.29;
			double tCost=0;

			String name="";
			System.out.println("Please enter your name");
			want[0]=reader.nextLine();

			for (int i=1; i<3; i++){
				System.out.println("Type in the number of "+product[i-1]+" you want to purchase");
				want[i]=reader.nextLine();
				int temp=Integer.parseInt(want[i]);
				newWant[i-1]=temp;
			}
			double discount=0;
			double lemCost=lem*newWant[0];
			double brownCost=brownie*newWant[1];
			boolean Tdiscount=false; boolean Ldiscount=false; boolean Bdiscount=false;
			if (newWant[0]>=5 && newWant[1]>=5){
				tCost=(lemCost+brownCost)*0.78;
				Tdiscount=true; discount=(lemCost+brownCost)*0.22;
			}
			else if (newWant[1]>=5){
				brownCost=brownCost*0.9;
				tCost=lemCost+brownCost;
				Bdiscount=true; discount=brownCost*0.1;
			}
			else if (newWant[0]>=5){
				lemCost=lemCost*0.95;
				tCost=lemCost+brownCost;
				Ldiscount=true; discount=lemCost*0.05;
			}
			double tax=tCost*0.06;
			System.out.println(want[0]);
			System.out.println("You purchased "+want[1]+" lemonades for a total of $"+lemCost);
			System.out.println("You purchased "+want[2]+" brownies for a total of $"+brownCost);
			System.out.println("Your subtotal is $"+tCost); System.out.println("Your tax is $"+tax);
			tCost=tCost+tax;
			System.out.println("Your total cost is: $"+tCost);
			if (discount!=0)
				System.out.println("Discount received: $"+discount);
			System.out.println("Is there another customer? If yes, please type yes.");
			String cust=reader.nextLine();
			if (cust=="no" || cust=="No")
				another=false;
			finalCost+=tCost;
		}	
		System.out.println(finalCost);
	}
}

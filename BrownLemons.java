import java.util.*;

public class BrownLemons {

	public static void main(String[] args) {
		//scanner
		Scanner boy= new Scanner(System.in);
		String name= "";
		int nL= 0;
		int nB= 0;
		double xL= 0.79;
		double xB= 1.29;
		double price= 0;
		double discount=0;
		boolean disc= false;
		
		System.out.println("What is your name?");
		name= boy.next();
		//System.out.println(name);//check that I'm not dumb
		
		System.out.println("How many lemonades would you like?");
		nL= Integer.parseInt(boy.next());
		//System.out.println(nL);
		
		System.out.println("How many brownies would you like?");
		nB= Integer.parseInt(boy.next());
		//System.out.println(nB);
		
		if(nB>=5 && nL<5){xB*=.9;}
		else if(nL>=5 && nB<5){xL*=.95;}
		else if(nB>=5 && nL>=5){
			discount=.22;
			disc=true;
		}
		
		price= (xL*nL)+(xB*nB);
		if(disc){
			price-=price*discount;
		}
		price+=price*.06;
		
		
		System.out.println(name+"'s purchase:");
		System.out.println(nL+" lemonades");
		System.out.println(nB+" brownies");
		if(nB>=5 && nL<5){
			System.out.println("You received a 10% discount on your brownies!");}
		else if(nL>=5 && nB<5){
			System.out.println("You received a 5% discount on your lemonades!");}
		else if(discount!=1){
			System.out.println("You received a 22% discount on your purchase!");}
		System.out.println("Total cost: $"+price);
		System.out.println("Thank You come again!");

	}

}

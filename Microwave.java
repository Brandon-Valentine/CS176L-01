package Microwave;

public class Microwave {

	private int time;
	private int power=1;
	
	public int getTime() {
		return time;
	}
	public int getPower() {
		return power;
	}
	public void time(int amt) {
		time=time+amt;
		System.out.print("Time button was pressed. Time is ");
		System.out.print(time);
		System.out.println(" seconds.");}
	public void power(int amt) {	
		power=power+amt;
			
		System.out.print("Power button was pressed. Power level is ");
		System.out.println(power);
	
		
		
		
	}
	public void reset() {
		time=0;
		power=1;
		System.out.print("Reset button was pressed. Power level is at ");
		System.out.print(power);
		System.out.print(" Time is ");
		System.out.print(time);
		System.out.println(" seconds.");
	}
	public void start() {
		System.out.print("Cooking for ");
		System.out.print(time);
		System.out.print(" seconds at level ");
		System.out.println(power);
		
	}
	
	
		
	}
	

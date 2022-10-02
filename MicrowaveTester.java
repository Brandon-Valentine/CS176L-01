package Microwave;

public class MicrowaveTester {
	
	public static void main(String[] args) {
	Microwave myMicrowave= new Microwave();
	int amount=30;

	myMicrowave.time(amount);

	myMicrowave.time(amount);
	

	int powerLevel=1;
	myMicrowave.power(powerLevel);
	
	myMicrowave.start();
	myMicrowave.reset();
	

}}

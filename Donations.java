import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Donations {
int numIndividual=0;
double amtIndividual=0;
int numOther=0;
double amtOther=0;
int numBusiness=0;
double amtBusiness=0;

public void processDonations(String cat, Double amt) {
	int amtCheck=0;
if(amt>1) {
	amtCheck=amtCheck+1;}
else {
		amtCheck=amtCheck-1;
	
}
	
if (cat.equals("individual")) {
	numIndividual=numIndividual+amtCheck;
	amtIndividual=amtIndividual+amt;	
	}
else if (cat.equals("business")) {
	numBusiness=numBusiness+amtCheck;
	amtBusiness=amtBusiness+amt;
		}
else if (cat.equals("other")){
	numOther=numOther+amtCheck;
	amtOther=amtOther+amt;

	}


}

	

public void getStatistics() {
	System.out.println("Individual: #:"+numIndividual+" $"+amtIndividual);
	System.out.println("Business: #:"+numBusiness+ " $"+amtBusiness);
	System.out.println("Other: #:"+numOther+ " $"+amtOther);
	
}
}


	




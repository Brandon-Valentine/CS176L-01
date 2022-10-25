import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args)  throws FileNotFoundException {
		File inputFile= new File("Donations.txt");
		Scanner read= new Scanner(inputFile);
		String category="";
		Donations giveToMe= new Donations();
		while (read.hasNextLine()) {
			String text=read.nextLine();
			;{
		if (text.startsWith("<individual")){
			category="individual";
			double Donation=Double.parseDouble(text.replaceAll("<individual donation>",""));
			giveToMe.processDonations(category, Donation);

			
			}
		else if (text.startsWith("<business")) {
			category="business";
			double Donation=Double.parseDouble(text.replaceAll("<business donation>",""));
			giveToMe.processDonations(category, Donation);
			}
		else if (text.startsWith("<other")){
			category="other";
			double Donation=Double.parseDouble(text.replaceAll("<other donation>",""));
			giveToMe.processDonations(category, Donation);
				
				
	}

}
		}


Scanner UserInput= new Scanner(System.in);
String decision=("Would you like to process donations? (Enter 'Yes' to continue.): ");
System.out.print(decision);
decision=UserInput.nextLine();
if(decision.equals("Yes")) {
	giveToMe.getStatistics();
}
else {
	System.out.print("Ending now without processing donations");
	}
	{
	}
}}

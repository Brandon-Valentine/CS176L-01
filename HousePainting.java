import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Get all inputs
		System.out.print("Please enter the cost per square foot:");
		double squareFootCost = sc.nextDouble();
		System.out.print("Please enter the length of the house:");
		double houseLength = sc.nextDouble(); 
		System.out.print("Please enter the width of the house:");
		double houseWidth = sc.nextDouble(); 
		System.out.print("Please enter the height of the house:");
		double houseHeight = sc.nextDouble(); 
		System.out.print("Please enter the number of windows:");
		double windowNumber = sc.nextDouble(); 
		System.out.print("Please enter the length of a window:");
		double windowLength = sc.nextDouble();
		System.out.print("Please enter the width of a window:");
		double windowWidth = sc.nextDouble(); 
		System.out.print("Please enter the number of doors:");
		double doorNumber = sc.nextDouble(); 
		System.out.print("Please enter the length of a door:");
		double doorLength = sc.nextDouble();
		System.out.print("Please enter the width of a door");
		double doorWidth = sc.nextDouble(); 
		double peakSide=2*((houseLength*houseWidth) + 0.5*(houseLength*(houseHeight-houseWidth))); 
		double normalSide=2*(houseLength*houseWidth);
		double doorSqft=doorNumber*(doorLength*doorWidth);
		double windowSqft=windowNumber*(windowLength*windowWidth);
		double notPainted=(doorSqft+windowSqft);
	
		//Outputs
		System.out.println();
		System.out.println(peakSide);
		System.out.println(normalSide);
		System.out.println(doorSqft);
		System.out.println(windowSqft);
		System.out.print("Your total paintable surface area is ");
		System.out.print(peakSide+normalSide-notPainted);
		System.out.println(" square feet.");
		System.out.print("Your estimate is ");
		System.out.print(squareFootCost*(peakSide+normalSide-notPainted));
		System.out.print(" dollars.");
		

	}

}

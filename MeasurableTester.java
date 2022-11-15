/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = new BankAccount(176220);
      bank[1] = new BankAccount(513120);
      bank[2] = new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");

      //Quiz Scores
      System.out.println("Quiz Score data");
      Measurable[] test = new Measurable[5];
      test[0]= new Quiz(95);
      test[1]= new Quiz(80);
      test[2]= new Quiz(90);
      test[3]= new Quiz(50);
      test[4]= new Quiz(75);
      double average=Data.average(test);
      System.out.println("Average Score: "+average);
      System.out.println("Expected: 78");
      System.out.println("");
      double maxScore=Data.max(test);
      System.out.println("Highest Test Score: "+ maxScore);
      System.out.println("Expected: 95");
      
   }  
}

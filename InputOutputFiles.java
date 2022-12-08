import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {    Scanner input= new Scanner(System.in);
   boolean valid=false;
   String path="";
   System.out.println(valid);
   
   while(!valid) {
	   System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt ");
	   path=(input.next());
   try { 
		   File inputFile = new File(path);
		   PrintWriter outputFile = new PrintWriter("outlines.txt");
		   Scanner in = new Scanner(inputFile);
		   while (in.hasNext()) 
		   {
			   String what =in.next();
			   outputFile.println(what);
			   System.out.println(what);
			   valid=true;
			   }
		   in.close();
		   outputFile.close();}
   catch (FileNotFoundException exception){
	   System.out.println("File not found, please try again");
   }}}}


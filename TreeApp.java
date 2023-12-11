package edu.monmouth.tree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

public class TreeApp {
   public static void main(String[] args) {
       // verify there is 1 and only 1 command line argument
	   /*if (args.length != 1) {
           System.err.println("Please enter only one command line argument");
       }*/
       Properties properties = new Properties();
      
       // load the properties file using command line argument
       try {
           properties.load(new FileInputStream("src/assignment5.properties"));
       } catch (IOException e) {
           e.printStackTrace();
       }
       
       // list all properties to System.out
       properties.list(System.out);
       
       // obtain the value of log_file_name property
       String logFileName = properties.getProperty("log_file_name");
  
            
       // redirect stdout & stderr to the value of log_file_name
       /*try {
           PrintStream st = new PrintStream(logFileName);
           System.setOut(st);
           System.setErr(st);
           } catch(FileNotFoundException ioe) {
    			System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage());
    			ioe.printStackTrace();
    			System.exit(-1);
    			}*/
       
	// obtain the value of node_values property
       String nodeValues = properties.getProperty("node_values");
	
	// create an instance of the Tree class
	Tree tree = new Tree();
	// verify min, max and find operate on an empty tree
  	tree.min();
  	tree.max();
 	tree.find(10);
	
	// parse the key / value pairs of node_values and insert into tree
 	String[] keyValues = nodeValues.split(";");
 	for(String keyValue:keyValues) {
 		String[] pairs = keyValue.split(",");
 		int key = Integer.parseInt(pairs[0]);
 		double value = Double.parseDouble(pairs[1]);
 		tree.insert(key, value);
 		
 	}
 	
 	
 	
 	
 	

	
      	// print out the keys using inorder
	tree.traverse(2);
      
      
      // determine if the value 12 is in the tree
	tree.find(12);

      // determine if the value 80 is in the tree
	tree.find(80);
     
	// print out the minimum value in the tree 
	System.out.println("Minimum: " + tree.min());

	// print out the maximum value in the tree      
      System.out.println("Maximum: " + tree.max());
      
      } 
   }  
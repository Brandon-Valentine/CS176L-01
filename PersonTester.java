
public class PersonTester {
	/**
	 * Implement a superclass Person. 
	 * Make two classes, Student and Instructor, that inherit from Person. 
	 * A person has a name and a year of birth.
	 * A student has a major, and an instructor has a salary.
	 * Write the class declarations and the constructors for all classes
	 * 
	 * This class tests the Person, Student, and Instructor classes.
	*/
	
	
	   public static void main(String[] args)
	   {
		   Person p1= new Person();
		   p1.setBirth(1965);
		   p1.setName("John");
		   System.out.println(p1.toString());
		   
		   Person p2= new Person();
		   p2.setBirth(1970);
		   p2.setName("Mary Ann");
		   System.out.println(p2.toString());
		   Student s1 = new Student();
		   s1.setBirth(1982);
		   s1.setName("Ann");
		   s1.setMajor("Computer Science");
		   System.out.println(s1.toString());
		   Student s2 = new Student();
		   s2.setBirth(1982);
		   s2.setName("Thomas");
		   s2.setMajor("Biology");
		   System.out.println(s2.toString());
		   Instructor i1 = new Instructor();
		   i1.setBirth(1954);
		   i1.setName("Joseph");
		   i1.setSalary(65000);
		   System.out.println(i1.toString());
	      /**
	       String p1=(" is a Person John born in 1965)
	       * p2 is a Person "Mary Ann" born in 1970
	       * s1 is a Student "Ann" born in 1982 and is a "Computer Science" major
	       * s2 is a Student "Thomas" born in 1986 and is a "Biology" major
	       * i1 is an Instructor "Joseph" born in 1954 earning 65000
	       * Enter lines of code below to instantiate these objects:
	       */

	   }}

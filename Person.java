
public class Person {

	private String name;
	private int birthYear;
	
public void  setName(String PersonName) {
	name=PersonName;
}
public void setBirth(int year){ 
	birthYear=year;
}
	
	   public String toString()
	   {
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	   }

	

}

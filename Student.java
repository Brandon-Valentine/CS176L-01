
public class Student extends Person {
	
	private String major;
	
public void setMajor(String Major) {
	major=Major;
}	

	   public String toString()
	   {
	      return "Student[super=" + super.toString() + ",major=" + major + "]";
	   }

}

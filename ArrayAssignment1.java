
public class ArrayAssignment1 {
	
	public static void main(String[] args) {
	
			double[] values={25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		;
		int amtNegative=0;
		double largest= values[0];
		 for(double count: values) {
			 System.out.print(count+" ");
			 System.out.print("");
			 if(count>largest) {
				 largest=count;
			 }
			 if (count<1){
				 amtNegative++;
			 }
			 
		 }
		 System.out.println("");
		 System.out.println("The largest element in the array is : "+largest);
		 System.out.println("There are "+amtNegative+" negative numbers in the array.");
	}

}

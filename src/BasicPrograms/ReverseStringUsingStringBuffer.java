package BasicPrograms;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "abcd";
		
		StringBuffer sbr = new StringBuffer(str); // creating string buffer class object
		
		sbr.reverse(); // reverse method is used to revers a given string 
		
		System.out.println(sbr);
		
	}

}
 
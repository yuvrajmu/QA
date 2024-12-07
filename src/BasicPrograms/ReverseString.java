package BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ab1234cd", str2 = "";
		char ch;
		
		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i); // extract each character
			str2 = ch+str2;
		}
		
		System.out.println(str2);
	}
}

package BasicPrograms;

import java.util.HashMap;

public class Anagram {
	
	
	public static boolean areAnagram(String str1,String str2) {
		
		if(str1.length() !=str2.length()) { // need to verify length
			
			return false;
			
		}
		
		
		
		HashMap<Character, Integer> countchar = new HashMap<>();
		
		
		for(int i=0; i<str1.length();i++) {
			
			// test
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			countchar.put(c1,countchar.getOrDefault(c1, 0)+1);
			countchar.put(c2, countchar.getOrDefault(c2, 0-1));
			
		}
		
		for(int i : countchar.values()) {
			
			if(i!=0) {
				
				return false;
				
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "abcd";
		String str2 = "dcba";
		
		if(areAnagram(str1,str2)) {
			
			System.out.println(str1 +" are "+str2+ " anagrams ");
		}
		else {
			
			System.out.println(str1 +" are "+str2+ " not anagrams ");
		
		}
	}

}

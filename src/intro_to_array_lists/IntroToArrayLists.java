package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> s=new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		s.add("potato");
		s.add("tomato");
		s.add("thing 1");
		s.add("thing 2");
		s.add("the fifth object");
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
	//	for (int i = 0; i < s.size(); i++) {
		//	System.out.println(s.get(i));
		//}
		//4. Print all the Strings using a for-each loop
		//for (String f : s) {
		//	System.out.println(f);
		//}
		//5. Print only the even numbered elements in the list.
	//	for (int i = 0; i < s.size(); i++) {
		//	if(i%2==0) {
		//	System.out.println(s.get(i));
			//}
	
		//	for (int i = s.size()-1; i >= 0 ; i--) {
			//System.out.println(s.get(i));
	//	}
			for (String f : s) {
				if(f.contains("e")) {
				System.out.println(f);
			}
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}


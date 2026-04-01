package JavaStrings;

import java.util.ArrayList;

public class Strings {
	public static void main(String[] args) {
		String name = "Anthology";
		//charAt - throws exception when the index is out of bounds
		System.out.println(name.charAt(2));
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == 'o')
				count ++;
		}
		System.out.println("Occurance of o in the string is: " + count);
	}
}

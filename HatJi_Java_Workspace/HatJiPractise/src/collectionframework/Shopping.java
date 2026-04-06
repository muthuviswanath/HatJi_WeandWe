package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Shopping {
	public static void printShoppingList(List<Object> shoppinglist) {
		for(Object obj:shoppinglist) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Object> diwaliList = new ArrayList<Object>(); 
		System.out.println("Enter the number of items to be purchased for Diwali: ");
		int diwali_count = scan.nextInt();
		for(int i=0; i<diwali_count; i++) {
			diwaliList.add(new DiwaliList(scan.next()));
		}

		System.out.println("Printing Diwali list");
		printShoppingList(diwaliList);

		List<Object> colors = new ArrayList<Object>();
		colors.add("Violet");
		colors.add("Indigo");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Red");
		printShoppingList(colors);

		ArrayList<Object> gfridaylist = new ArrayList<Object>();
		for(int i=0; i<3; i++)
		{

			gfridaylist.add(new GoodFridayShopping(scan.next()));
		}
		printShoppingList(gfridaylist);
	}
}

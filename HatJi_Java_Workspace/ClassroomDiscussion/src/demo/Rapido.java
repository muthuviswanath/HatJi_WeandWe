package demo;

public class Rapido extends TestClass implements BhuvanMap, GoogleMaps {

	@Override
	public void findDirections(String src, String destn) {
		System.out.println(src +"->" + "bangalore" + "->" + destn);
	}

	@Override
	public void findshortestPath(String src, String destn) {
		System.out.println(src +"->" + "cubbon park, Vidhana Soudha, Majestic" + "->" + destn);
	}
	
	public static void main(String[] args) {
		Rapido g = new Rapido();
		g.findDirections("Delhi", "Goa");
		g.findshortestPath("Whtiefield", "Mysore");
				
	}

}

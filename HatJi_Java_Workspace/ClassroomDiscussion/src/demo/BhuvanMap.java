package demo;

public interface BhuvanMap extends GoogleMaps {

	abstract void findDirections(String src, String destn);
	abstract void findshortestPath(String src, String destn);
}

package demo;

public class PngFile extends Files{

	public PngFile(String dimension, String filename, String extension, int filesize) {
		super(dimension, filename, extension, filesize);
	}

	@Override
	void commonBehaviors() {
		System.out.println("This PNG File can be openend, saved, edited, delted, etc...");
	}
	
	void displayInfo() {
		System.out.println("Loaded and displayed as layers in RGB mode");
	}
}

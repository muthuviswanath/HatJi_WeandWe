package demo;

public class BMPFile extends Files{

	public BMPFile(String dimension, String filename, String extension, int filesize) {
		super(dimension, filename, extension, filesize);
	}
	
	@Override
	void commonBehaviors() {
		System.out.println("This BMP File can be openend, saved, edited, delted, etc...");
	}
	
	void showData() {
		System.out.println("Displayed as icons");
	}
}

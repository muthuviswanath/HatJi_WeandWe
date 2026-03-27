package demo;

public class JpegFile extends Files{

	public JpegFile(String dimension, String filename, String extension, int filesize) {
		super(dimension, filename, extension, filesize);
	}
	
	@Override
	void commonBehaviors() {
		System.out.println("This JPEG File can be openend, saved, edited, delted, etc...");
	}
	
	void displayFile() {
		System.out.println("Loaded and Displayed as flat image with millions of colors");
	}

}

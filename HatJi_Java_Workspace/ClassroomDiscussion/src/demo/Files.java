package demo;

public class Files {
	String dimension;
	String filename;
	String extension;
	int filesize;
	public Files(String dimension, String filename, String extension, int filesize) {
		this.dimension = dimension;
		this.filename = filename;
		this.extension = extension;
		this.filesize = filesize;
	}
	
	void commonBehaviors() {
		System.out.println("File can be openend, saved, edited, delted, etc...");
	}
	
}

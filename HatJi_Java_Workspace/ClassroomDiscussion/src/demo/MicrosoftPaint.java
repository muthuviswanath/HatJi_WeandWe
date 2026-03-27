package demo;

public class MicrosoftPaint {

	void open(Files f) {
		System.out.println("File Name: " + f.filename+f.extension);
		System.out.println("File Size: " + f.filesize + " kb");
		System.out.println("Dimension: " + f.dimension);
		f.commonBehaviors();
		
		if(f instanceof JpegFile) {
			JpegFile jpeg = (JpegFile)f;
			jpeg.displayFile();
		}
		else if(f instanceof BMPFile) {
			BMPFile bmp= (BMPFile)f;
			bmp.showData();
		}
		else if(f instanceof PngFile)
		{
			PngFile png = (PngFile)f;
			png.displayInfo();
		}
	}


	public static void main(String[] args) {
		MicrosoftPaint mspaint = new MicrosoftPaint();
		Files j = new JpegFile("800 x 600", "My_Image", ".jpg", 230);
		Files b = new BMPFile("1024 x 768", "Wallpaper", ".bmp", 123);
		Files p = new PngFile("400 x 150", "Logo", ".png", 12);
		mspaint.open(j);
		mspaint.open(b);
		mspaint.open(p);
	}
}

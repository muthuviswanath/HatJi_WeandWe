
public class Farmer {
	public static void main(String[] args) {
		Cow c = new Cow();
		Hay h = new Hay();
		Water w = new Water();
		Milk amul_milk = c.gives(h,w);
		System.out.println(amul_milk);
		c = null;
//		Milk milk = c.gives(h,w);
		System.out.println(h.hay_type);
		System.out.println(w.water_type);
	}
}

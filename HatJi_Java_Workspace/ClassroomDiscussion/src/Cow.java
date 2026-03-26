
public class Cow {

	Milk gives (Hay h, Water w) {
		System.out.println("The cow is fed with " + h.hay_type + " and "+ w.water_type);
		Milk m = new Milk();
		System.out.println(m);
		return m;
	}
}

class Milk{}
class Hay{ String hay_type = "Internation Hay";}
class Water{String water_type = "Carbonated Water";}

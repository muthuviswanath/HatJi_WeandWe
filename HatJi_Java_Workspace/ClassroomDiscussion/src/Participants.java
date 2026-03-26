
public class Participants {
	int id;
	String name;
	String skill;
	
	public Participants(int id, String name, String skill) {
		this.id = id;
		this.name = name; 
		this.skill = skill;
	}
	
	public static void main(String[] args) {
		Participants p = new Participants(123, "Siddhu", "Sixers");
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.skill);
	}
}

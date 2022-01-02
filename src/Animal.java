
public class Animal {
	public String name;
	public int weight;
	public String gender;
	public String color;
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public void eat(int portion) {
		System.out.println(name + "(이)는 " + portion + " 만큼의 밥을 먹었다.");
	}
}

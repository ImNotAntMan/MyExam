
public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override 
	public void eat(int portion) { 
		System.out.println(name + "(이)는 " + portion + " 만큼의 밥을 먹었다. 야옹야옹!");
	}
}

public class Student extends Person {
	public Student(int personId, String personName, String personEmail) {
		super(personId, personName, personEmail); // 부모클래스의 생성자 호출
	}
	
	public void doWork() {
		System.out.println(getPersonName() + "가 공부한다.");
	}
}

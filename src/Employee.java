
public class Employee extends Person {
	public Employee(int personId, String personName, String personEmail) {
		super(personId, personName, personEmail); // 부모클래스의 생성자 호출	}
	
	public void doWork() {
		System.out.println(getPersonName() + "이 근무합니다.");
	}
}

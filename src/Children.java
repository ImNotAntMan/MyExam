
public class Children extends Person {
	public Children(int personId, String personName, String personEmail) {
		super(personId, personName, personEmail); // 부모클래스의 생성자 호출	}
	}
	public void doWork() {
		System.out.println(getPersonName() + "이 학교를 갑니다.");
	}
}

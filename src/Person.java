
public class Person {
	// 멤버변수
	private int personId;
	private String personName;
	private String personEmail;
	// 생성자
	public Person(int Id, String personName, String personEmail) {

	}
	// 오버로딩 된 생성자
	// 메서드
	public void doWork() {
		
	}
	
	public String getPersonName() {
		return personName;
	}
	public int getpersonId() {
		return this.personId;
	}
	public String getPersonEmail() {
		return this.personEmail;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	// 오버로딩 된 메서드
}

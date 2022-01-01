
public class TestManagePerson {

	public static void main(String[] args) {
		ManagePerson mpList = new ManagePerson();
		mpList.addPerson(new Student(1, "홍남기개새끼", "아후씨발놈"));
		mpList.addPerson(new Student(2, "홍남기개새끼", "아후씨발놈"));
		mpList.addPerson(new Employee(3, "홍남기개새끼", "아후씨발놈"));
		mpList.addPerson(new Employee(4, "홍남기개새끼", "아후씨발놈"));
		mpList.addPerson(new Children(5, "홍남기개새끼", "아후씨발놈"));
		mpList.addPerson(new Children(6, "홍남기개새끼", "아후씨발놈"));
		mpList.modifyPersonName(1, "홍범도");
		mpList.modifyPersonEmail(1, "1test@test.net");
		mpList.modifyPersonName(2, "홍범도");
		mpList.modifyPersonEmail(2, "2test@test.net");
		mpList.modifyPersonName(3, "홍범도");
		mpList.modifyPersonEmail(3, "3test@test.net");
		mpList.modifyPersonName(4, "홍범도");
		mpList.modifyPersonEmail(4, "4test@test.net");
		mpList.modifyPersonName(5, "홍범도");
		mpList.modifyPersonEmail(5, "5test@test.net");
		mpList.modifyPersonName(6, "홍범도");
		mpList.modifyPersonEmail(6, "6test@test.net");
		mpList.showAllPerson();
	}
}
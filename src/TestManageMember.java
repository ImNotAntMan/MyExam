
public class TestManageMember {

	public static void main(String[] args) {
		ManageMember member = new ManageMember();
		member.addMember(new Member(1, "홍길동1", "010-1234-1234", "test@test.com", "충북 청주시 청원구 1054"));
		member.addMember(new Member(2, "홍길동2", "010-1234-1234", "test@test.com", "충북 청주시 청원구 1054"));
		member.addMember(new Member(3, "홍길동3", "010-1234-1234", "test@test.com", "충북 청주시 청원구 1054"));
		member.addMember(new Member(4, "홍길동4", "010-1234-1234", "test@test.com", "충북 청주시 청원구 1054"));
		member.addMember(new Member(5, "홍길동5", "010-1234-1234", "test@test.com", "충북 청주시 청원구 1054"));
		member.addMember(new Member(6, "홍길동6", "010-1234-1234", "test@test.com", "충북 청주시 청원구 1054"));
		member.showAllMember();
		member.modifyMemberAddress(2, "서울입니다.");
		member.modifyMemberName(2, "이순신");
		member.modifyMemberAddress(1, "강원도입니다.");
		member.modifyMemberName(3, "강감찬");
		member.removeMember(5);
		member.showAllMember();
	}

}

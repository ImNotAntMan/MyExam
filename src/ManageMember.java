import java.util.*;
public class ManageMember {
	ArrayList<Member> memberList;
	
	public ManageMember() {
		memberList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public boolean removeMember(int mId) {
		for(Member tmp : memberList) {
			if(tmp.getmId() == mId) {
				memberList.remove(tmp);
				return true;
			}
		}
		return false;
	}
	public boolean removeMember(String mName) {
		for(Member tmp : memberList) {
			if(tmp.getmName().equals(mName)) {
				memberList.remove(tmp);
				return true;
			}
		}
		return false;
	}
	
	public boolean modifyMemberName(int mId, String mName) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getmId() == mId) {
				memberList.get(i).setmName(mName);
				return true;
			}
		}
		return false;
	}
	public boolean modifyMemberCellPhone(int mId, String mCellPhone) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getmId() == mId) {
				memberList.get(i).setmCellPhone(mCellPhone);
				return true;
			}
		}
		return false;
	}
	public boolean modifyMemberEmail(int mId, String mEmail) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getmId() == mId) {
				memberList.get(i).setmEmail(mEmail);
				return true;
			}
		}
		return false;
	}
	public boolean modifyMemberAddress(int mId, String mAddress) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getmId() == mId) {
				memberList.get(i).setmAddress(mAddress);
				return true;
			}
		}
		return false;
	}
	
	public void showAllMember() {
		for(Member tmp : memberList) {
			System.out.println(tmp.getmId() + " " + tmp.getmName() + " " + tmp.getmCellPhone() + " " +
								tmp.getmEmail() + " " + tmp.getmAddress());
		}
	}
}


public class Member {
	private int mId;
	private String mName;
	private String mCellPhone;
	private String mEmail;
	private String mAddress;
	
	public Member(int mId, String mName, String mCellPhone, String mEmail, String mAddress) {
		this.mId = mId;
		this.mName = mName;
		this.mCellPhone = mCellPhone;
		this.mEmail = mEmail;
		this.mAddress = mAddress;
	}
	
	public void setmId(int mId ) {
		this.mId = mId;
	}
}

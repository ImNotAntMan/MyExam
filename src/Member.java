
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
	public void setmName(String mName) {
		this.mName = mName;
	}
	public void setmCellPhone(String mCellPhone) {
		this.mCellPhone = mCellPhone;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	public void setmAddress(String mAddress) {
		this.mAddress =  mAddress;
	}
	
	public int getmId() {
		return this.mId;
	}
	public String getmName() {
		return this.mName;
	}
	public String getmCellPhone() {
		return this.mCellPhone;
	}
	public String getmEmail() {
		return this.mEmail;
	}
	public String getmAddress() {
		return this.mAddress;
	}
}

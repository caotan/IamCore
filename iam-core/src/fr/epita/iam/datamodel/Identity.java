package fr.epita.iam.datamodel;

public class Identity {

	private String uid;
	private String displayName;
	private String email;
	private String address;
	

	public Identity(String uid, String displayName, String email, String address) {
		this.displayName = displayName;
		this.uid = uid;
		this.email = email;
		this.setAddress(address);
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Identity [uid=" + uid + ", displayName=" + displayName + ", email=" + email + ", address=" + address +"]";
	}

	
}
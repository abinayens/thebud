
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	public BuddyInfo(String name, String address, String phoneNumber){
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

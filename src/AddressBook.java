import java.util.ArrayList;

public class AddressBook {
	ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	public void addBuddy(BuddyInfo buddy){
		if(buddy != null){
			buddyList.add(buddy);
		}
	}
	
	public void removeBuddy(int index){
		if(index >=0 && index < buddyList.size()){
			buddyList.remove(index);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Address book");
	}
		
}
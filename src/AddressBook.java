import java.util.ArrayList;

public class AddressBook {

	ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	
	
	
	public void addBuddy(BuddyInfo b){
		buddyList.add(b);
	}
	
	public void removeBuddy(BuddyInfo b){
		buddyList.remove(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
	}

}

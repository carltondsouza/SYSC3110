import java.util.ArrayList;

public class AddressBook {

	ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	
	
	public void addBuddy(BuddyInfo b){
		buddyList.add(b);
	}
	
	public void removeBuddy(BuddyInfo b){
		buddyList.remove(b);
	}
	
	public void removeBuddyIndex(int i){
		if (i <= buddyList.size()){
			buddyList.remove(i);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
		
		AddressBook addressBook = new AddressBook();
		
		BuddyInfo b = new BuddyInfo();
		b.setName("Jimmy");
		b.setAddress("18 Rat Crescent");
		b.setPhonenumber("613-815-4377");
		
		addressBook.addBuddy(b);
		addressBook.removeBuddy(b);
	}

}

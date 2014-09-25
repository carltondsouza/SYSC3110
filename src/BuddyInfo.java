
public class BuddyInfo {

	private String name;
	private String address;
	private String phonenumber;
	
	
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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
		//hshhshshshs
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo b = new BuddyInfo();
		System.out.println("Hello World!");
		
		b.setName("Alicia");
		b.setAddress("22 Acacia Avenue");
		b.setPhonenumber("1-810-621-9254");
		
		System.out.println(b.getName());
		System.out.println(b.getAddress());
		System.out.println(b.getPhonenumber());
	}

}

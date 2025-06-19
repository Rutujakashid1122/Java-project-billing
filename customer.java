package encapsulation.data;

public class customer {
	private int id;
	private String name;
	private String address;
	private String contact;
	
	public customer(int id, String name, String address,String contact) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getaAddress() {
		return address;
	}
	public String getContact() {
		return contact;
	}

}




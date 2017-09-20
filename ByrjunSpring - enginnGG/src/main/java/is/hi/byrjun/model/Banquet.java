package is.hi.byrjun.model;


public class Banquet {
	private int id;
	private String name;
	private String location;
	private String streetAddrs;
	private int price;
	private int maxppl;
	private int phonenr;
	private String email;

	public Banquet(int idnr,String name, String loc, String address, int price,
			int max, int phone, String email) {
		this.id = idnr;
		this.name = name;
		this.location = loc;
		this.streetAddrs = address;
		this.price = price;
		this.maxppl = max;
		this.phonenr = phone;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int idnr) {
		this.id = idnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String input) {
		this.name = input;
	}

	public String getLocation() {
		return location;	
	}

	public void setLocation(String loc) {
		this.location = loc;
	}

	public String getAddress() {
		return streetAddrs;
	}

	public void setAddress(String addrs) {
		this.streetAddrs = addrs;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int input) {
		this.price = input;
	}

	public int getMax() {
		return maxppl;
	}

	public void setMax(int max) {
		this.maxppl = max;
	}

	public int getPhonenr() {
		return phonenr;
	}

	public void setPhonenr(int phone) {
		this.phonenr = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String mail) {
		this.email = mail;
	}
	
	@Override
	public String toString() { 
		return String.format("<BR>" + "Id:" + id + "<BR>" + "Nafn:" + name + "<BR>" + "Location:" + location
				+ "<BR>" + "Address:" + streetAddrs + "<BR>" + "price:" + price + "<BR>" + "Max people:" + maxppl
				+ "<BR>" + "Phone nr:" + phonenr + "<BR>" + "e-mail:" + email);
	}
}

package test;

public class Student {
     
	private String Firstname;
    private String Lastname;
    private String Email;
    private Address stAddress;
    
    
    public Address getstAddress() {
		return stAddress;
	}
	public void setstAddress(Address address) {
		stAddress = address;
	} 
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
    
}

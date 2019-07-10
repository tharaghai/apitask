package model;

public class Patient
{
	private String name;
	private String street;
	private String city;
	private String postalCode;
    private String phoneNumber;
  
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
   
    
	public Patient()
	{
	
	}
	public Patient(String name,String Street,String City,String post,String phone,String Email)
	{
		this.name=name;
		this.street=Street;
		this.city=City;
		this.postalCode=post;
		this.phoneNumber=phone;
		this.email=Email;

	}
}

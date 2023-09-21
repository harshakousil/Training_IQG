package oe;

public class Customer 
{
  int id;
  String name;
  String address;
  String phone;
  private static int nextCustomerId=0;

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setId(int newId)
  {
  }

  public void setName(String newName)
  {
  }

  public void setAddress(String newAddress)
  {
  }

  public void setPhone(String newPhone)
  {
  }
  
  
  // practice 7 :Object Life Cycle and classes
  
  public Customer()
  {
	  nextCustomerId++;
	  setId(nextCustomerId);
  }
  
  public Customer(String theName, String theAddress,String thePhone)
  {
	  this.name=theName;
	  this.address=theAddress;
	  this.phone=thePhone;
  }
}
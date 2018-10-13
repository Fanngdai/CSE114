/*
 * Lab 16 part of 1,2 & 3
 */
public class Store {
	private String name;
	private String address;
	private int identifier;
	private String owner;

	public Store(String name, String address, int identifier, String owner){
		this.name = name;
		this.address = address;
		this.identifier = identifier;
		this.owner = owner;
	}
	
//	public void setName(){
//		this.name = name;
//	}
//	public void setAddress(){
//		this.address = address;
//	}
//	public void setIdentifier(){
//		this.identifier = identifier;
//	}
//	public void setOwner(){
//		this.owner= owner;
//	}
//	
//	public String getName(){
//		return this.name;
//	}
//	public String getAddress(){
//		return this.address;
//	}
//	public int getIdentifier(){
//		return this.identifier;
//	}
//	public String getOwner(){
//		return this.owner;
//	}
	
	public String toString(){
		String output = "";
		output += "The name of the store is " + this.name + "\n";
		output += "The address of the store is " + this.address + "\n";
		output += "The identifier of the store is " + this.identifier + "\n";
		output += "The owner of the store is " + this.owner + "\n";
		return output;
	}
}
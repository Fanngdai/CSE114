/*
 * Lab 19 part 1
 */
public abstract class Vehicle{
	private String ownerName;
	private int numOfWheel;
	
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	public void setNumOfWheels(int numOfWheel){
		this.numOfWheel = numOfWheel;
	}
	public String getOwnerName(){
		return this.ownerName;
	}
	public int getNumOfWheel(){
		return this.numOfWheel;
	}
	public abstract double horsePower();
}
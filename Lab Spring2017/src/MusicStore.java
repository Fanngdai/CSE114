/*
 * Lab 16 part 2
 */
public class MusicStore extends Store{
	private int numOfTitles;
	
	public MusicStore(String name, String address, int identifier, String owner, int numOfTitles){
		super(name, address, identifier, owner);
		this.numOfTitles = numOfTitles;
	}
	
	public String toString(){
		return super.toString() + "The number of titles this store offers is " + this.numOfTitles;
	}
}
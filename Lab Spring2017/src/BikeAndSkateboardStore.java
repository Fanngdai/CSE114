/*
 * Lab 16 part 3
 */
public class BikeAndSkateboardStore extends Store{
	private int brands;
	private boolean sponsor;
	
	public BikeAndSkateboardStore(String name, String address, int identifier, String owner, int brands, boolean sponsor){
		super(name, address, identifier, owner);
		this.brands = brands;
		this.sponsor = sponsor;
	}
	
	public String toString(){
		String output = "";
		output += super.toString();
		output += "The brands offered by this store is " + this.brands + "\n";
		if(this.sponsor == true){
			output += "It offers this brand.";
		}
		else{
			output += "It does not offers this brand.";
		}
		return output;
	}
}

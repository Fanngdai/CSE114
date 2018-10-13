/*
 * Lab 16 part 1
 */
public class WebStore extends Store{
	private String internetAddress;
	private String programLang;
	
	public WebStore(String name, String address, int identifier, String owner, String internetAddress, String programLang){
		super(name, address, identifier, owner);
		this.internetAddress = internetAddress;
		this.programLang = programLang;
	}
	
	public String toString(){
		String output = "";
		output += super.toString();
		output += "The internet address of the store is " + this.internetAddress + "\n";
		output += "The programming language of the store is " + this.programLang;
		return output;
	}
}
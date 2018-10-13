/*
 * Lab 19 part 2
 */
public class Fruit extends SomeFood{
	private String season;
	
	Fruit(String season){
		this.season = season;
	}
	public void setSeason(String season){
		this.season = season;
	}
	public String getSeason(){
		return this.season;
	}
	
	public int numOfCal(int numOfServing){
		return numOfServing * getCalories();
	}
	public void main(String[] args){
		
	}
}
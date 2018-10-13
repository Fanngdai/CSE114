/*
 * Lab 12 part 2
 * Objects and Classes Part 2
 */
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	public void setPreviousClosingPrice(double num){
		previousClosingPrice = num;
	}
	public void setCurrentPrice(double num){
		this.currentPrice = num;
	}
	
	public String getSymbol(){
		return symbol;
	}
	public String getName(){
		return name;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	public double getCurrentPrice(){
		return currentPrice;
	}
	
	public double changePercent(){
		return (previousClosingPrice - currentPrice / previousClosingPrice) * 100;
	}
}
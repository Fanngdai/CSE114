/*
 * Lab 19 part 1
 */
public class Bicycle extends Vehicle{
	private double engineVolumeDisplacement;

	Bicycle(double engineVolumeDisplacement){
		this.engineVolumeDisplacement = engineVolumeDisplacement;
	}
	public double horsePower(){
		return (this.engineVolumeDisplacement * super.getNumOfWheel());
	}

	public static void main(String[] args){
		Bicycle bike = new Bicycle(500);
		bike.setNumOfWheels(4);
		System.out.print(bike.horsePower());
	}
}
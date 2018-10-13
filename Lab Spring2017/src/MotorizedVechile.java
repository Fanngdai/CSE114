/*
 * Lab 19 part 1
 */
public class MotorizedVechile extends Vehicle{
	// in liters
	private double engineVolumeDisplacement;
	
	MotorizedVechile(double engineVolumeDisplacement){
		this.engineVolumeDisplacement = engineVolumeDisplacement;
	}
	public double horsePower(){
		return (this.engineVolumeDisplacement * super.getNumOfWheel());
	}
	
	public static void main(String[] args){
		MotorizedVechile motor = new MotorizedVechile(500);
		motor.setNumOfWheels(4);
		System.out.print(motor.horsePower());
	}
}
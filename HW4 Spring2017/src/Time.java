/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #4
 * Part 4: Time.java class
 */
import java.util.Calendar;

public class Time {
	private int hour;
	private int minute;
	private int second;

	// Creates a time object for the current local time
	public Time(){
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}

	// specified elapse time since midnight, January 1, 1970 in milliseconds
	public Time(long elapseTime){
		setTime(elapseTime);
	}

	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}

	//sets a new time for the object using the elapsed time
	public void setTime(long elapseTime){
		long totalSeconds = elapseTime / 1000;
		this.second = (int) (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		this.minute = (int) (totalMinutes % 60);
		long totalHours = totalMinutes / 60;
		this.hour = (int) (totalHours % 24);
	}
}
package time_of_day;


/**
 * Abstract state invariants:
 * 
 * @invar | getHours() >= 00 && getHours() <= 24
 * @ivnar | getMinutes() >= 00 && getMinutes() <= 60
 * @invar | getSeconds() >= 00 && getSeconds() <= 60
 */
public class TimeOfDay {

	private int hours = 00;
	private int minutes = 00;
	private int seconds = 00; 
	
	
	public int getHours() { return this.hours; }
	public int getMinutes() { return this.minutes; }
	public int getSeconds() { return this.seconds; }


	/**
	 * 
	 */
	public TimeOfDay(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
	}
}

package time_of_day;


/**
 * Abstract state invariants:
 * 
 * @invar | getHours() >= 00 && getHours() <= 24
 * @invar | getMinutes() >= 00 && getMinutes() <= 60
 */
public class TimeOfDay {

	private int hours = 00;
	private int minutes = 00;
	
	
	
	public int getHours() { return this.hours; }
	public int getMinutes() { return this.minutes; }
	


	/**
	 * @post | this.getHours() == hours
	 * @post | this.getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		
		
	}
}

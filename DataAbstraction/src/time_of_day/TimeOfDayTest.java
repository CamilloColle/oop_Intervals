package time_of_day;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		int oopStartHour = 10;
		int oopStartMinutes = 30;
		int oopEndHour = 13;
		int oopEndMinutes = 0;
		
		//int oopLength = (oopEndHour * 60 + oopEndMinutes) - (oopStartHour * 60 + oopStartMinutes);
		
		TimeOfDay oopStart = new TimeOfDay(10, 0);
		oopStart.setMinutes(30);
		TimeOfDay oopEnd = new TimeOfDay(12, 0);
		oopEnd.setHours(11);
		oopEnd.setMinutesSinceMidnight(13 * 60);
		
		int oopLength = oopEnd.getMinutesSinceMidnight() - oopStart.getMinutesSinceMidnight(); 
		assertEquals(150, oopLength);
		
		
	}

}

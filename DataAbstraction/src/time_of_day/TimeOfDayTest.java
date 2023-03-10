package time_of_day;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay time1 = new TimeOfDay(22, 15);
		assertEquals(22, time1.getHours());
		
		TimeOfDay time2 = new TimeOfDay(00, 30);
		assertEquals(30, time2.getMinutes());
	}

}

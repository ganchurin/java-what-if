package core.time;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class LocalTimeTest {

	@Test
	public void createCurrentTime() {
		// Use static method 'now' to create time object with current time
		LocalTime time = LocalTime.now();
	}

	@Test
	public void createCustomTime() {
		// Use static method 'of' to create custom time object
		LocalTime time1 = LocalTime.of(10, 30);
		checkTime(time1, 10, 30, 0, 0);

		LocalTime time2 = LocalTime.of(10, 30, 15);
		checkTime(time2, 10, 30, 15, 0);

		LocalTime time3 = LocalTime.of(10, 30, 15, 100);
		checkTime(time3, 10, 30, 15, 100);
	}

	private void checkTime(LocalTime t, int hour, int minute, int second, long nano) {
		assertEquals(t.getHour(), hour);
		assertEquals(t.getMinute(), minute);
		assertEquals(t.getSecond(), second);
		assertEquals(t.getNano(), nano);
	}

	@Test
	public void checkPlusTime() {
		LocalTime t = LocalTime.of(10, 30);
		assertEquals(t.plusHours(10), LocalTime.of(20, 30));
		assertEquals(t.plusMinutes(10), LocalTime.of(10, 40));
		assertEquals(t.plusSeconds(10), LocalTime.of(10, 30, 10));
		assertEquals(t.plusNanos(1000), LocalTime.of(10, 30, 0, 1000));
	}

	@Test
	public void checkMinusTime() {
		LocalTime t = LocalTime.of(10, 30);
		assertEquals(t.minusHours(10), LocalTime.of(0, 30));
		assertEquals(t.minusMinutes(10), LocalTime.of(10, 20));
		assertEquals(t.minusSeconds(10), LocalTime.of(10, 29, 50));
		assertEquals(t.minusNanos(1000), LocalTime.of(10, 29, 59, 999999000));
	}
}

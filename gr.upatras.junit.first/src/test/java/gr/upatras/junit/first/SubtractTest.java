package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class SubtractTest {

	@Test
	void testGetSign() {
		 Subtract tester = new Subtract();
		 assertEquals("POSITIVE", tester.getSign(10, 5), "10 x 5 must be 50");
	}

}

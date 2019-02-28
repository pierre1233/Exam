package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {

	@BeforeEach
	void setUp() {
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	void add() {
		FIFO fifo = new FIFO();
		int calctaille = fifo.size();
		fifo.add(7);
		assertEquals(calctaille, calctaille++);
	}
	@Test
	void isEmpty() {
		FIFO fifo = new FIFO();
		assertEquals(fifo.isEmpty(), true);
	}

	@Test
	void removeFirst() {
		FIFO fifo = new FIFO();
		assertThrows(NoSuchElementException.class, () -> fifo.removeFirst());
	}

	@Test
	void size() {
		FIFO fifo = new FIFO();
		int calctaille = 1;
		fifo.add(100);
		assertEquals(fifo.size(), calctaille);
	}

	@Test
	void first() {
		FIFO fifo = new FIFO();
		assertThrows(NoSuchElementException.class, () -> fifo.first());

		fifo.add(100);
		assertEquals(fifo.first(), Integer.valueOf(100));
	}
}

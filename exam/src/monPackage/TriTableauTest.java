package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() {
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	void TesttriCroissant1() {
		int monTableau[] = { 46, 33, 13, 12, 7 };
		int monTableauAttendu[] = { 7, 12, 13, 33, 46 };
		TriTableau.triCroissant(monTableau);
		assertEquals(monTableau[4], monTableauAttendu[4]);
	}
	@Test
	void TesttriCroissant2_shouldreturnerror() {
		int monTableau[] = { 46, 33, 13, 12, 7 };
		int monTableauAttendu[] = { 7, 12, 13, 33, 46 };
		TriTableau.triCroissant(monTableau);
		assertEquals(monTableau[4], monTableauAttendu[3]);
	}

	@Test
	void TesttriDecroissant1() {
		int monTableau[] = { 7, 12, 13, 33, 46 };
		int monTableauAttendu[] = { 46, 33, 13, 12, 7 };
		TriTableau.triDecroissant(monTableau);
		assertEquals(monTableau[4], monTableauAttendu[4]);
	}
	@Test
	void TesttriDecroissant2_shouldreturnerror() {
		int monTableau[] = { 7, 12, 13, 33, 46 };
		int monTableauAttendu[] = { 46, 33, 13, 12, 7 };
		TriTableau.triDecroissant(monTableau);
		assertEquals(monTableau[4], monTableauAttendu[3]);
	}

}
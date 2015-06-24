

import org.mockito.*;
//import static 
import org.junit.*;
import static org.junit.Assert.*;

public class CoffeeMakerTest {
	
			
	// this tests that runArgs always returns 0

		@Test
		 public void testRunArgs() {
		 CoffeeMaker cm = new CoffeeMaker();
		 int returnVal = cm.runArgs("foo");
		 assertEquals(returnVal, 0);
		 
     }
			
			
}

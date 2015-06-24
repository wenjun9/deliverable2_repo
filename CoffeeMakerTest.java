

import org.mockito.*;
//import static 
import org.junit.*;
import static org.junit.Assert.*;

public class CoffeeMakerTest {
	
	public void testwhatever(){
		House h = Mockito.mock(House.class);
		Player p = Mockito.mock(Player.class);
		Game g = new Game(p,h);
		int i =  g.doSomething("N");
		assertEquals(i,0);

	}
	
	public void testHasItem(){
		Room r = new Room(true, true,true,true,true);
		boolean returnval=r.hasItem();
		assertEquals(returnval,true);
	}

	
	
	//	public class CoffeeMakerTest {
			
	// this tests that runArgs always returns 0

		@Test
		 public void testRunArgs() {
		 CoffeeMaker cm = new CoffeeMaker();
		 int returnVal = cm.runArgs("foo");
		 assertEquals(returnVal, 0);
		 
     }
			
			
}

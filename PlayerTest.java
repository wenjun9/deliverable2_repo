import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PlayerTest {
	
	@Test
	
	public void testhasAllItems(){
		Player p = new Player(true,true,true);
		boolean result = p.hasAllItems();
		assertEquals(result,true);
		
	}
	
	@Test
	
	public void testshowInventory1(){
		Player p = new Player(true,true,true);
		verify(p,times(1)).showInventory();
		
		boolean result = p.drink();
		assertEquals(result,true);
		
	}
	
    @Test
	
	public void testshowInventory2(){
		Player p = new Player(true,false,true);
		boolean result = p.drink();
		assertEquals(result,false);
		
	}
	

}

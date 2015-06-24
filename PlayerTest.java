import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PlayerTest {
	
//	create a new player and settle the attributes of the new player
//	get the different result depend on the settled attributes
	@Test
	public void testhasAllItems(){
		Player p = new Player(true,true,true);
		boolean result = p.hasAllItems();
		assertEquals(result,true);
		
	}
	
//	create a new player and settle the attributes of the new player
//	using drink method, to get the true or false
	@Test
	public void testshowInventory1(){
		Player p = new Player(true,true,true);
		boolean result = p.drink();
		assertEquals(result,true);
		
	}
	
    @Test
	public void testshowInventory2(){
		Player p = new Player(true,false,true);
		boolean result = p.drink();
		assertEquals(result,false);
		
	}
	
   @Test
	public void testdrink(){
		Player p = new Player(true,false,false);
		boolean result = p.drink();
		assertEquals(result,false);
		
	}

   @Test
  	public void testdrink1(){
  		Player p = new Player(false,true,false);
  		boolean result = p.drink();
  		assertEquals(result,false);
  		
  	}
   
   
}

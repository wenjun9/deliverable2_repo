import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;



public class GameTest {

	@Test
	public void testMoveNorth() {
		//precondition
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		//don't need a when
		
		//Execution 
		int result = g.doSomething("N");
		
		//Assertions
		//verify(h).moveNorth();
		verify(h,times(1)).moveNorth();
		//verify(h,never()).moveSouth();
		//verify(h,times(2)).moveNorth();
		assertEquals(result,0);
			
		
	}
	
	@Test
	public void testMoveSouth() {
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		
		int result = g.doSomething("S");
		verify(h,times(1)).moveSouth();
		assertEquals(result,0);
		
	}
	
	@Test
	public void testlook() {
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		
		int result = g.doSomething("L");
		verify(h,times(1)).look(p, null);
		assertEquals(result,0);
		
	}
	
	@Test
	public void testShowInventory() {
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		
		int result = g.doSomething("I");
		verify(p,times(1)).showInventory();
		assertEquals(result,0);
		
	}
	
		
	@Test
    public void testPlayerDrink(){
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		
		when(p.drink()).thenReturn(true);
	    int result = g.doSomething("D");
	    
	    verify(p,times(1)).drink();
		assertEquals(result,1);
	    
	    
	    
//	    boolean finalStatus = p.drink();
//		   if (finalStatus){
			    assertEquals(result,1);
//		}
//		   else {
//			    assertEquals(result,-1);
		}
		
		
	}
	
	
	
	//@Test
	//public void testHasItem(){
		//Room r = new Room(true, true,true,true,true);
		//boolean returnval=r.hasItem();
		//assertEquals(returnval,true);
	//}

			
		
		
		
		

    
	
	



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
		
		//Execution 
		int result = g.doSomething("N");
		verify(h,times(1)).moveNorth();
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
	
//		stub the 'drink', giving a new return.
//		get the only one result.		
	
	@Test
    public void testPlayerDrink(){
		Player p = mock(Player.class);
		House h = mock(House.class);
		Game g = new Game(p,h);
		
		when(p.drink()).thenReturn(true);
	    int result = g.doSomething("D");
	    
	    verify(p,times(1)).drink();
		assertEquals(result,1);
	    
	  }
	
	    //enter any other letter.
	    // the return value always be 0.
		@Test
		public void testwhat() {
			Player p = mock(Player.class);
			House h = mock(House.class);
			Game g = new Game(p,h);
			
			int result = g.doSomething("f");
			assertEquals(result,0);
			
		}
		
		
	}
	
	
	
	

			
		
		
		
		

    
	
	



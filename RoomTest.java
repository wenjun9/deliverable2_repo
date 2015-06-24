import static org.junit.Assert.*;

import org.junit.Test;

//import static org.mockito.Mockito.*;

public class RoomTest {
	
	@Test
	public void testhasItem(){
		
		Room r = new Room(true,false,false,true,true);
		boolean result = r.hasItem();
		assertEquals(result,true);
				 	
	}
	
	@Test
	public void testhasSugar(){
		
		Room r = new Room(true,false,false,true,false);
		boolean result = r.hasSugar();
		assertEquals(result,false);
				 	
	}
	
	@Test
	public void testhasCream(){
		
		Room r = new Room(true,false,false,true,false);
		boolean result = r.hasCream();
		assertEquals(result,false);
				 	
	}
	
	@Test
	public void testhasCoffee(){
		
		Room r = new Room(true,false,false,true,false);
		boolean result = r.hasCoffee();
		assertEquals(result,true);
				 	
	}
	
	@Test
	public void testnorthExit(){
		
		Room r = new Room(true,false,false,true,false);
		boolean result = r.northExit();
		assertEquals(result,true);
				 	
	}
	
	@Test
	public void testsouthExit(){
		
		Room r = new Room(true,false,false,false,false);
		boolean result = r.southExit();
		assertEquals(result,false);
				 	
	}
	
	
	@Test
	public void testgetDescription(){	
	   Room r = new Room(false,true,false,true,false);
       String result  = r.getDescription();
       boolean containsRoom = result.contains("room");
       assertTrue(containsRoom);
	}
	
				

		
}
	
	
	
	



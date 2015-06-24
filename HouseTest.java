import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class HouseTest {

	
	@Test
	
	public void testGetDescription() {
		Room r = mock(Room.class);
		when(r.getDescription()).thenReturn("Test");
		Room[] rooms = new Room[1];
		rooms[0] = r;
		House h  = new House (rooms);
		String result = h.getCurrentRoomInfo();
		assertEquals(result,"Test");
	
		
	}
	
	@Test
	
	public void testgetCurrentRoomInfo(){
		Room r = mock(Room.class);
		House nh  = new House (1);
		Room[] rooms = new Room[1];
		rooms[0] = r;
		nh.moveNorth();	
		String result = nh.getCurrentRoomInfo();
		assertEquals(result,"You are in a magical land!  But you are returned to the beginning!");	
		
	}
	
	@Test
	
	public void testGenerateRooms0(){
		House nh  = new House (6);
		Room[] r = nh.generateRooms(6);
		
		boolean result = r[0].hasCream();
		assertEquals(result,true);
		
	}
	
    @Test
	
	public void testGenerateRooms1(){
		House nh  = new House (6);
		Room[] r = nh.generateRooms(6);
		
		boolean result = r[2].southExit();
		assertEquals(result,true);
		
	}
	
    @Test

    public void testGenerateRooms2(){
	     House nh  = new House (6);
	     Room[] r = nh.generateRooms(6);
	
	     boolean result = r[2].hasCoffee();
	     assertEquals(result,true);
	
     }
    
    @Test

    public void testGenerateRooms3(){
	     House nh  = new House (6);
	     Room[] r = nh.generateRooms(6);
	
	     boolean result = r[5].hasSugar();
	     assertEquals(result,true);
	
     }
	
    @Test

    public void testGenerateRooms4(){
	     House nh  = new House (6);
	     Room[] r = nh.generateRooms(6);
	
	     boolean result = r[5].northExit();
	     assertEquals(result,false);
	
     }
    
    
    
    
}

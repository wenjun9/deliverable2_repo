import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class HouseTest {

	//mock the room. and settle the function of the room
	//stub "getDescription",return a new result
	
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
	
	//if the house only have one room
	//when you movenorth ,there is not more room
	//so the result must be the output string
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
	
//	create a new house, and settle the number of the rooms
//	give the specific room number
//	then the get the different result of the items
	
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

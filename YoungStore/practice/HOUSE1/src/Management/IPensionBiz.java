package Management;

public interface IPensionBiz {
	
	public void checkIn(String roomId, String custName, String custPhone) throws Exception;
	
	
	public void checkOut(String roomId) throws Exception;
	
	
	public void initiallizeRoomData();
	
	
	public void roomList();
}

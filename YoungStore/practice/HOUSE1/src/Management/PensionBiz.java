package Management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import House.Customer;
import House.RoomType;
import House.Standard;
import House.Sweet;

public class PensionBiz implements IPensionBiz {
	
	private ArrayList<HashMap<String , Object>> data;

	@Override
	public void checkIn(String roomId, String custName, String custPhone) throws Exception {
		// 방번호가 숫자가 아닌 경우 
		try {
			Integer.parseInt(roomId);
		} catch(Exception e) {
			throw new RuntimeException("[에러] 방 번호는 숫자로 입력하세요.");
	}

	Customer.index = 201;
	boolean finedRoom = false;
	for (HashMap<String, Object> roomInfo: data) {
		RoomType room = (RoomType)roomInfo.get(roomId);
		if (room == null) {
			continue;
		} 
		// 투숙객 검사
		Set<String> keys = roomInfo.keySet();
		if (keys.size() > 1) {
			throw new RuntimeException("[에러] 이미 투숙 중인 방입니다.");
		} else {
			roomInfo.put(String.valueOf(Customer.index), new Customer(custName, custPhone));
			finedRoom = true;
			break;
		}
	}
	// 방을 못찾았을 시
	if (!finedRoom) {
		throw new RuntimeException("[에러] 정확한 방 번호를 입력하세요.");
	} else {
		System.out.println("@ 예약되었습니다.");
	}
}

	@Override
	public void checkOut(String roomId) throws Exception {
		// 방번호가 숫자가 아닌 경우 
		try {
			Integer.parseInt(roomId);
		} catch(Exception e) {
			throw new RuntimeException("[에러] 방 번호는 숫자로 입력하세요.");
		
	}

	Customer.index = 201;
		boolean finedRoom = false;
		for (HashMap<String, Object> roomInfo: data) {
			RoomType room = (RoomType)roomInfo.get(roomId);
			if (room == null) {
				continue;
			} 
			// 투숙객 검사
			Set<String> keys = roomInfo.keySet();
			if (keys.size() < 2) {
				throw new RuntimeException("[에러] 이미 퇴실되있습니다.");
			} else {
				roomInfo.remove(String.valueOf(Customer.index));
				finedRoom = true;
				break;
			}
		}
		// 방을 못찾았을 시
		if (!finedRoom) {
			throw new RuntimeException("[에러] 정확한 방 번호를 입력하세요.");
		} else {
			System.out.println("@ 퇴실되었습니다.");
		}
	}

	/**
	 * 모든 방의 정보를 초기화
	 */

	@Override
	public void initiallizeRoomData() {
		
		data = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> room101 = new HashMap<String, Object>();
		room101.put("101", new Standard());
		data.add(room101);
		
		HashMap<String, Object> room102 = new HashMap<String, Object>();
		room102.put("102", new Standard());
		data.add(room102);
		
		HashMap<String, Object> room103 = new HashMap<String, Object>();
		room103.put("103", new Standard());
		
		data.add(room103);
		HashMap<String, Object> room104 = new HashMap<String, Object>();
		room104.put("104", new Sweet());
		data.add(room104);
		
		HashMap<String, Object> room105 = new HashMap<String, Object>();
		room105.put("105", new Sweet());
		data.add(room105);
		
	}

	@Override
	public void roomList() {
		
		for (HashMap<String, Object> roomInfo: data) {
			Object[] infos = new Object[2];
			String roomId = "";
			for (Map.Entry<String, Object> info: roomInfo.entrySet()) {
				String key = info.getKey();
				if (key.equals(String.valueOf(Customer.index))) {
					infos[1] = info.getValue().toString();
				} else {
					infos[0] = info.getValue().toString();
					roomId = key;
				}
			}
			System.out.println(roomId + "호 : " + infos[0] + " " + (infos[1] == null ? "" : infos[1]));
		}
		
	}
	
}

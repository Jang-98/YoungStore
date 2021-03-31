package MainTest;

import Management.IPensionBiz;
import Management.PensionBiz;
import Util.WorkshopUtil;

public class PensionTest {

	public static void main(String[] args) {

		IPensionBiz biz = new PensionBiz(); // 객체 생성(IPensionBiz 참조타입)
		biz.initiallizeRoomData();
		while(true){
			try {
				WorkshopUtil.printHeader();			
				String input = WorkshopUtil.getUserInput("# 메뉴를 입력하세요 >> ");
				
				switch(input) {
				case "0": // 종료
					System.out.println("Bye~ Bye");
					System.exit(0);
					break;
				case "1": // 전체 방 조회
					biz.roomList();
					break;
				case "2": // 입실
					String inRoomId = WorkshopUtil.getUserInput("투숙하실 방 번호를 입력하세요. >>");
					String custName = WorkshopUtil.getUserInput("고객님의 이름을 입력하세요 >> ");
					String custPhone = WorkshopUtil.getUserInput("고객님의 전화번호를 입력하세요 >> ");
					biz.checkIn(inRoomId, custName, custPhone);
					break;
				case "3": // 퇴실
					String outRoomId = WorkshopUtil.getUserInput("퇴실하실 방 번호를 입력하세요. >>");
					biz.checkOut(outRoomId);
					break;
				default:
					System.out.println("메뉴가 없습니다.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
		}
	}
}

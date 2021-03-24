package House;

public class RoomType {
	
	private int price;
	private int roomSize;
	
	public RoomType(int price, int roomSize) {//생성자

		this.price = price; //this.price은 필드, price은 매개변수
		this.roomSize = roomSize; //this.roomSize은 필드, roomSize은 매개변수
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer(); // Stringbuffer(문자열 추가 및 변경) 생성자 호출
		sb = sb.append("("); //append 이용하여 문자열 추가
		sb = sb.append(this.roomSize);//append 이용하여 계속해서 문자열 추가
		sb = sb.append("평/");//append 이용하여 계속해서 "평/" 문자열 추가
		sb = sb.append(this.price);//append 이용하여 계속해서 문자열 추가
		sb = sb.append("원)"); //append 이용하여 계속해서 "원)" 문자열 추가

		return sb.toString(); // String 자료형으로 변경하여 값 리턴

	}
	
}

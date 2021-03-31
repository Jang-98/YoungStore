package House;

public class Standard extends RoomType{ // RoomType 클래스를 상속 받도록 extends로 정의
	

	// 생성자 구현
	public Standard() {
		
		super(80000,14); // 객체 생성, 가격은 80000, 평수는 14평
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(); // Stringbuffer(문자열 추가 및 변경) 생성자 호출
		sb = sb.append("스탠다드룸 "); //append 이용하여 "스탠다드룸" 문자열 추가
		sb = sb.append(super.toString()); // 가격과 사이즈에대한 문자열 조합은 부모클래스의 toString()메소드 를이용
		return sb.toString(); // String 자료형으로 변경하여 값 리턴

	}
	
}

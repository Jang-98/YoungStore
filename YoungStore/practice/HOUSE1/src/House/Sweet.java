package House;

public class Sweet extends RoomType{ // RoomType 클래스를 상속 받도록 extends로 정의
	
	public Sweet(){ //생성자
		
		super(260000,30); // 객체 생성, 가격은 260000, 평수는 30평
		
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(); // Stringbuffer(문자열 추가 및 변경) 생성자 호출
		sb = sb.append("스위트룸 "); //append 이용하여 "스위트룸" 문자열 추가
		sb = sb.append(super.toString()); // 가격과 사이즈에대한 문자열 조합은 부모클래스의 toString()메소드 를이용
		return sb.toString(); // String 자료형으로 변경하여 값 리턴

	}
	

}

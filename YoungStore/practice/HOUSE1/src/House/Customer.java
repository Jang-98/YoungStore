package House;

public class Customer {
	
	private String name;
	private String phone;
	
	public static int index =0;
	
	public Customer(String name, String phone) { //생성자
		this.name = name; //this.name은 필드, name은 매개변수
		this.phone = phone; //this.phone은 필드, phone은 매개변수
		// this.은 관리하기가 편하기 때문에 this. 으로 구분하는 것이 편리
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(); // Stringbuffer(문자열 추가 및 변경) 생성자 호출
		sb = sb.append("현재 투숙객 - [이름] "); //append 이용하여 "현재 투숙객 - [이름] " 문자열 추가
		sb = sb.append(this.name);//append 이용하여 계속해서 문자열 추가
		sb = sb.append(" [전화번호] ");//append 이용하여 계속해서 " [전화번호] " 문자열 추가
		sb = sb.append(this.phone);//append 이용하여 계속해서 문자열 추가
		
		return sb.toString(); // String 자료형으로 변경하여 값 리턴
	}
	

}

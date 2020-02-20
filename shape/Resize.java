package shape;
/**
 * 
 * @author admin
 * 인터페이스란 무엇인가
 * 
 * 인터페이스 : 객체의 사용 방법을 정의한 타입
 * 			  개발코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출
 * 			 상수와 메소드만을 구성멤버로 가짐.
 * 			 객체생성 x, 생성자 x
 */
public interface Resize {
	public void setResize(int size); // 추상메소드 선언
}

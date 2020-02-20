package workshop3;
/**
 * 
 * @author admin
 * 
 * 반복문안에서 변수를 초기화하는 것과
 * 전역변수로 초기화하는 것의 차이
 * 
 * 지역변수와 전역변수가 각각 영향을 주는 범위를 정확하게 알 것
 * 
 */

public class Test02 {
	// 여기서 선언하는건 필드 -> 전역변수
	// 밑에 메인함수에서 지정하는건 메인함수의 지역변수가 됨
	
	public static void main(String[] args) {
		//1부터 10까지 별찍기
		int i=1;	// 행
		int j;	// 열
		/*
		 * 전역변수상태에서 초기화가되면 while안에서 같은 변수가 사용되었을 때
		 * 초기화된 값만 읽을뿐 계산에 영향을 주지 못한다.
		 */
		
		while(i<10) {	//	 바깥 for문
			j=1;	// while바깥에서 초기화하면 왜 결과가 다른가(해결)
			
			while(j<=i) {	// 안쪽 for문
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	
	}

}

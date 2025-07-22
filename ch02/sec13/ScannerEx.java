package ch02.sec13;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in); // 입력 받음
		
		System.out.print("x 값 입력 : "); // 줄바꿈 없이 print
		String strX = scanner.nextLine(); // 엔터 입력 전까지의 문자열 strX에 저장
		
		int x = Integer.parseInt(strX); // 입력받은 문자열 정수로 변환 저장
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println(); // 단순 엔터
		
		while(true) { // 중괄호 안을 무한히 반복 실행
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			
			if(data.equals("q")) {  // 입력된 문자열이 q라면. 
                                    // 기본 타입 값은 == 사용,
                                    // String 타입 값은 equlas()를 사용해 비교
				break; // 반복 중지
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
    }
}

/*
Scanner : 입력 받는 방법 중 가장 쉬운 방법
    이용( ex가 Scanner 변수명 )
        클래스 선언 위에 import java.util.Scanner;
            컴파일러에게 Scanner가 뭔지 알림. (6장에서 자세히 설명)

        Scanner 타입 변수 선언 : Scanner ex = new Scanner(System.in);
            new 연산자(6장)로 생성한 Scanner 객체를 대입
                => 입력 받는 기능 메소드 가진 객체 생성!

        Scanner 변수 이용 : String strx = ex.nextLine()
            입력된 내용을 문자열로 받아 좌측 변수에 저장함.
            엔터 입력 전 - 블로킹, 대기 상태
            엔터 입력 후 - 그 전까지 입력된 모든 내용을 문자열로 읽음
  
            (+) 정수 입력 - nextInt(), 다른 기본타입 전용 메소드도 있음
                * 주의! 이후 nextLine() 호출 시 남은 \n로 인해 빈 줄 입력 처리 가능.
        
        Scanner 변수 닫기 : ex.close();
            * 주의! System.in이 닫혀 이후 입력 불가. 보통 한 번만 생성 & 닫음
*/

package ch01.sec09; 	// 바이트코드 파일 위치할 **패키지 선언**

public class Hello {						 // Hello 클래스 선언
	public static void main(String[] args) { // main()메소드 선언
		System.out.println("Hello Java");  // 콘솔 출력 코드
	}
}

/*
패키지 선언
	ch01/sec09가 패키지

클래스 선언
	Hello가 클래스명
	클래스명: 숫자 시작 X, 공백 포함 X, 소스파일명과 대소문자 완전 일치
	클래스 블록{} 내에 클래스 정의 내용 작성

main() 메소드
	: public static void main(String[] args) {...}
	바이트코드 파일 실행 시 main() 메소드 블록 실행됨
		=> main()메소드를 프로그램 실행 진입점이라 부름

System.out.println("Hello, java"); -> console 뷰에 출력하는 코드
*/
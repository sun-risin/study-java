package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {		
		char var1= 'A';
		char c1 = 65;
		
		char var2 = '가';
		char c2 = 44032;
		
		System.out.println(var1 + " == " + c1);
		System.out.println(var2 + " == " + c2);

		
		//char 타입 변수에 어떤 문자도 대입하지 않고 단순 초기화	
		char C = ' '; //이게 옳은 예시,
		//char C = ''; 이것은 컴파일 에러가 되는 잘못된 예시.
		
		char C1; // 선언
		C1 = 'B'; // 할당
		System.out.println(C);
		System.out.println(C1);
	}

}

/*
문자 리터럴
    작은 따옴표 -> 문자 하나
    큰 따옴표 -> 두 글자 이상
    유니코드(정수)로 변환되어 저장 
        (=> char은 정수타입에 해당, 유니코드 숫자 직접 대입 가능)

대입 안 하고 단순 초기화: char v = ' ';
    작은 따옴표를 이어 붙이면 컴파일 에러. 무조건 공백 하나 넣어야 함.
 */

 /*
  추후 String 배움
  */
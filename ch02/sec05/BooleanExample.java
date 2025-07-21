package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		
        // 조건문에 사용
		boolean stop = true;
		if (stop) { //stop이 true이면 해당 블록 실행
			System.out.println("중지합니다.");
		} else { //stop이 false일 때 해당 블록 실행
			System.out.println("시작합니다.");
		}
		
		
		// 비교 연산식 산출값 대입
		int x = 10;
		boolean result1 = (x==20);
		boolean result2 = (x!=20);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}
}

/*
boolean 타입 변수
    논리 리터럴: true or false로 두 가지
    두 가지 상태값 저장할 때 사용
    조건문, 제어문 흐름 변경 시 사용 가능

    연산식의 비교 및 논리 연산 산출값 대입 가능 (결과값이 논리 리터럴)

 */
package ch02.sec06;

public class StringEx {
    public static void main(String[] args) {
		String name = "James";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
        // 이스케이프 문자 이용 예시
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.");
    }
}

/*
String 타입
    "로 감싼 문자들, 즉 문자열을 변수에 저장할 때 이용
    자바 기본 타입에 속하지 않는 참조 타입 (5장에 상세 설명 있음)

이스케이프 문자 (역슬래쉬, \)
    문자열 내부에 이용 시 특정 문자를 포함 or 출력에 영향 가능
    이외 사용 예시는 교재 50p 확인
*/
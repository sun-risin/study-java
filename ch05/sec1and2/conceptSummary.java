package ch05.sec1and2;

public class conceptSummary {
    public static void main(String args[]){
        // 기본타입
        int age = 25;
        double price = 100.5;
        System.out.println("age와 price에는 각각의 값 자체가 저장돼있음");
        System.out.printf("age: %d, price: %.1f\n\n", age, price);

        // 참조 타입
        String name = "신용권";
        String hobby = "독서";
        System.out.println("String은 참조 타입, 메모리 번지가 저장됨");
        System.out.printf("name: %s, hobby: %s\n", name, hobby);
        System.out.println("스택 영역에 메모리 번지 저장,\n힙 영역에서 메모리 번지를 찾아가 보면 각 값이 저장돼 있음");
    }
}

/*
5.1 데이터타입 분류 - 기본 타입 / 참조 타입
    앞서 배운(int, byte, char, boolean, float 등) 건 기본타입
    
    참조 타입: 배열 / 열거 / 클래스 /인터페이스

    (+) 객체? : 데이터(필드)와 메소드로 구성된 덩어리

    기본과 참조의 차이 = 저장되는 값
        기본: 값 자체 저장
        참조: 객체가 생성된 메모리 번지 저장

        
5.2 메모리 사용 영역
    java 명령어로 JVM 구동 시 운영체제에서 할당받은 메모리 영역을 구분해 사용
    : 메소드 영역 / 힙 영역 / 스택 영역

    *메소드 영역
        바이트 코드 파일을 읽은 내용이 저장되는 영역
        클래스별로 상수, 정적 필드, 메소드 코드, 생성자 코드 등이 저장됨

    *힙 영역
        객체가 생성되는 영역
        객체 번지: 메소드 영역과 스택 영역의 상수와 변수에서 참조 가능

    *스택 영역
        메소드를 호출할 때마다 생성되는 프레임이 저장되는 영역
        메소드 호출 종료 시 프레임은 자동 제거됨
        프레임 내부: 로컬 변수 스택 존재, 기본 타입 변수와 참조 타입 변수 생성되고 제거됨
*/
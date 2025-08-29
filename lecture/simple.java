package lecture;

public class simple {
    // 사용자 함수는 이 위치에 만듦
    // return 타입 함수이름 (매개변수) {}
    void gugudan(int n){
        for(int i =1; i<10 ; i++){
            System.out.println(n+" * "+i+" = " + (n*i));
        }
    }

	public static void main(String[] args) {

        //변수 만들기 자료 타입 변수명 = 값;
        String lover = "boging";
        // System.out.println(lover);
        //타입 적기 귀찮으면 var 키워드 쓰기 가능함 (Java 10 이상 가능)
        var age = 22; // 유추해서 알아서 맞춰줌~ var 잘 안씀...
                        // kotlin에선 많이 씀
        // final 키워드 - 변수 값 변경 불가능 (static 같네)
        final String lastLover = "boging"; // 변경 방지 가능


        var test = new Test(); // 클래스 복사본(==object) 쓰겠다~
        // 혹은 Test test = new Test(); 가능. 즉 클래스 이름 이 변수 타입이 됨
        System.out.println(test.name); // 클래스 내부 name변수 쓸 수 있음
        test.hello(); // 함수 사용
	}
}

// class 만들기
// -> 쓰는 이유: 관련 변수 함수 한 곳에 정리 가능(깔끔)
            // +중요 원본데이터 지키기 가능 등
class Test {
    String name = "park";
    void hello(){
        System.out.println("hello"); // sout+엔터 치면 자동으로 된대 미친
    }

    // 참고
    // class 안 변수 -> field 혹은 attribute라고 부름
    // 함수 -> 메소드라고 함

    // static, private, protected 등
    // -> new로 복사 안되는 변함수 제작, 복사 안해도 쓸 수 있는 변함수 제작 가능
}

class friend{
    String name = "kim";
    int age = 20;

    // constructor 문법: 비슷한 class를 여러 개 만드는 대신 사용
    // 다른 변수값을 가진 object들을 여러 개 만들 수 있게 해줌
    friend(String n){ // 생성자 함수 "constructor"
        this.name = n; // 새로 생성될 object의 이름 지정
    }
}

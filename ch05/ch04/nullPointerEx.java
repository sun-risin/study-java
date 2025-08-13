package ch05.ch04;

public class nullPointerEx {
    public static void main(String args[]){
        String hobby = "여행";
        hobby = null; // "여행"에 해당하는 String 객체는 쓰레기 됨

        String kind1 = "자동차";
        String kind2 = kind1; // kind1에 저장된 번지를 kind2에 대입
        kind1 = null;         // "자동차" String 객체는 쓰레기 아님 
        System.out.println("kind2: " + kind2);
        // kind2가 여전히 "자동차" 값의 번지를 참조 중이라 쓰레기가 아님!
    }
}

/*
null과 NullPointerException(예외)
    참조 타입: null값 가지기 가능 == 아직 번지 저장 X
        => null로 초기화된 참조 변수는 스택 영역에 생성됨
            이 경우 단순 비교 연산으로 null인지 아닌지 구분가능
            (ex) var1 == null (var1이 null값이라면 true, 아니면 false)
        
            이 객체를 쓰레기 취급, 가비지 콜렉터 실행되어 자동 제거됨.
            == 객체 제거하는 유일 방법: 객체의 모든 참조 없애기 (null 만들기)
    
    NullPointerException
    : 객체 null인데 데이터나 메소드 사용하려 할 때 발생하는 오류(예외)
        (ex) .length() / arr1[0] = 2; ...
    
*/
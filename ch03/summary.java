package ch03;

public class summary {
    public static void main(String args[]){
        // 증감 연산 순서
        int a = 1; int b = 1;
        int res1 = ++a + 10; // 12 저장됨, a는 2
        int res2 = b++ + 10; // 11 저장됨, b는 2
        System.out.printf("res1: %d res2: %d\n", res1, res2);

        // 나눗셈 NaN, Infinity 처리
        int x = 5;
        double y = 0.0;

        double z = x / y;

        if(Double.isInfinite(z) || Double.isNaN(z)){ // or 씀
            System.out.println("값 산출 불가");
        } else{
            System.out.println(z+2);
        }

    }
}

/*
3장 연산자
    사칙연산: +-/*
    증감: ++, -- (앞에 붙이면 다른 연산보다 먼저, 뒤에 붙이면 나중)
    나머지: %
    비교: ==, !=, >, >=, <, <=
    문자열 비교: equals()
        str1.equals(str2) -> 같은지
        ! str1.equals(str2) -> 다른지
    논리: && or & / || or | / ^ / !
    비트논리, 비트이동 걍 건너뜀
    대입 연산자: 파이썬처럼 가능
    삼항 조건 연산자 있음 (조건 ? A(true) : B(false))

    언더 플로우 or 오버 플로우 시 해당 타입의 최소/최대값으로 돌아감

    나눗셈 후 NaN, Infinity 처리
        두 경우인지 아닌지 확인 후 연산 수행하는 것이 좋음
        확인: Double.isInfinite(), Double.isNaN()

    연산 방향 및 우선순위
        방향 - 증감, 부호, 비트, 논리는 왼쪽, 나머지는 오른쪽
        우선순위
            증감, 부호, 비트, 논리
            * / %
            + -
            쉬프트
            크기 비교
            동일 비교
            &
            ||
            &&
            ||
            삼항 조건
            대입
*/
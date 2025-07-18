package ch02.sec02;

public class IntegerTypes {
    public static void main(String[] args){
        int ivar1 = 0b1011; //2진수
        int ivar2 = 0206;   //8진수
        int ivar3 = 365;    //10진수
        int ivar4 = 0xB3;   //16진수

        byte bvar = 30;

        long lvar1 = 10;
        long lvar2 = 20L;
        long lvar3 = 100000000000L;

        System.out.println("ivar1: " + ivar1);
        System.out.println("ivar2: " + ivar2);
        System.out.println("ivar3: " + ivar3);
        System.out.println("ivar4: " + ivar4);

        System.out.println("bvar: " + bvar);

        System.out.println("lvar1: " + lvar1);
        System.out.println("lvar2: " + lvar2);
        System.out.println("lvar3: " + lvar3);
    }
}


/*
진수에 따른 정수 리터럴 작성 방법 (형식에 맞춰 작성 필요)
    2진수 - 0b 또는 0B로 시작하고 0과 1
    8진수 - 0으로 시작하고 0~7
    10진수 - 소수점 없는 0~9
    16진수 - 0x 또는 0X로 시작하고 0~9 또는 ABCDEF 또는 abcdef

    => println에서 변수로 출력하면 10진수로 출력됨


()안은 메모리크기
int (32bit)
    기본적으로 컴파일러는 정수리터럴을 int 타입 값으로 간주함

type (8bit), 허용범위 -128~127

long (64bit)
    은행이나 과학분야에서 사용되는 프로그램
    int 타입 허용 범위를 초과하는 리터럴?
        소문자 l이나 대문자 L을 붙여 long타입인 걸 알려야 함
        (안 알리면 컴파일러가 int로 알고 컴파일 에러 일으킴)
		// int 타입 허용 범위 : -2147483648 ~ 2147483647

이외: char(유니코드 0~65535), short
 */
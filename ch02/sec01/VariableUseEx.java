package ch02.sec01;

public class VariableUseEx {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;
        System.out.println(hour + "시간 " + min + "분");
        System.out.println("총 " + (hour*60 + min) + "분");
    }
}

/*
 + 연산자로 문자열과 변수 이어 출력 가능, 공백 없이 붙여짐
 */
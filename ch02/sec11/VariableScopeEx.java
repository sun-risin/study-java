package ch02.sec11;

public class VariableScopeEx {
    public static void main(String[] args) {

		int v1 = 15; //메소드 블록 첫머리에서 선언, 어디서든 가능
		if(v1>10) {
			int v2 = v1 - 10; //메소드 블록(밖)에서는 사용 불가

            System.out.println(v2);
		}
		// int v3 = v1 + v2 + 5; // v2 때문에 컴파일 에러
    }
}

/*
 * 조건문, 반복문 등의 블록 내 선언된 변수는 해당 블록에서만 사용 가능,
   => 밖(메소드 블록)에서는 사용 불가하다

메소드 블록 전체에서 사용?
    -> 메소드 블록 첫머리에 선언하는 것이 좋다

특정 블록 내부에서만 사용?
    -> 해당 블록 내에서 선언하는 것이 좋다
*/
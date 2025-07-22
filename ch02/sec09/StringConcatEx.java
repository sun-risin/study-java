package ch02.sec09;

public class StringConcatEx {
    public static void main(String[] args){
		//숫자 연산 (덧셈 연산)
		int res1 = 10 + 2 + 8;
		System.out.println("res1: " + res1);
		
		
		// 덧셈 결합과 결합 연산
		String res2 = 10 + 2 + "8";  // 덧셈 -> 결합
		System.out.println("res2: " + res2);
		
		String res3 = 10 + "2" + 8;  // 결합 연산만
		System.out.println("res3: " + res3);
		
		String res4 = "10" + 2 + 8;  // 결합 연산만
		System.out.println("res4: " + res4);
		
		
		// 덧셈 결합 먼저 우선 시행됨
		String res5 = "10" + (2 + 8); // 덧셈 -> 결합
		System.out.println("res5: " + res5);
    }
}

/*
덧셈 연산 -> 숫자 + 숫자

결합 연산 -> 문자열 + 아무거나

숫자, 문자열 여러 개 있는 +연산자 연산식
    앞에서부터 차례대로 +연산 진행

    덧셈 연산이 먼저 올 경우, 덧셈한 후 결합 연산 시 결합 진행
    결합 연산이 먼저 올 경우, 모두 결합 연산.

    우선 연산되었으면 하는 부분을 소괄호로 감싸면 그 부분이 먼저 수행됨
*/
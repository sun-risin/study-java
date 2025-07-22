package ch02.sec12;

public class PrintEx {
    public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //정수, 줄바꿈
		System.out.printf("상품의 가격:%6d원\n", value); //6자리 정수, 왼쪽 빈자리 공백, 줄바꿈
		System.out.printf("상품의 가격:%-6d원\n", value); //6자리 정수, 오른쪽 빈자리 공백, 줄바꿈
		System.out.printf("상품의 가격:%06d원\n", value); //6자리 정수, 왼쪽 빈자리 0 채움, 줄바꿈

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); //정수, 정수7자리+소수점+소수2자리, 왼쪽 빈자리 공백, 줄바꿈
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);//6자리 정수, 10자리 문자열 오른쪽 빈공백, 10자리 문자열 왼쪽 빈공백, 줄바꿈
    }
}

/*
 * 출력 방법에 따라 다른 형식의 출력문을 사용한다

println: 괄호 안 내용 출력, 행을 바꿈

print: 괄호 안 내용 출력, 행은 안 바꿈

printf: 형식 문자열에 맞추어 뒤의 값을 출력
    포맷
        % [argument_index$] [flags] [width] [.precision] conversion
        문자열 시작, 값의 순번, - or 0, 전체 자릿수, 소수 자릿수, 변환 문자
        
        **필수 작성** : %, conversion
            % - 문자열의 시작 의미. 
            conversion - 제공되는 값의 타입에 따라 d(정수), f(실수), s(문자열)

        나머지
            값 순번 - 형식 문자열에 값이 두 개 이상일 경우 작성. (ex) 1$: 첫 번째 값.
            flags - 빈 공간을 채우는 방법.
                생략 시 왼쪽, -는 오른쪽이 공백으로 채워짐
                0을 쓰면 공백 대신 0으로 왼쪽 채움 (오른쪽 0채우기는 안됨)
            width - 소수점을 포함한 전체 자릿수
            .precision - 소수 이하 자릿수
    
    \n - 줄바꿈, \t - 탭, %% - %
*/